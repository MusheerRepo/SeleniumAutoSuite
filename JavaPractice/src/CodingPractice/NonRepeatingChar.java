package CodingPractice;

import java.util.ArrayList;

public class NonRepeatingChar
{

	public static void main(String[] args)
	{
		ArrayList<Character> ac=new ArrayList<Character>();
		ac.add('a');
		ac.add('b');
		ac.add('c');
		ac.add('b');
		//ac.add('c');
		
		for(int i=0;i<ac.size();i++)
		{
			int flag=0;
			for(int j=0;j<ac.size();j++)
			{
				if(i!=j)
				{
					if(ac.get(i)==ac.get(j))
					{
						flag=1;
					}
				}
			}
			if(flag!=1)
			{
				System.out.println(ac.get(i));
			}
		}
	}

}
