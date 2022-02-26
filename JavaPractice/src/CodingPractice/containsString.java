package CodingPractice;

public class containsString {

	public static void main(String[] args)
	{
		String s="abcdefghi";
		String s1="def";
		
		for(int i=0;i<s.length()-s1.length()+1;i++)
		{
			int flag=0;
			for(int j=0;j<s1.length();j++)
				{
					if(s.charAt(i+j)==s1.charAt(j))
					{
						flag++;
					}

				}
			if(flag==s1.length())
			{
				System.out.println("String contains the substring");
			}
			else
			{
				System.out.println("String doesn't contains the substring");
			}
		}

	}

}
