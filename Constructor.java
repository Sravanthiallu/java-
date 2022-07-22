class Demo
{
	private Demo()
	{
		System.out.println("I am in Demo method");
	}
}
class Constructor
{
	public static void main(String args[])
	{
		Demo a=new Demo();
	}
}