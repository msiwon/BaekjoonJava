import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



class Queue{
	private ArrayList<Integer> qlst = new ArrayList<>();
	public void push(int x) {
		this.qlst.add(x);
	}
	public void pop() {
		if(qlst.isEmpty())
			System.out.println(-1);
		else
			System.out.println(qlst.remove(0));
	}
	public void size() {
		System.out.println(qlst.size());
	}
	public void empty() {
		if(qlst.isEmpty())
			System.out.println(1);
		else
			System.out.println(0);
	}
	public void front() {
		if(qlst.isEmpty())
			System.out.println(-1);
		else
			System.out.println(qlst.get(0));
	}
	public void back() {
		if(qlst.isEmpty())
			System.out.println(-1);
		else
			System.out.println(qlst.get(qlst.size()-1));
	}
}


public class Num10845 {
	
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue queue = new Queue();
		for(int i=0;i<n;i++) {
			String order[] = br.readLine().split(" ");
			switch(order[0]) {
			case "push": queue.push(Integer.parseInt(order[1])); break;
			case "pop": queue.pop(); break;
			case "size": queue.size(); break;
			case "empty": queue.empty(); break;
			case "front": queue.front(); break;
			case "back": queue.back(); break;
			}
			
		}
		br.close();
	}
	
}
