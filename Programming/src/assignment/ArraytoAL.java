package assignment;

import java.util.ArrayList;

public class ArraytoAL 
{
	public static void main(String[] args) 
	{
		int[]arr= {10,20,30};
		ArrayList<Integer> l= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		l.add(arr[i]);
		}
		System.out.println(l);
	}
}
