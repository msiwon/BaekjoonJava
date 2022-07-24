import java.io.*;
import java.util.*;
public class Num1371 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		sb.append(" ");
		for(int i=0;i<=50;i++){
		    String st = br.readLine();
		    if(st.equals(""))
		        break;
		    else
		        sb.append(st);
		}
		String str = sb.toString().replace(" ","");
		int max = 0;
		ArrayList<String> arr = new ArrayList<>();
		int ser[] = new int[ch.length];
		ser[0]=0;
		arr.add("");
		for(int i=0;i<ch.length;i++){
		    ser[i] = str.length() - str.replace(String.valueOf(ch[i]),"").length();
		    if(max<ser[i]){
		        max=ser[i];
		        arr.add(String.valueOf(i));
		    }
		    else if(max==ser[i] && max!=0){
		        String before = arr.get(arr.size()-1);
		        String mm = before +" "+ String.valueOf(i);
		        arr.add(mm);
		    }
		}
		String imsi[] = (arr.get(arr.size()-1)).split(" ");
		for(String ha : imsi){
		    System.out.print(ch[Integer.parseInt(ha)]);
		}
	}
}