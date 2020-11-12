/*Conversion from one class to another in string*/

class TestConvertString12
{
	public static void main(String args[])
	{
		//Convert from StringBuffer to String
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println("The original string is "+str2);
		StringBuilder str4 = new StringBuilder(str2);
		System.out.println("The converted string is "+str4);
	}
}