import java.util.*;

public class Num2605 {
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(); //출력할 값 리스트
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine(); //방지
		
		String text = scan.nextLine();
		String[] arr = text.split(" "); //한줄로 받은 값 분리해서 저장
		
		for(int i=0;i<n;i++) { //받은 값 만큼 반복
			num.add(Integer.parseInt(arr[i]),i+1);
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(num.get(i)+" ");
		}
		scan.close();
	}
}
