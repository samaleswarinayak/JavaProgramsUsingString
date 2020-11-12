/*Check one string is palindrome or not*/

import java.util.*;
class StringPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.next();
		String temp = str1;//Copied string
		//Convert from String to StringBuffer
		StringBuffer ob = new StringBuffer(str1);
		//Reverse the string
		ob.reverse();
		//Convert to String
		str1 = ob.toString();
		//Compare bothe the strings
		if(temp.equalsIgnoreCase(str1))
		{
			System.out.println(temp+" is pallindrome");
		}
		else
		{
			System.out.println(temp+" is not pallindrome");
		}
	}
}