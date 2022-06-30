import java.util.Scanner;

public class Num2839 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		while(true) {
			if(N%5==0) {
				count+=N/5;
				break;
			}
			if(N<0) {
				count=-1;
				break;
			}
			else if(N==0) {
				System.out.print(count);
				break;
			}
			N-=3;
			count++;
		}
		System.out.print(count);
		scan.close();
	}
}
