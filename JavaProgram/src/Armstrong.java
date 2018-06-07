
public class Armstrong {

	public static void main(String[] args) {
		
		int c=0, a, temp;
		int n=1538;
		temp=n;
		
		while(n>0)
		
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("ASN");
		}
		else
		{
			System.out.println("Not ASN");
		}

	}

}
