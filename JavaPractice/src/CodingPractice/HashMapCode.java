package CodingPractice;

import java.util.HashMap;

public class HashMapCode
{
	static HashMap <String,String> a=new HashMap <String, String>();
	public static void main(String[] args)
	{
		a.put("1","Hello");
		a.put("2","World");
		
		System.out.println(a);
		System.out.println(a.get("2"));
	}

}
