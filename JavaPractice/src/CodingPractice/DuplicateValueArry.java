package CodingPractice;

import java.util.HashSet;

public class DuplicateValueArry
{

	public static void main(String[] args) 
	{
		int[] a= {1,5,3,2,4,7,8,5,3,4,6,7,3,4,6,7,8,3,4,6,2,4,6,6,4,4,6,4,5,9};
		int[] fi=new int[a.length];
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i:a)
		{
			hs.add(i);
		}
		System.out.println(hs);
		System.out.println(a);
		for(int i:a)
		{
			
		}
	}

}
