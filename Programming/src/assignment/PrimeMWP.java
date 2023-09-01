package assignment;
public class PrimeMWP 
{
	static void prime(int no)
	{
		int count=0;
		for (int i=1;i<=100;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println(no+" is prime number");
		}
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			prime(i);
		}
	}
}
