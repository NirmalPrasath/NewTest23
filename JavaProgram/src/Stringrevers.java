
public class Stringrevers {

	public static void main(String args[])
	{
		String s="Nirmal";
		
		char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	System.out.println();
	int n=3894;
	int temp=0;
	while(n>0)
	{
		temp=temp*10;
		temp=temp+n%10;
		n=n/10;
		
	}
	
		System.out.println(temp);

	
		
	}
}
