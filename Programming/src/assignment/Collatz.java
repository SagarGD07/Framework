package assignment;
public class Collatz 
{
	public static void main(String[] args) 
	{
		int no=3;
		System.out.print(no+" ");
		while(no!=1)
		{
			if(no%2==1)
			{
				no=3*no+1;
				System.out.print(no+" ");
			}
			else if(no%2==0)
			{
				no=no/2;
				System.out.print(no+" ");
			}
		}
	}
}
