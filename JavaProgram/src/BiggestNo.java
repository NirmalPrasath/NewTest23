
public class BiggestNo {

	public static void main(String[] args) {
		int a[]={23,67,11,55,88,409};
		int len=a.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						
					
				}
			}
		}
System.out.println("Largest No " + a[len-1] + " " + "Second Largest No" + a[len-2] );
System.out.println("Smallest No " + a[0]); 
	}

}
