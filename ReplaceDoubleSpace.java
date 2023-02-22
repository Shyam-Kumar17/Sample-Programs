package String;

public class ReplaceDoubleSpace {

	public static void main(String[] args) {
		String s="I  am  Learning  Java";
		char c[]=s.toCharArray();
		String x="";
		for(int i=0;i<c.length;i++)
		{
		if(c[i]==' '&&c[i+1]==' ')
		{
			x=x+"";
		}
		else
		{
			x=x+c[i];
		}
		}
		x=x+c[c.length-1];
		System.out.println(x);
	}

}
