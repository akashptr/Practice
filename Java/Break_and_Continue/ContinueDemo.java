class ContinueDemo
{
	public static void main(String[] args)
	{
		outer: for(int i=0;i<10;i++)
		{
			System.out.print(i + ":");
			inner: for(int j=0;j<10;j++)
			{
				System.out.print(" " + (i*j));
				if(j==i)
				{
					System.out.println();
					continue outer;
				}
			}
		}
	}
}