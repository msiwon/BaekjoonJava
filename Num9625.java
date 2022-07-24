
import java.io.*;
public class Num9625 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int A = 1; int B = 0; int C = 0;
		int count = 0;
		while(count!=K){
		    C = A;
		    A = B;
		    B = C+B;
		    count++;
		}
		System.out.print(A+" "+B);
		
	}
}