import java.io.*;
import java.util.*;
public class Num11047{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        Long K = Long.parseLong(a[1]);
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        int count = 0;
        for(int i=N-1;i>=0;i--){
            count+=K/arr.get(i);
            K = K%arr.get(i);
            if(K==0)
                break;
        }
        System.out.print(count);
    }
}