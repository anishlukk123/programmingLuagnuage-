import java.util.LinkedList;

public class QueueLinkList {
LinkedList<Integer>Queue;

public QueueLinkList()
{
	Queue = new LinkedList<Integer>();
}

public boolean isempty()

{
	
	return Queue.isEmpty();  //0(1)
	
}
public int size()
{
	return Queue.size(); //(0)1
}

public int  peek()
{
	return Queue.get(0); //(0)1
}

public  void enque(int val) //(0)1
{
	Queue.addLast(val);
}

public void deque()
{
	Queue.removeFirst(); // 0(1)
}

@Override
public String toString() {
	return "[" + Queue + "]";
}

}
