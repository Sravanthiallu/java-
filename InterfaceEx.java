interface A
{
	int p=10;//static variable
	void print();
}
class B implements A
{
	void show()
	{
		System.out.println("I am in show method ");
	}
	public void print()
	{
		System.out.println("I am in print method ");
	}
}
class InterfaceEx
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
		obj.print();
		System.out.println("p value = " + A.p);
	}
}
	