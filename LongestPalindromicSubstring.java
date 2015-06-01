// Problem: Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
//
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		String maxPalindrom = "";
		
		for(int i = 0; i < s.length(); i++){
			//Even palindrome
			for(int j = 1; (i+j) < s.length() && i-j+1 >= 0; j++ ){
				if(s.charAt(i-j+1) == s.charAt(i+j)){
					String tmpMax = s.substring(i-j+1, i+j+1);
					maxPalindrom = tmpMax.length() > maxPalindrom.length() ? tmpMax : maxPalindrom;
					if(maxPalindrom.length() == s.length()){
						return maxPalindrom;
					}
				}else{
					break;
				}	
			}
			
			if (maxPalindrom == ""){
				maxPalindrom = s.substring(i, i+1);
			}
			// Odd palindrome
			for(int j = 0; (i+j) < s.length() && (i - j -1) >= 0 ; j++ ){
				if(s.charAt(i - j) == s.charAt(i +j)){
					String tmpMax = s.substring(i-j, i+j+1);
					maxPalindrom = tmpMax.length() > maxPalindrom.length() ? tmpMax : maxPalindrom;
					if(maxPalindrom.length() == s.length()){
						return maxPalindrom;
					}
				}else{
					break;
				}
			}
		}
		return maxPalindrom;
    }
	public static void main(String[] args) {
		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		System.out.println(lps.longestPalindrome("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
	}

}
