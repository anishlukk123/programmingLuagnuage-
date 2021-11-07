import java.util.Arrays;

public class QueuesArray {
	
	private int back;
	private int[] Queue;
	private int count;
	private int front;

 
public QueuesArray(int length)
{
Queue = new int[length];
count =0;
front =0;
back = count;
}

public void enque(int val)
{
   if(!isFull())
   {
	Queue[back] = val;
	 back = (back + 1)%Queue.length;
	count++;
}
	else {
		System.out.print("Queue is full");
	}
	
}
public  boolean isempty()
{
	return count == 0;
}
public  boolean isFull()
{
	return count >= Queue.length;
}

public int peek()
{
	return Queue[front];	
}

public int deque()
{
	if(!isempty())
	{
		
		  var  item = Queue[front];
		  Queue[front] =0;
		  front = (front+1)%Queue.length;
		  count--;
		  
		  return item;
	}
	else
	{
	     return -1;
	}
	
	

}


public  String  QueueString()
{
	
	
	return Arrays.toString(Queue);
	
}


}


// {1,2,3,4,5