package assignment;
public class PrimeNonPrime 
{
	static void disp(int no)
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(no+" is a prime number");
		}
		else
		{
			System.out.println(no+" is not a prime number");
		}
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			disp(i);
		}
	}
}
