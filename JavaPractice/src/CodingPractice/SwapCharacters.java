package CodingPractice;

public class SwapCharacters {

	public static void main(String[] args)
	{
		String s="ABCDE";
		int l=s.length();
		String n="";
		char a='a';
		int flag=0;
		
		if(l%2!=0)
		{
			a=s.charAt(l---1);
			flag=1;
		}	
		
		for(int i=0;i<l;i=i+2)
		{
			n=n+s.charAt(i+1)+s.charAt(i);
		}
		if(flag==1)
		{
			n=n+a;
		}
		System.out.println(n);
	}

}
