import java.io.*;
public class Num1789{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    long S = Long.parseLong(br.readLine());
	    int i = 0, count = 0;
        while(true){
            i++;
            if(S-i<0)
                break;
            else{
                S-=i;
                count++;
            }
        }
		System.out.println(count);
		br.close();
	}
}