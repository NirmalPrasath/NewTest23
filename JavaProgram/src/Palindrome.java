
public class Palindrome {

	public static void main(String[] args) {
	
		//565 - revers 565
		
		int n=1541;
		
		int sum=0, temp, r;
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;			
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
