package hash;

import java.util.HashMap;

public class mostfrequentnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]nums = {1,3,4,4,6,7};
		var frequent  = frequentnumber(nums);
		System.out.println(frequent);
	}

	private static  int frequentnumber(int[] nums) {
		// TODO Auto-generated method stub
	     HashMap<Integer,Integer> hs = new HashMap<>();
	     int maxfreq = Integer.MIN_VALUE;
	     int maxkey =0;
	     

	     for(int i =0;i<nums.length;i++) // 0(n)
	     { 
	    	 int freq =1;
	    	 if(!hs.containsKey(nums[i]))
	    			 {
	    		 hs.put(nums[i],freq);
	    			 }
	    	 else
	    	 {
	    		 freq++;
	    		 hs.replace( nums[i],freq);
	    	 }
	     }
	     for(int key:hs.keySet()) //0(m)
	     {
	 int  freq =1;
	    	 if(hs.get(key)>=maxfreq&& hs.get(key)>freq)
	    	 {
	    		 maxfreq = hs.get(key);
	    		  maxkey = key;
	    	 }
	     }
	     
	     
	
	     return maxkey;
}
}