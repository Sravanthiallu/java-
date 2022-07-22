class MethodDemo
{
void add (int x)
{
System.out.println(x+x);
}
void add(int x,float y)
{
System.out.println(x+y);
}
void add(int x,int y)
{
System.out.println(x+y);
}
void add(float a,float b)
{
System.out.println(a+b);
}
public static void main(String args[])
{
MethodDemo sc=new MethodDemo();
sc.add(10);
sc.add(10,2.3f);
sc.add(10,10);
sc.add(10f,10f);
}
}