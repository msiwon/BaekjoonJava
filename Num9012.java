import java.io.*;
public class Num9012 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count;
		for(int i=0;i<T;i++){
		    count = -1;
		    String lst[] = br.readLine().split("");
		    if(lst[0].equals("(")){
		        count++;
		        for(String st : lst){
		            if(st.equals("("))
		                count++;
		            else
		                count--;
		            if(count<0)
		                break;
		        }
		    }
		    
		    if(count==0&&lst[lst.length-1].equals(")"))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
		
		br.close();
	}
}