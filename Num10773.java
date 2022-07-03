import java.util.*;

public class Num10773 {
	public static void main(String[]args){
        List<Integer> lst = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int num = scan.nextInt();
            if(num==0){
                lst.remove(lst.size()-1);
            }
            else{
                lst.add(num);
            }
        }
        for(Integer num : lst){
            sum+=num;
        }
        System.out.print(sum);
        scan.close();
    }
}
