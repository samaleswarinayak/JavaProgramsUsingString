/*Input the firstname,middlename and lastname of one student and display it using StringBuffer class*/

import java.util.*;
class TestStringBufferName
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer name = new StringBuffer();//Create an empty string
		String fname;
		System.out.println("Enter the first name");
		fname = sc.next();
		String mname;
		System.out.println("Enter the middle name");
		mname = sc.next();
		String lname;
		System.out.println("Enter the last name");
		lname = sc.next();
		
		name.append(fname);
		name.append(lname);
		System.out.println("Till now without middle name value is "+name);
		
		int len = fname.length();//Length of first name. Required to insert middle name
		name.insert(len,mname);
		System.out.println("Full Name is "+name);
		
		
	}
}