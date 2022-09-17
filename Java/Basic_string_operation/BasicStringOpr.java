class BasicStringOpr
{
	public static void main(String args[])
	{
		String str1 = "This is the first string";
		String str2 = "This is the second string";
		String str3 = str1;
		
		System.out.println("The string \"" + str1 + "\" has length " + str1.length());
		System.out.println("The character at the position 10 in the string \"" + str2 + "\" is " + str2.charAt(9));
		if(str1.equals(str2))
			System.out.println('\"' + str1 + "\" and \"" + str2 + "\" are equal");
		else
			System.out.println('"' + str1 + "\" and \"" + str2 + "\" are not equal");
		if(str1.equals(str3))
			System.out.println('\"' + str1 + "\" and \"" + str3 + "\" are equal");
		else
			System.out.println('"' + str1 + "\" and \"" + str3 + "\" are not equal");
		str1 = "this is a third string";
		System.out.println(str1 + '\n' + str3);
	}
}