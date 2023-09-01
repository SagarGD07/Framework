package assignment;

import java.util.Scanner;

public class Productof2Nos
{ 
	public static void main(String args[] ) throws Exception 
		{
		  Scanner sc = new Scanner(System.in);
		  int size=sc.nextInt();
		  int [] arr=new int[size];
		  for(int i=0;i<arr.length;i++)
		  	{
		      arr[i]=sc.nextInt();
		    }
		  int answer=1;
		  for(int i=0;i<arr.length;i++)
		    {
		      answer=answer*arr[i];
		    }
		  System.out.println(answer);
		 }
	}