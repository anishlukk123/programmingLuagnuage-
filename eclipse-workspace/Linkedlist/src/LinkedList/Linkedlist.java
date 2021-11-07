package LinkedList;

public class Linkedlist {
	
private class Node
{
	private  int val;
	private Node next;
	
	public Node(int val)
	{
		this.val = val;
	}
}
 Node head;
 Node tail;
 int count;

public void addfirst(int data)
{
	var node = new Node(data);
	
	if(head == null)
	{
		head = tail = node;  // setting the head and tail to
       
	}
	else
	{
		node.next = head;
		head = node;
	}
	count++;
}
public int[] toarray()
{
	int items[] = new int[count];
	Node  current = head;
	for(int i =0;i<count;i++)
	{
		items[i] = current.val;
	  current = current.next;
	}
	return items;
}
	public void addlast(int data)
	{
		var node = new Node(data);
		if(head == null)
		{
			head = tail = node;
		}
		else
		{
			tail.next = node;
			tail = node;
		}
		count++;
	}
	
	public void removefirst ()
	{
		
		if(head == null)
		{
			return;
		}
		else
		{
		     
		    Node nexthead = head.next;
		    head.next = null;
		    head = nexthead;
		     
		  
		  
	}
count--;
}
	public void removelast()
	{
		Node prev = head;
		while(prev.next!=tail&&prev.next!= null)
		{
			prev = prev.next;
		}
		if(prev.next ==tail)
		{
			prev.next = null;
			tail = prev; 
		}
		
		count--;
	}
	
	public int size()
	{
		return count;
	}
	public void reverse()
	{
		Node previous  = head;
		Node current = head.next;
		while(current!= null)
		{
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		tail = head;
		tail.next = null;
		head = previous;
	}
	public  int kthnodefrom(int k)
	{                     //          A  B          
		Node a = head;   // 10,20,30,40,50
		Node b = head;
		
	for(int i =0;i<k-1;i++)
	{
		b =b.next;
	}
	 while(b!=tail)
	 {
		 a= a.next;
		 b = b.next;
	 }
	return a.val;
	}
	
	public  int indexof(int element)
	{
	   int index =0;
	   Node current=head;
	   while(current.val!=element)
	   {
		   current = current.next;
		   index++;
	   }
	   if(current.val == element)
	   {
		   return index;
	   }
	   
	   return -1;
	}
	
	public boolean contains(int element)
	{
		return indexof(element)!= -1;
	}
	public void printmiddle()
	{                        //        A    B
		Node a = head;       // {1,10,20,30,40]
		Node b = head;
		while(b.next !=tail&&b.next!=null)
		{
			a=a.next;
			b= b.next.next;
		}
		if(b==tail)
		{
			System.out.println(a.val);
		}
		else
		{
			System.out.println(a.val+""+a.next.val);
		}
	}
	public boolean hasloop()
	{
		Node a = head;
		Node b = head;
		while(a!=null)
		{
		 a = a.next.next;
		 b= b.next;        
		 if(a==b)        // 10>20>30>10
		 {
			 return true;
		 }
		
	}
	return false;
}
}


