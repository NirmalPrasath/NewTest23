import java.util.Scanner;

public class PrimeNo 
{
static int flag=0;
 
	public static void main(String args[])
	{  
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter number: ");
	  int in=sc.nextInt();
	   for(int i=2;i<=in/2;i++)
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
