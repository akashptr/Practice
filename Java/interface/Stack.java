//interface practice.
interface Stack
{
	void push(int data);
	void pop();
	interface NestedIf
	{
		void checkSize(int size);
	}
}

/*class Queue
{
	private int queue[];
	private short front, rear;
	interface funcs
	{
		void insertion(int data);
		void deletion();
		void show();
	}
	private interface initializer
	{
		void initialize(int size);
	}
}

class NormalQueue implements Queue.funcs
{
	Queue qu = new Queue();
	void insertion(int data)
	{
		qu.queue = new int[data];
	}
}*/

interface SharedConstant
{
	byte NO = 0;
	byte YES = 1;
	byte MAYBE = 2;
	byte SOON = 2;
	byte LATER = 4;
	byte NAVER = 5;
}

interface SuperIf
{
	void meth1();
	default void meth2()
	{
		System.out.println("No implementation is provided");
	}
}

interface SubIf extends SuperIf
{
	void meth3();
	default void meth2()
	{
		SuperIf.super.meth2();
	}
}

interface PrivateMeth
{
	private String show()
	{
		return "This is a private method";
	}
}