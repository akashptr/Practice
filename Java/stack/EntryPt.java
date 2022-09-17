// Program for stack
import java.util.*;
class Stack
{
	int st[];
	short top;
	Stack()
	{
		short size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the stack: ");
		size = sc.nextShort();
		if(size <= 0)
			System.out.println("Invalid size");
		else
		{
			st = new int[size];
			top = -1;
			System.out.println("Initialization completed");
		}
	}
	Stack(short size)
	{
		if(size <= 0)
			System.out.println("Invalid size");
		else
		{
			st = new int[size];
			top = -1;
			System.out.println("Initialization completed");
		}
	}
	void push()
	{
		Scanner input = new Scanner(System.in);
		if(top == (st.length-1))
			System.out.println("Overflow");
		else
		{
			System.out.print("Enter the data: ");
			st[++top] = input.nextInt();
			System.out.println("Data successfully pushed");
		}
	}
	void pop()
	{
		if(top == -1)
			System.out.println("Underflow");
		else
			System.out.println("The poped data is: " + st[top--]);
	}
	void display()
	{
		if(top == -1)
			System.out.println("Empty stack");
		else
		{
			for(short i=top; i>=0;i--)
				System.out.println(st[i]);
		}
	}
}

class EntryPt
{
	public static void main(String args[])
	{
		Stack stk = new Stack();
		Scanner choice = new Scanner(System.in);
		byte ch;
		do
		{
			System.out.print("__Menu__\n1. Push\n2. Pop\n3. Display\n4. Exit\nEnter your choice: ");
			ch = choice.nextByte();
			switch(ch)
			{
				case 1:
					stk.push();
					break;
				case 2:
					stk.pop();
					break;
				case 3:
					stk.display();
			}
		}while(ch != 4);
	}
}