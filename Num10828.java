import java.util.ArrayList;
import java.util.Scanner;

class Stack{
	
	private int top = -1;
	private ArrayList<Integer> lst = new ArrayList<>();
	public void push(int x) {
		top++;
		this.lst.add(x);
	}
	public void pop() {	
		if(top==-1)
			System.out.println(top);
		else {
			System.out.println(lst.remove(top));
			top--;
		}			
	}
	public void size() {
		System.out.println(lst.size());
	}
	public void empty() {
		if(lst.isEmpty())
			System.out.println(1);
		else
			System.out.println(0);
	}
	public void top() {
		if(top==-1)
			System.out.println(top);
		else
			System.out.println(lst.get(top));
	}
}

public class Num10828 {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		Stack stack = new Stack();
		
		for(int i=0;i<=N;i++) {
			String[] imsi = scan.nextLine().split(" ");
			if(imsi[0].equals("push")) {
				stack.push(Integer.parseInt(imsi[1]));
			}
			else if(imsi[0].equals("pop"))
				stack.pop();
			else if(imsi[0].equals("size"))
				stack.size();
			else if(imsi[0].equals("empty"))
				stack.empty();
			else if(imsi[0].equals("top"))
				stack.top();
		}
		
		scan.close();
	}

	
}
