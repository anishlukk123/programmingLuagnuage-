package hash;

import java.util.Arrays;
import java.util.LinkedList;



public class HashMap {
	
	
	private class entry
	{
		private int key;
		private int value;

		public entry(int key, int value)
		{
			this.key = key;
			this .value = value;
		}
		
		
	}

	LinkedList<entry>[]s = new LinkedList[10];
	int count =0;
	
	
	
	public void put(int key, int value)
	{
		
			int index = hash(key);
			if(s[index]==null)
			{
				s[index] = new LinkedList<>();
				var entry = new entry(key, value);
				s[index].addLast(entry);
				count++;
				return;
			
			}
			
			else
			{
				
				for(var entry:s[index])
				{
					if(entry.key==key)
					{
						entry.value = value;
						return;
					}
				}
				
				var entry = new entry(key, value);
				s[index].addLast(entry);
			}
			count++;
			
	}
	
	
	@Override
	public String toString() {
		return "HashMap [s=" + Arrays.toString(s) + ", count=" + count + "]";
	}


	private  int hash(int key) 
	{
		return key/s.length;
		
	}
	
	public  int remove(int key) 
	{
		 int index = hash(key);
		 
		for(var entry:s[index])
		{
			if(entry.key ==key)
			{
				int removedkey = entry.key;
				s[index].removeFirstOccurrence(entry);
				count--;
				return removedkey;
			}
		}
		
		
		
		return count--;
		
	}
	public int  get(int key)
	{
		 int index = hash(key);
		 
			for(var entry:s[index])
			{
				 if(entry.key== key)
				 {
					 return entry.value;
			}
				 
			}
			return -1;
	}
	
	
}
