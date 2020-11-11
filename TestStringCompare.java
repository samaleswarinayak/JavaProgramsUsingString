/*String comparison*/

class TestStringCompare
{
	public static void main(String args[])
	{
		String str1 = "Shree";
		String str2 = new String("Shree");
		if(str1 == str2)
		{
			System.out.println("Both string values are same");
		}
		else
		{
			System.out.println("Both string values are not same");
		}
	}
}