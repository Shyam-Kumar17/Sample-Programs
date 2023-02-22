package String;

public class NeonNumber {

	public static void main(String[] args) {
		int number=64;
		int copynumber=number;
		int sum=0;
		while(number>0)
		{
		int a=number^2;
		sum=sum+a;
		}
		if(copynumber==sum);
		{
			System.out.println("NeonNumber");
		}
	}
}
