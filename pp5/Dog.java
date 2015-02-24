package pp5;

public class Dog 
{
	String name;
	String d;
	int age;
	String n;
	int doga;
	public Dog(String n, int a)
	{
		n = name;
		a = age;
	}
	public String getName()
	{
		return name;
	}
	public String setName()
	{
		n = name;
		return n;
	}
	public int setAge()
	{
		return age;
	}
	public int dogYears()
	{
		doga = age*7;
		return doga;
	}

}