package assignment;
public class ArmstrongusingMWP 
{
	static void armstrong(int no)
	{
		int sum=0;
		int copy=no;
		while(no!=0)
		{
		int rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
		}
		System.out.println("The sum of the number is "+ sum);
		if (copy==sum)
		{
			System.out.println(copy+ " is an Armstrong number");
		}
		else
		{
			System.out.println(copy+ " is not an Armstrong number");
		}
	}
	public static void main(String[] args) 
	{
		int no=141;
		armstrong(no);
	}
}
