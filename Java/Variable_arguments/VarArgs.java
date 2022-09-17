class VarArgs
{
	static void vaTest(int ... v)
	{
		for(int x:v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int[] x = {1,10,110,1110};
		vaTest(x);
		vaTest(1,2,3);
		vaTest(1);
		vaTest();
	}
}