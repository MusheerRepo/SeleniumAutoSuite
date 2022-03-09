package CodingPractice;

public class Anagram
{
	static String s1="Silent";
	static String s2="listen";
	static char[] s1c=new char[s1.length()];
	static char[] s2c=new char[s2.length()];
	static int flag=0;
	
	public static void main(String[] args)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			s1c[i]=s1.charAt(i);
		}
		
		for(int i=0;i<s2.length();i++)
		{
			s2c[i]=s2.charAt(i);
		}
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length()-1-i;j++)
			{
				char c=' ';
				if(s1c[j]<s1c[j+1])
				{
					c=s1c[j];
					s1c[j]=s1c[j+1];
					s1c[j+1]=c;
				}
			}
		}
		
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s2.length()-1-i;j++)
			{
				char c=' ';
				if(s2c[j]<s2c[j+1])
				{
					c=s2c[j];
					s2c[j]=s2c[j+1];
					s2c[j+1]=c;
				}
			}
		}
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1c[i]!=s2c[i])
			{
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Not anagram");
		}
		else
		{
			System.out.println("Anagram");
		}
	}

}
