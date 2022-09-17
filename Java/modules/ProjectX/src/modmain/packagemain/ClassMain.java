package packagemain;
import packagecalculator.StandardCalculator;
class ClassMain
{
	public static void main(String args[])
	{
		int result;
		StandardCalculator sc = new StandardCalculator();
		result = sc.sum(20, 10);
		System.out.println(result);
	}
}