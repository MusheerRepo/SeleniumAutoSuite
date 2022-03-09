package CodingPractice;

public class Comparee
{
	static String s1="Iello";
	static String s2="Hello";

	public static void main(String[] args)
	{
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
