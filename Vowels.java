package String;

public class Vowels {

	public static void main(String[] args) {
		String s="I Love India";
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++)
		{
			if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				arr[i]='0';
			}
			if (arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			{
				arr[i]='0';
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		 if (arr[i]!='0')
{
			 System.out.print(arr[i]);
}
		}

	}

}
