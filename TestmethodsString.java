/*Concat two strings*/

class TestmethodsString
{
	public static void main(String args[])
	{
		String str1= "Java";
		String str2="Programming";
		String str3 = str1 + str2;
		System.out.println("The resultant string is "+str3);
		String str4 = str1.concat(str2);
		System.out.println("Next resultant string is "+str4);
	}
}