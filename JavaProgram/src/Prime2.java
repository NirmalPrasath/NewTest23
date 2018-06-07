import java.util.Scanner;

public class Prime2 {
	
	public static void main(String args[])
	{  
		Prime2 p=new Prime2();
		p.primeNo(30);
		p.primeNo(5);
		p.primeNo(19);
		p.primeNo(17);
		p.primeNo(2);
	  }
	
	public void primeNo(int in)
	{
		 int i,m=0,flag=0;      
		 // m=in/2;    
		if(in==0||in==1)
		{  	   
		System.out.println(in+" is not prime number");      
		}
		else{  
		   for(i=2;i<=in/2;i++)
		   {      
		    if(in%i==0)
		    {      
		     System.out.println(in+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   { 
			   System.out.println(in+" is prime number"); 
		   }
	}
	}
}
