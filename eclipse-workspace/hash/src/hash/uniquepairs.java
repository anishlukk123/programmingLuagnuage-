package hash;


import java.util.HashSet;
import java.util.Set;


public class uniquepairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]nums = {1,7,5,12,9,3};  //(1,3) ( 7,5) (9,7) (5,3)
		var pairs = pairs(nums,2);
		System.out.print(pairs);

	}

	private static int  pairs(int[] nums,int k) {
	Set<Integer> hs = new HashSet<Integer>();
	for(var numbers:nums)
	{
		hs.add(numbers);
	}
	var count =0;
	for(var numbers:nums)
	{
		if(hs.contains(numbers-k))
			count++;
		if(hs.contains(numbers+k))
			count++;
		hs.remove(numbers);
		
	}
	return count++;
	
	




	}
}