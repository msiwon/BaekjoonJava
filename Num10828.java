import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Stack {
	private int top = -1;
	private ArrayList<Integer> lst = new ArrayList<>();
	public void push(int x) {
		top++;
		this.lst.add(x);
	}
	public void pop() {	
		if(top==-1)
			System.out.println(top);
		else 
			System.out.println(lst.remove(top--));			
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
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		for(int i=0;i<n;i++) {
			String ord[] = br.readLine().split(" ");
			if(ord[0].equals("push")) 
				stack.push(Integer.parseInt(ord[1]));
			else if(ord[0].equals("pop"))
				stack.pop();
			else if(ord[0].equals("size"))
				stack.size();
			else if(ord[0].equals("empty"))
				stack.empty();
			else if(ord[0].equals("top"))
				stack.top();
		}
		br.close();
	}
}