package interfac;
interface Interface1
{
public void myMethod();
}
interface Interface2
{
public void myMethod();
}
public class Multipleinheritence implements Interface1, Interface2
{
public void myMethod()
{
System.out.println("Implementing more than one interfaces");
}



	public static void main(String[] args) {
		Multipleinheritence obj = new Multipleinheritence();
        obj.myMethod();
	}}

