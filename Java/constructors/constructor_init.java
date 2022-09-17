import java.util. *;
class constructor_init{
	int x;
	constructor_init()
	{
		System.out.print("Enter the value of x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
	}
	void display()
	{
		System.out.println("The value of x is: " + x);
	}
}