class RunnableImp implements Runnable
{
	private Thread curThread;
	RunnableImp(String threadName)
	{
		curThread = new Thread(this, threadName);
		System.out.println("New thread created: " + curThread);
	}
	Thread getThread()
	{
		return curThread;
	}
	public void run()
	{
		try
		{
			for(int i=0; i<5; i++)
			{
				System.out.println(curThread + ": " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(curThread + " - interrupted");
		}
		System.out.println("Exiting from " + curThread);
	}
}

class ThreadExtend extends Thread
{
	ThreadExtend(String threadName)
	{
		super(threadName);
	}
	public void run()
	{
		try
		{
			for(int i=0; i<5; i++)
			{
				System.out.println(this + ": " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(this + " - interrupted");
		}
		System.out.println("Exiting from " + this);
	}
}

class SharedObj
{
	synchronized void SyncMeth(String msg)
	{
		System.out.print("[ " + msg);
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println(" ]");
	}
	void nonSyncMeth(String msg)
	{
		System.out.print("[ " + msg);
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		System.out.println(" ]");
	}
}
class IndObj implements Runnable
{
	Thread th;
	SharedObj shared;
	String msg;
	IndObj(SharedObj so, String msg)
	{
		shared = so;
		this.msg = msg;
		th = new Thread(this);
	}
	public void run()
	{
		shared.SyncMeth(msg);
		synchronized(shared)
		{
			shared.nonSyncMeth(msg);
		}
	}
}

class Queue
{
	int data;
	boolean valueSet = false;
	
	synchronized void put(int data)
	{
		while(valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
		this.data = data;
		valueSet = true;
		System.out.println("Put: " + data);
		notify();
	}
	synchronized int get()
	{
		while(!valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted");
			}
		}
		System.out.println("Got: " + data);
		valueSet = false;
		notify();
		return data;
	}
}

class Producer implements Runnable
{
	Queue qu;
	Thread th;
	Producer(Queue q)
	{
		qu = q;
		th = new Thread(this, "Producer");
	}
	public void run()
	{
		int i = 0;
		while(true)
		{
			qu.put(i++);
		}
	}
}

class Consumer implements Runnable
{
	Queue qu;
	Thread th;
	Consumer(Queue q)
	{
		qu = q;
		th = new Thread(this, "Consumer");
	}
	public void run()
	{
		while(true)
		{
			qu.get();
		}
	}
}

class SyncObjA
{
	synchronized void firstMeth(SyncObjB b)
	{
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " inside A.first()");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("Trying to call B.last()");
		b.lastMeth();
	}
	synchronized void lastMeth()
	{
		System.out.println("Inside A.last()");
	}
}

class SyncObjB
{
	synchronized void firstMeth(SyncObjA a)
	{
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " inside B.first()");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		System.out.println("Trying to call A.last()");
		a.lastMeth();
	}
	synchronized void lastMeth()
	{
		System.out.println("Inside B.last()");
	}
}

class Deadlock implements Runnable
{
	Thread th;
	SyncObjA a;
	SyncObjB b;
	Deadlock()
	{
		a = new SyncObjA();
		b = new SyncObjB();
		th = new Thread(this, "Racing thread");
		Thread.currentThread().setName("Main thread");
	}
	void deadlockStart()
	{
		th.start();
		a.firstMeth(b);
		System.out.println("Back in Main thread");
	}
	public void run()
	{
		b.firstMeth(a);
		System.out.println("Back in Racing thread");
	}
}

class ImpExamples
{
	void isAllive_join_priority()
	{
		Thread runnableThread, extendedThread;
		extendedThread = new ThreadExtend("Extended Thread");
		runnableThread = new RunnableImp("Runnable Thread").getThread();
		
		System.out.println(runnableThread + " is alive: " + runnableThread.isAlive());
		System.out.println(extendedThread + " is alive: " + extendedThread.isAlive());
		
		System.out.println(runnableThread + " has priority: " + runnableThread.getPriority());
		System.out.println(extendedThread + " has priority: " + extendedThread.getPriority());
		
		runnableThread.setPriority(6);
		extendedThread.setPriority(3);
		
		System.out.println(runnableThread + " has priority: " + runnableThread.getPriority());
		System.out.println(extendedThread + " has priority: " + extendedThread.getPriority());
		
		extendedThread.start();
		runnableThread.start();
				
		runnableThread.setPriority(Thread.MIN_PRIORITY);
		extendedThread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(runnableThread + " has priority: " + runnableThread.getPriority());
		System.out.println(extendedThread + " has priority: " + extendedThread.getPriority());
		
		try
		{
			runnableThread.join();
			extendedThread.join();
		}catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println(runnableThread + " is alive: " + runnableThread.isAlive());
		System.out.println(extendedThread + " is alive: " + extendedThread.isAlive());
	}
	
	void syncExample()
	{
		SharedObj objShare = new SharedObj();
		IndObj obj1 = new IndObj(objShare, "obj1");
		IndObj obj2 = new IndObj(objShare, "obj2");
		IndObj obj3 = new IndObj(objShare, "obj3");
		obj1.th.start();
		obj2.th.start();
		obj3.th.start();
		try
		{
			obj1.th.join();
			obj2.th.join();
			obj3.th.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
	
	void intrThreadComm()
	{
		Queue queue = new Queue();
		Producer pro = new Producer(queue);
		Consumer con = new Consumer(queue);
		pro.th.start();
		con.th.start();
		System.out.println("Press ctrl+c to exit");
	}
}