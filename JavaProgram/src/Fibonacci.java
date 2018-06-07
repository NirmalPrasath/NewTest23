
public class Fibonacci {
	//sum of previous 2 number

	static int n1=0;
	static int n2=1;
	static int n3;
	public static void main(String args[])
	{
		int count=5;
		System.out.print(n1+" "+ n2);
		fibonacciPro(count-2);
	}
	
	
	public static void fibonacciPro(int count)
	{
		if(count>0)
		{
			for(int i=0;i<count;i++)
			{
				n3=n1+n2;
			System.out.print(" "+n3);
				n1=n2;
				n2=n3;
				
			}
		}
		
	}
}
