package assignment;
public class PerfectusingMWP 
{
	static void perfect(int no)
	{
		int copy=no;
		int sum=0;
		for (int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(copy==sum)
		{
			System.out.println(copy+" is a Perfect number");
		}
		else
		{
			System.out.println(copy+" is not a Perfect number");
		}
	}
	public static void main(String[] args) 
	{
		int no=18;
		perfect(no);
	}
}
