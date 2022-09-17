class IntegerStack implements Stack
{
	private int stk[];
	private int top;
	IntegerStack(int size)
	{
		stk = new int[size];
		top = -1;
		System.out.println("Stack created");
	}
	
	public void push(int data)
	{
		if(top == (stk.length - 1))
			System.out.println("Overflow");
		else
		{
			stk[++top] = data;
			System.out.println("Successful push operation");
		}			
	}
	
	public void pop()
	{
		if(top == -1)
			System.out.println("Underflow");
		else
		{
			System.out.println(stk[top--]);
		}
	}
}

class CheckLength implements Stack.NestedIf
{
	public void checkSize(int size)
	{
		if(size < 0)
			System.out.println("Not a valid length");
		else
			System.out.println("Valid length");
	}
}

class DefaultAndExtendedIf implements SubIf
{
	public void meth1()
	{
		System.out.println("Inside meth1");
	}
	public void meth3()
	{
		System.out.println("Inside meth3");	
	}
}