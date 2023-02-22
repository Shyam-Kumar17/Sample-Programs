package LoopingStatement;

public class Onejava {

	public static void main(String[] args) {
		// no increment will print 1 11 111 1111 11111
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println(" "+(n));
				n++; // print 1 23 456 78910 1112131415
			}
			//n++; //to p0rint 1 22 333 4444 55555
			System.out.println();
			}
		}
	}


