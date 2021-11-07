
public class stackbyarray {
	int top;
	int[] arr;
	 int count;
	 
	 
	 public stackbyarray()
	 {
		 top =-1;
		 arr = new int[25];
		 count =0;
	 }
	 
	 public void push(int data)
	 {      
		  arr[count++] = data;
	 }
	 
	 public boolean isempty()
	 {
		 return count==0;
	 }
	 
	 public int peek()
	 {
		 return arr[count-1];
	 }
	 public int pop()
	 {
		
		 return arr[count--];
	 }

}
