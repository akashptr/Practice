class BreakDemo
{
	public static void main(String args[])
	{
		BreakDemo bd = new BreakDemo();
		bd.demo1();
		bd.demo2();
	}
	
	void demo1()
	{
		label1:{
			boolean flag = true;
			label2:{
				if(flag)
					break label1;
				System.out.println("Inside label2");
			}
			System.out.println("Out of label2");
		}
		System.out.println("Out of label1");
	}
	
	void demo2()
	{
		label1: for(int i=0;i<10;i++)
		{
			System.out.println(i);
			label2: for(int j=0;j<5;j++)
			{
				System.out.println(j);
				if(j==3)
					break label1;
				System.out.println("Inside label2");
			}
			System.out.println("After label2");
		}
		System.out.println("After label1");
	}
}