//Program to form a queue and applying selection sort and insertion sort.
import java.util.*;
class Queue
{
	int qu[];
	int front, rear;
	Queue()
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the queue: ");
		size = sc.nextInt();
		qu = new int[size];
		front = rear = -1;
		System.out.println("Queue is initialized");
	}
	Queue(int size)
	{
		qu = new int[size];
		front = rear = -1;
		System.out.println("Queue is initialized");
	}
	boolean put()
	{
		Scanner sc;
		if(rear == (qu.length - 1))
		{
			System.out.println("Queue is full");
			return(false);
		}
		sc = new Scanner(System.in);
		if(front == -1)
			front = ++rear;
		else
			rear++;
		System.out.print("Enter the data you want to insert: ");
		qu[rear] = sc.nextInt();
		System.out.println("Insertion successful");
		return(true);
	}
	int get()
	{
		int item;
		if(front == -1)
		{
			System.out.println("Underflow");
			return(-1);
		}
		item = qu[front];
		if(front == rear)
			front = rear = -1;
		else
			front++;
		return(item);
	}
	void display()
	{
		if(front == -1)
			System.out.println("Empty queue");
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.print(qu[i] + " ");
			System.out.println();
		}
	}
	void insertion_sort()
	{
		int j, key;
		if(front != -1)
		{
			for(int i = (front+1); i <= rear; i++)
			{
				key = qu[i];
				j = i-1;
				while(j>=front && key < qu[j])
				{
					qu[j+1] = qu[j];
					j = j-1;
				}
				qu[j+1] = key;
			}
			System.out.println("Sorting completed");
		}
		else
			System.out.println("Empty queue");
	}
	void selection_sort()
	{
		int smallest, temp;
		if(front != -1)
		{
			for(int i=front; i<rear; i++)
			{
				smallest = i;
				for(int j=i+1; j<= rear; j++)
				{
					if(qu[j] < qu[smallest])
						smallest = j;
				}
				temp = qu[i];
				qu[i] = qu[smallest];
				qu[smallest] = temp;
			}
			System.out.println("Sorting successful");
		}
		else
			System.out.println("Empty queue");
	}
}

class EntryPt
{
	public static void main(String args[])
	{
		Queue q1;
		Scanner sc;
		byte choice;
		int data;
		q1 = new Queue();
		sc = new Scanner(System.in);
		do
		{
			System.out.print("___Menu___\n1. Insert\n2. Get\n3. Display\n4. Insertion sort\n5. Selection sort\n6. Exit\nEnter your choice: ");
			choice = sc.nextByte();
			switch(choice)
			{
				case 1:
					q1.put();
					break;
				case 2:
					data = q1.get();
					if(data != -1)
						System.out.println(data);
					break;
				case 3:
					q1.display();
					break;
				case 4:
					q1.insertion_sort();
					break;
				case 5:
					q1.selection_sort();
			}
		}while(choice != 6);
	}
}