package assignment;
import java.util.Scanner;
public class Rotate 
{
	static int[] rotate(int[]abd,int no)
	{
		for(int i=1;i<=no;i++)
		{
			int temp=abd[0];
			for(int j=0;j<abd.length-1;j++)
			{
				abd[j]=abd[j+1];
			}
			abd[abd.length-1]=temp;
		}
		return abd;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter the numbers");
		for (int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int[] rot = rotate(arr,1);
		for(int i=0;i<rot.length;i++)
		{
			System.out.println(rot[i]);
		}
	}
}
