package CodingPractice;

import java.util.ArrayList;

public class collect1
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1, 20);
		System.out.println(al);
	}
}
