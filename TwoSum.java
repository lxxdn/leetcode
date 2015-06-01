// Problem: Given an array of integers, find two numbers such that they add up to a specific target number.
// 思路： hash表 将每个数和他的index加入hash表，然后看看是否符合要求的数是否已经加入了hash表
// 关键是 hash表查找速度是 O(1)

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++){
			if(hash.get(target - nums[i]) != null){
				result[0] = hash.get(target - nums[i]) + 1;
				result[1] = i + 1;
				break;
			}
			hash.put(nums[i],  i);
		}
		return result;
    }
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
