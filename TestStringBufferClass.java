/*Use of StringBuffer Class in Java*/

class TestStringBufferClass
{
	public static void main(String args[])
	{
		StringBuffer ob1 = new StringBuffer("Shree");
		System.out.println("Value of first String is "+ob1);
		
		StringBuffer ob2 = new StringBuffer();
		ob2.append("Sai");
		System.out.println("Value of Second String is "+ob2);
		
		StringBuffer ob3 = new StringBuffer(50);
		ob3.append("Sai Shree");
		System.out.println("Value of Third String is "+ob3);
	}
}