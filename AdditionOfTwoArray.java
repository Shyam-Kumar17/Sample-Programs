package String;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int a[]= {7,4,1,3};
		int b[]= {1,9,4,2};
		if(a.length==b.length)
		{
		int c[]=new int[a.length];
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		}
		else
		{
			if(a.length>b.length)
			{
				int c[]=new int[a.length];
				for(int i=0;i<c.length;i++)
				{
					c[i]=a[i]+b[i];
					System.out.println(c[i]);
				}
				}
			else
			{
				int c[]=new int[a.length];
				for(int i=0;i<c.length;i++)
				{
					c[i]=a[i]+b[i];
					System.out.println(c[i]);
				}
			}
			}
		}

	}


