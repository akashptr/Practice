enum Day
{
	Sunday(1), Monday(2), Tuesday(3), Wednessday(4), Thursday(5), Friday(6), Saturday(7);
	private int index;
	Day(int num)
	{
		index = num;
	}
	int getIndex()
	{
		return index;
	}
}

class Basic
{
	private Day d;
	Basic(Day day)
	{
		d = day;
	}
	boolean compare(Day day)
	{
		if(d == day)
			return true;
		else
			return false;
	}
	void setDay(Day day)
	{
		d = day;
	}
	Day getDay()
	{
		return d;
	}
	void show()
	{
		switch(d)
		{
			case Sunday:
				System.out.println("Robibar");
				break;
			case Monday:
				System.out.println("Sombar");
				break;
			case Tuesday:
				System.out.println("Mongolbar");
				break;
			case Wednessday:
				System.out.println("Budhbar");
				break;
			case Thursday:
				System.out.println("Brihospotibar");
				break;
			case Friday:
				System.out.println("Sukrobar");
				break;
			case Saturday:
				System.out.println("Sonibar");
				break;
		}
	}
}

class EnumDemo
{
	public static void main(String args[])
	{
		Basic basicDemo = new Basic(Day.Wednessday);
		System.out.println(basicDemo.compare(Day.Friday));
		System.out.println(basicDemo.compare(Day.Wednessday));
		basicDemo.setDay(Day.Sunday);
		basicDemo.show();
		for(Day day: Day.values())
			System.out.println("Index of " + day + " is: " + day.getIndex());
		System.out.println("The ordinal value of tuesday is: " + Day.Tuesday.ordinal());
		System.out.print("Comparing enums " + Day.Monday + " and " + Day.Tuesday + ": ");
		System.out.println(Day.Monday.compareTo(Day.Tuesday));
		System.out.print("Comparing enums " + Day.Monday + " and " + Day.Monday + ": ");
		System.out.println(Day.Monday.compareTo(Day.Monday));
		System.out.print("Comparing enums " + Day.Monday + " and " + Day.Sunday + ": ");
		System.out.println(Day.Monday.compareTo(Day.Sunday));
		System.out.print("Comparing enums " + Day.Wednessday + " and " + Day.Sunday + ": ");
		System.out.println(Day.Wednessday.compareTo(Day.Sunday));
		System.out.println("Equality b/w basicDemo and Day.Monday: " + Day.Monday.equals(basicDemo));
		basicDemo.setDay(Day.Monday);
		System.out.println("Equality b/w basicDemo.d and Day.Monday: " + Day.Monday.equals(basicDemo.getDay()));
	}
}