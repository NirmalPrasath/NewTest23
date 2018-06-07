
public class Stringarrayrevers {

	public static void main(String[] args) {
		String s[]={"Selenium", "Java", "Program", "Java", "Program" };
		int len=s.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println(s[i] + " ");
				}
			}
		}

	}

}
