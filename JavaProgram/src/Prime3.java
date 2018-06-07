
public class Prime3 {
	public static void main(String args[])
	{
		int i,j,limit=100;
		
		
		System.out.println("Prime numbers between 1 and " + limit);
		
		for(i=1;i<limit;i++)
			
		
		{
			boolean flag=true;
			for(j=2;j<i;j++)
			{
				
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i + " ");
			}
		}
			
	}
	
}
