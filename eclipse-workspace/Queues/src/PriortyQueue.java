import java.util.Arrays;

public class PriortyQueue {
 int[]items = new int[5];
 private int count;
 
 public void enque(int val)   //  val 2
 {
	 int i;
	 for(i= count-1;i>=0;i--)
	 {
		 if(items[i]>val)
		 {
			 items[i+1] = items[i];
		 }
		 else 
		 {
			 break;
		 }
		 
	 }
	 items[i+1] = val;
	 count++;

	
 }
 
 public   int deque()
 {
	 return items[--count]; 
 }
 
 public   String  ToString()
 {
	 return  Arrays.toString(items);
 }
 
 public boolean isempty()
 {
	 return count ==0;
 }
 
}




