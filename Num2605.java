import java.util.*;

public class Num2605 {
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(); //����� �� ����Ʈ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine(); //����
		
		String text = scan.nextLine();
		String[] arr = text.split(" "); //���ٷ� ���� �� �и��ؼ� ����
		
		for(int i=0;i<n;i++) { //���� �� ��ŭ �ݺ�
			num.add(Integer.parseInt(arr[i]),i+1);
		}
		for(int i=n-1;i>=0;i--) {
			System.out.print(num.get(i)+" ");
		}
		scan.close();
	}
}
