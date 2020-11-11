/*StringBuilder class in Java*/

class TestStringBuilder
{
	public static void main(String args[])
	{
		StringBuilder ob1 = new StringBuilder("Hello Shree");
		System.out.println("Value of first object is "+ob1);
		
		StringBuilder ob2 = new StringBuilder();
		ob2.append("Hello");
		System.out.println("Value of second object is "+ob2);
		
		StringBuilder ob3 = new StringBuilder(50);
		ob3.append("Shree Hello");
		System.out.println("Value of third object is "+ob3);
	}
}