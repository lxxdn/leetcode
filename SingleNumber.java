// Problem: Given an array of integers, every element appears twice except for one. Find that single one.
// 思路：bitmap，其实hash表也是可以的，关键是查找的复杂度是O(1)

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums) {
			result ^= i;
		}
		return result;
    }
}
