// Problem: Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
// 思路：hash表
import java.util.HashMap;

public class LongestNotRepeatedString {
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		int begin = 0;
		if(s.length() == 0) return 0;

		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

	    for(int i = 0; i < s.length(); i++){
	    	char c = s.charAt(i);
	    	if(hash.containsKey(c)){
	    		int pos = hash.get(c);
	    		if ( pos >= begin) {
	    			max = getMax(max, pos - begin + 1, i - pos);
	    			begin = pos + 1;
	    		}
	    	}
	    	max = getMax(max, i - begin + 1, 0);
	    	hash.put(c, i);
	    }
		return max;
    }

	public int getMax(int a, int b, int c){
		if(a > b){
			return a > c ? a : c;
		}
		return b > c ? b : c;
	}
	public static void main(String[] args) {
		String s = "abcddelkjwe";
		LongestNotRepeatedString lnrs = new LongestNotRepeatedString();
		int result = lnrs.lengthOfLongestSubstring(s);
		System.out.println(result);
	}

}
