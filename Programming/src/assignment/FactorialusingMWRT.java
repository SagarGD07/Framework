package assignment;
public class FactorialusingMWRT 
{
	static int factorial()
	{
		int no=5;
		int fact=1;
		for (int i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int a=factorial();
		System.out.println(a);
	}
}
