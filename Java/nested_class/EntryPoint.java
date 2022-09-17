class Outer
{
	class Inner
	{
		int inner_var;
		Inner(int data)
		{
			inner_var = data;
		}
		Inner get()
		{
			Inner obj = new Inner(10);
			return obj;
		}
		public String toString()
		{
			String s = "The value of inner_var is: " + inner_var;
			return s;
		}
	}
	
	int outer_var;
	Inner inner_obj;
	
	Outer(int data)
	{
		outer_var = data;
		inner_obj = new Inner(20);
	}
}

class EntryPoint
{
	public static void main(String args[])
	{
		Outer out_obj = new Outer(30);
		Object in_obj = out_obj.inner_obj.get();
		System.out.println(in_obj);
		Outer.Inner oi = out_obj.inner_obj.get();
		oi.toString();
	}
}