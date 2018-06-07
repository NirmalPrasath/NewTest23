
public class DuplicateInArray {

	public static void main(String[] args) {
		
		String s[]={"Selenium Program", "Java", "Program", "Java", "Paython", "Program"};
		int len=s.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s[i].equals(s[j]))
				{
				System.out.println(s[i]);	
				}
				
				
			}
		}
			int n[]={1, 11,8,2,5,6,3,5,7,3,8,6,2};
			int le=n.length;
			for(int i1=0;i1<le;i1++)
			{
				for(int j1=i1+1;j1<le;j1++)
				{
					if(n[i1]==(n[j1]))
					{
					System.out.println(n[i1]);	
					}
					
					
				}
			}
		}

	}


