import java.math.BigInteger;
import java.util.Scanner;

public class Num1914 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(N).subtract(new BigInteger("1"));
		System.out.print(bi);
		if(N<=20)
			new Hanoi(N,1,2,3);
		
		scan.close();
	}
}
class Hanoi{
	public Hanoi(int n,int a,int c,int b) {
		if(n==1)
			System.out.print("\n"+a+" "+b);
		else {
			new Hanoi(n-1,a,b,c);
			new Hanoi(1,a,c,b);
			new Hanoi(n-1,c,a,b);
		}
	}
}