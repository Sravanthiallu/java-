class Program
{
	void print()
	{
		System.out.println("I am in print method");
	}
	void add()
	{
		int a=10,b=5;
		System.out.println("Addition is performed : "+(a+b));
	}
}
class ClassMechanism
{
	public static void main(String args[])
	{
		Program obj = new Program();
		obj.print();
		obj.add();
	}
}