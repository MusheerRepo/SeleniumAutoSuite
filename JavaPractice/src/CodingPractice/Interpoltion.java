package CodingPractice;

import java.text.MessageFormat;

public class Interpoltion
{

	public static void main(String[] args)
	{
		String s1="My name is khan";
		String s2="Khan is my name";
		
		System.out.println(MessageFormat.format("{0} {1} {1} {0}",s1,s2));

	}

}
