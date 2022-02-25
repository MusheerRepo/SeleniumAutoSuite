package CodingPractice;

public class SortAString
{
	static String s="dcba";
	static int l=s.length();
	static char[] ca=new char[l];
	static int i=0,j=0;
	
	public static void main(String args[])
	{
		System.out.println(s+l);
		for(i=0;i<=l-1;i++)
		{
			for(j=0;j<=l-2-i;j++)
			{
				if(ca[j]>ca[j+1])
				{
					int c;
					c=ca[j];
					ca[j]=ca[j+1];
					ca[j+1]=(char)c;
				}
			}
		}
		System.out.println("Original string : "+s);
		System.out.print("New string : ");
		for(i=0;i<l;i++)
		{
			System.out.print(ca[i]);
		}
	}
}
