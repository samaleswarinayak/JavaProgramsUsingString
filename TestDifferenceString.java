/*Difference between all classes of string operations in java*/

class TestDifferenceString
{
	static void update1(String str1)
	{
		str1 = str1 + "Morning";//Done modification
		System.out.println("Address of str1 = "+str1.hashCode());
	}
	static void update2(StringBuffer str2)
	{
		str2.append("Morning");
		System.out.println("Address of str2 = "+str2.hashCode());
	}
	static void update3(StringBuilder str3)
	{
		str3.append("Morning");
		System.out.println("Address of str3 = "+str3.hashCode());
	}
	public static void main(String args[])
	{
		String str1 = "Good";
		System.out.println("Before change value of str1 = "+str1);
		update1(str1);//Value of str1 is not modified
		System.out.println("Address of str1 in main = "+str1.hashCode());
		System.out.println("After change value of str1 = "+str1);
		
		StringBuffer str2 = new StringBuffer("Good");
		System.out.println("Before change value of str2 = "+str2);
		update2(str2);//Value of str2 gets modified
		System.out.println("Address of str2 in main= "+str2.hashCode());
		System.out.println("After change value of str2 = "+str2);
		
		StringBuilder str3 = new StringBuilder("Good");
		System.out.println("Before change value of str3 = "+str3);
		update3(str3);//Value of str3 gets modified
		System.out.println("Address of str3 in main= "+str3.hashCode());
		System.out.println("After change value of str3 = "+str3);
	}
}