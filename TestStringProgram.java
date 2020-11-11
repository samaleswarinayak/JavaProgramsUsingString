/*Create a string in Java*/

class TestStringProgram
{
	public static void main(String args[])
	{
		String name1 = "Shree";//String literal
		System.out.println("My name is "+name1);
		//By using new keyword
		String name2 = new String("Sai Shree");
		System.out.println("My name is "+name2);
		//Using character array name
		char arr[] = {'S','a','m',' ','S','h','r','e','e'};
		String name3 = new String(arr);
		System.out.println("My name is "+name3);
	}
}