
public class DuplicateinGivenString {

	public static void main(String[] args) {
		String input="Welcome to Java Session Java Session Session Java"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		System.out.println("Original String:" +input );
		System.out.println("Duplicate Word:");
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			if(words[i]!=null)
			{
			
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
				
				System.out.println(words[i]);
				words[j]=null;   //Delete the duplicate words
				
				
				}
			}
			}
		}
		
		System.out.println();
		System.out.println("String without duplicate :");
		for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	
		{
			if(words[k]!=null)
			{
				System.out.print(words[k]+" ");
			}
			
	     }  

	}

}
