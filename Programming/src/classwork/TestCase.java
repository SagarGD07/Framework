package classwork;
public class TestCase 
{
	public static void main(String[] args) 
	{
		String a= "Sagar";
		String s="My Name Is Sagar";
		/*String[] arr = s.split(" ");
		for (int i=0; i<arr.length; i++) 
		{
			boolean isalpha=false;
			for(int j=0;j<arr.length;j++)
			{
			char ch1 = s.charAt(i);
			if(Character.isAlphabetic(ch1))
			{
				isalpha=true;
			}
			else
			{
				isalpha=false;
				break;
			}
			}
			System.out.println(isalpha);
		}*/
		int len = s.length();
		if(len>=5 && len<=50)
		{
			char first = s.charAt(0);
			if(Character.isUpperCase(first))
			{
				System.out.println("valid string");
			}
			else
			{
				System.out.println("Invalid String");
			}
		}
		else
		{
			System.out.println("Inavlid String");
		}
	}
}
