package CodingPractice;

public class Insertastring
{
	public static void main(String args[])
	{
		String s="abcdefghi";
		String si="9292";
		int index=4;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(i<=index)
			{
				temp=temp+s.charAt(i);
			}
			else
			{
				si=si+s.charAt(i);
			}
		}
		System.out.println(temp+si);
	}
}
