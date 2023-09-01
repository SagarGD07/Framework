package assignment;

import java.util.ArrayList;

public class ALtoArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		int[] arr= new int[l.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=l.get(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
