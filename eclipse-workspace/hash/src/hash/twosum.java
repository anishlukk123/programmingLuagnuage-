package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class twosum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] nums = {1,2,6,4,0};
		var front =  Arrays.toString(tsum(nums,5));
		System.out.println(front);
		
	}
	
	public static int[] tsum(int[]nums,int target)
	{
		HashMap<Integer,Integer>hs = new HashMap<Integer,Integer>();
		
		for(int i =0;i<nums.length;i++)
		{
			hs.put(nums[i],i);
		
			if(hs.containsKey(target-nums[i]))
			{
				return new int[]{i,hs.get(target-nums[i])}
;			}
		}
		return nums;
	}


	
		
		
		
	}


