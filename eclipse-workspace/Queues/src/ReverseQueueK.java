import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> qs = new ArrayDeque<>();
qs.add(10);
qs.add(20);
qs.add(30);
qs.add(40);
qs.add(50);
System.out.println(qs);
reverseQueue(3,qs);
System.out.println(qs);

		
	}
	
	
	public static void reverseQueue(int k,Queue<Integer> qs)
	{
		int count =0;
	Stack<Integer> reverser = new Stack<Integer>();
	
	while(count!=k)
	{                                         // t
		reverser.push(qs.remove());  // 10 ,20,30
		count++;
	}
	while(count!=0)
	{
		qs.add(reverser.pop());    // 40,50,30,20,10
		count--;
	}
	 for (int i = 0; i < qs.size() - k; i++) {  // 30,20,10,40,50
         qs.add(qs.remove());
   
	 }
	
		
		
	}


	@Override
	public String toString() {
	return "ReverseQueueK []";
	}

}
