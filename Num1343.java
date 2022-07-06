import java.io.*;
public class Num1343 {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sv = br.readLine();
		sv = sv.replaceAll("XXXX", "AAAA");
		sv = sv.replaceAll("XX","BB");
		if (sv.contains("X"))
			System.out.print(-1);
		else
			System.out.print(sv);
		
		br.close();
	}
}
