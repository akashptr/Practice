import java.io.*;
class FileIO
{
	public static void main(String args[])
	{
		String fileName;
		int data;
		FileInputStream inputFile = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter output = new PrintWriter(System.out, true);
		output.print("Enter the file name with path: ");
		output.flush();
/*		try
		{
			fileName = input.readLine();
			inputFile = new FileInputStream(fileName);
			do
			{
				data = inputFile.read();
				System.out.print((char) data);
			}while(data != -1);			
		}
		catch(FileNotFoundException exp)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("IO exception occured");
		}
		finally
		{
			try
			{
				if(inputFile != null)
					inputFile.close();
			}
			catch(IOException e)
			{
				System.out.println("File cannot be closed");
			}
		}*/
	}
}