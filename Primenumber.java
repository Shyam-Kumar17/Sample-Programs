package String;

public class Primenumber {

	public static void main(String[] args) {
		int a[]= {4,5,7,3,8,11,16,17};
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=2;j<a.length;j++)
			{
				if(a[i]%2==0)
				{
					flag=true;
				}
				}
			if (flag)
			{
				System.out.println("Not a prime number"+a[i]);
			}
			else
			{
				System.out.println("prime number"+a[i]);
			}
		}
	}
}
