import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>s = new ArrayDeque<Integer>();
		s.add(6);
		s.add((7));
		s.add(8); 
		System.out.println(s.toString());
		Queue<Integer> t = ReverseQueue(s);
		System.out.println(t.toString());
		
		
	
}
		
	public static  Queue ReverseQueue(Queue<Integer>s)
	{
		Stack<Integer>s1 = new Stack<Integer>();
		if(!s.isEmpty())
		{
			while(!s.isEmpty())
			{
				s1.push(s.remove()); // 6 7 8 
			}
			
			while(!s1.isEmpty())
					{
				 s.add(s1.pop()); 
					}
				
		}

		return s;	
	
	}


	
	
	

}
