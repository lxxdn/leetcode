public class StringtoInteger {
	public int myAtoi(String str) {
		if(str.equals("") || str == null){
			return 0;
		}
		boolean positive = true;
		int result = 0;
		int beginIndex = 0;
		char symbol = str.charAt(0);
		if (symbol == '-') {
			beginIndex = 1;
			positive = false;
		}else if( symbol == '+'){
			beginIndex = 1;
		}
		for(int i = beginIndex; i < str.length(); i ++){
			int num = (int)str.charAt(i) - 48;
			if(num == (32-48)){
				continue;
			}
			if (num < 0 || num > 9){
				return 0;
			}
			result = result * 10 + num;
		}
		if(positive == false){
			result *= -1;
		}
        return result;
    }
	public static void main(String[] args) {
		StringtoInteger sti = new StringtoInteger();
		assert sti.myAtoi("123") == 123 ;
		assert sti.myAtoi("-123") == -123 ;
		assert sti.myAtoi("0") == 0 ;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(sti.myAtoi("    010"));
		
	}

}
