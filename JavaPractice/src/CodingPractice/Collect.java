package CodingPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collect
{
	static ArrayList<Integer> a=new ArrayList<Integer>();
	static LinkedList<Integer> b=new LinkedList<Integer>();
	static HashMap<String,Integer> c=new HashMap<String,Integer>();
	static HashSet<Integer> d=new HashSet<Integer>();
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		{
			a.add(i);
			b.add(i);
			String i1=""+i;
			c.put(i1,i);
			d.add(i);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		Iterator i=a.iterator();
		
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		i=b.iterator();
		
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
		
		System.out.println(c.keySet());
		for(String s:c.keySet())
		{
			System.out.println(c.get(s));
			System.out.print(1);
		}
		
		i=d.iterator();
		
		while(i.hasNext()==true)
		{
			System.out.println(i.next());
		}
	}

}
