package assignment;
public class StrongusingMWP 
{
	static void strong (int no)
	{
		int sum=0;
		int copy=no;
		while (no!=0)
		{
			int rem=no%10;
			int fact=1;
			for (int i=rem; i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		System.out.println("The sum of the number is "+sum);
		if (copy==sum)
		{
			System.out.println(copy+ " is a Strong number");
		}
		else
		{
			System.out.println(copy+ " is not a Strong number");
		}
	}
	public static void main(String[] args) 
	{
		int no=123;
		strong(no);
	}
}
