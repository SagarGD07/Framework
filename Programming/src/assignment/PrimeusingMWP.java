package assignment;
public class PrimeusingMWP 
{
	static void prime(int no)
	{
		int count=0;
		for (int i=1; i<=no;i++)
		{
			if (no%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println(no+" is a Prime number");
		}
		else
		{
			System.out.println(no+" is not a Prime number");
		}
	}
	public static void main(String[] args) 
	{
		int no=7;
		prime(no);
	}
}
