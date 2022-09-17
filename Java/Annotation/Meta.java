import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}

class Meta
{
	@MyAnno(str = "Method without arguments", val = 100)
	public static void myMeth()
	{
		System.out.println("Inside the myMeth method");
	}
	
	@MyAnno(str = "Method with arguments", val = 200)
	public static void myMethArg(int i, String s)
	{
		System.out.println(i + " " + s);
	}
	
	public static void main(String args[])
	{
		Meta obj = new Meta();
		try
		{
			Class<?> classObj = obj.getClass();
			Method methObj1 = classObj.getMethod("myMeth");
			Method methObj2 = classObj.getMethod("myMethArg", int.class, String.class);
			MyAnno annoObj1 = methObj1.getAnnotation(MyAnno.class);
			MyAnno annoObj2 = methObj2.getAnnotation(MyAnno.class);
			System.out.println(annoObj1.str() + " " + annoObj1.val());
			System.out.println(annoObj2.str() + " " + annoObj2.val());
		}
		catch(NoSuchMethodException exp)
		{
			System.out.println("Method not found");
		}
		finally
		{
			myMeth();
			myMethArg(10, "Hello");
		}
	}
}