/*Conversion from one class to another in string*/

class TestConvertString11
{
	public static void main(String args[])
	{
		//Convert from StringBuffer to String
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println("The original string is "+str2);
		String str1 = str2.toString();
		System.out.println("The converted string is "+str1);
		
		//Convert from StringBuilder to String
		StringBuilder str4 = new StringBuilder("Java Programming");
		System.out.println("The original string is "+str4);
		String str3 = str4.toString();
		System.out.println("The converted string is "+str3);
	}
}