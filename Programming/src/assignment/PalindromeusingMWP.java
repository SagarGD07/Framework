package assignment;
public class PalindromeusingMWP 
{
	static void pali(int no)
	{
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		if (copy==sum)
		{
			System.out.println(copy+" is a Palindrome number");
		}
		else
		{
			System.out.println(copy+" is not a Palindrome number");
		}
	}
	public static void main(String[] args) 
	{
		int no=555;
		pali(no);
	}
}
