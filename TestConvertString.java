/*Conversion from one class to another in string*/

class TestConvertString
{
	public static void main(String args[])
	{
		//Convert from String to StringBuffer
		String str1 = "Shree";
		System.out.println("The original string is "+str1);
		StringBuffer str2 = new StringBuffer(str1);
		System.out.println("The converted string is "+str2);
		
		//Convert from String to StringBuilder
		String str3 = "Java Programming";
		System.out.println("The original string is "+str3);
		StringBuilder str4 = new StringBuilder(str3);
		System.out.println("The converted string is "+str4);
	}
}