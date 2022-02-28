package CodingPractice;

public class SortAString
{
	static String s="abcdefedcba";
	static int l=s.length();
	static char[] ca=new char[l];
	static int i=0,j=0;
	
	public static void main(String args[])
	{
		System.out.println(s+l);
		
		for(int i=0;i<l;i++)
		{
			ca[i]=s.charAt(i);
		}
		
		for(i=0;i<=l-1;i++)
		{
			for(j=0;j<=l-2 -i;j++)
			{
				if(ca[j]>ca[j+1])
				{
					char c;
					c=ca[j];
					ca[j]=ca[j+1];
					ca[j+1]=c;
				}
			}
		}
		System.out.println("Original string : "+s);
		System.out.print("New string : ");
		for(char c:ca)
		{
			System.out.print(c);
		}
	}
}
