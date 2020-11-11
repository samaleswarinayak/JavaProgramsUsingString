/*String immutable*/
class TestImmutableString1
{
	public static void main(String args[])
	{
		String str1 = "Java";
		String str2 = "Programming";
		System.out.println("Value is "+str1);
		System.out.println("Reference value of str1 = "+str1.hashCode());
		System.out.println("Reference value of str2 = "+str2.hashCode());
		str1 = str1+str2;
		System.out.println("Again Reference value of str1 = "+str1.hashCode());
		System.out.println("Again Value is "+str1);
	}
}