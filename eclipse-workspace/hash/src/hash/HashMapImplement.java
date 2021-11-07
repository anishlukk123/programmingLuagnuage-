package hash;

import java.util.Arrays;

import java.util.LinkedList;

public class HashMapImplement {
private class entry{
private int key;
private String value;

	   
	   public  entry(int key,String value)
	   {
		   this.key = key;
	       this.value = value;
	     
	   } 
	   
}
	
	LinkedList<entry>[]s = new LinkedList[10];
	private int count;
	
	public void put(int key,String value)
	{
		int index = hash(key);
		if(s[index]==null)
		{
			s[index] = new LinkedList<>();
			var entry = new entry(key, value);
			s[index].addLast(entry);
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
	
	public String get(int key)
	{
		int index = hash(key);
		for( var entry:s[index])
		{
			if(entry.key ==key)
			{
				return entry.value;
			}
		}
		return "aaa";
	}

	private int hash(int key) {
		// TODO Auto-generated method stub
		return  key%s.length;
	}

	public void remove(int key)
	{
		
		
		
		int index = hash(key);
		if(s[index] == null)
		{
			return;
		}
			for(var entry:s[index])
			{
				if(entry.key==key)
				{
					s[index].remove(entry);
				}
			}
			
			count--;
			
		}
		
	
	
}
