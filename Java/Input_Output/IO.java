import java.io.*;
class IO
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out, true);
		/*Reading character
		char ch;
		pw.println("Enter 'q' exit");
		do
		{
			ch = (char) br.read();
			pw.println(ch);
		}while(ch != 'q');*/
		/*Line reader*/
		String str;
		pw.println("Write stop to exit");
		do
		{
			str = br.readLine();
			pw.println(str);
		}while(!str.equals("stop"));
	}
}