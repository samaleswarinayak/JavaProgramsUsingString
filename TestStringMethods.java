/*Methods of String class*/

class TestStringMethods
{
	public static void main(String args[])
	{
		//Create string
		String str1 = "My java programming";
		String str2 = new String("I love java");
		char arr[]={'S','h','r','e','e'};
		String str3 = new String(arr);
		//Display the values of strings
		System.out.println("String1 = "+str1);
		System.out.println("String2 = "+str2);
		System.out.println("String3 = "+str3);
		//Find the length of string
		int len1 = str1.length();
		System.out.println("The length of first string is "+len1);
		//Concatenate strings
		System.out.println("Concatenated string is "+str1.concat(str2));
		//Extract substring from one string 0th character to 4th character
		String substr = str1.substring(0,5);
		System.out.println("Substring value is "+substr);
		//Check one string is starting from a particular letter
		boolean value = str2.startsWith("A");
		if(value)
		{
			System.out.println(str2+" is starting with I");
		}
		else
		{
			System.out.println(str2+" is not starting with A");
		}
		//Convert to uppercase and lowercase
		System.out.println("Uppercase of string1 "+str1.toUpperCase());
		System.out.println("Lowercase of string2 "+str2.toLowerCase());
		//Split the string
		String res[];
		res = str1.split(" ");
		//Display the values from res array
		System.out.println("The values of string array are");
		for(int index=0;index<res.length;index++)
		{
			System.out.println(res[index]);
		}
	}
}