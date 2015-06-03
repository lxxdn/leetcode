public class StringtoInteger {
	public int myAtoi(String str) {
		// 3 status
		final int BEGIN = 0;
		final int SYMBOL = 1;
		final int NUMBER = 2;
		
		final char SPACE = ' ';
		int status = BEGIN;
		int symbol = 1;
		int result = 0;
		
		for(int i = 0; i < str.length(); i++){
			char chara = str.charAt(i);
			switch (status) {
			case BEGIN:
				if(chara == '+' || chara == '-'){
					status = SYMBOL;
					if (chara == '-'){
						symbol = -1;
					}
				}else if(isNumber(chara)){
					status = NUMBER;
					i--;;
				}else if(chara != SPACE){
					return 0;
				}
				break;
			case SYMBOL:
				if(isNumber(chara)){
					status = NUMBER;
					i--;
				}
				else{
					return 0;
				}
				break;
			case NUMBER:
				if(isNumber(chara)){
					int num = (int)chara -48;
					
					// check max value and min value situation
					if(result > Integer.MAX_VALUE/10 || result*10 >= Integer.MAX_VALUE - num){
						return Integer.MAX_VALUE;
					}else if(result < Integer.MIN_VALUE/10 || result*10 <= Integer.MIN_VALUE + num){
						return Integer.MIN_VALUE;
					}
					result = (result*10 + symbol*num);
				}else{
					return result;
				}
				break;
			default:
				break;
			}
		}
		
		return result;
    }
	public boolean isNumber(char c){
		int num = (int)c - 48;
		return (num >= 0 && num <= 9);
	}
	public static void main(String[] args) {
		StringtoInteger sti = new StringtoInteger();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(sti.myAtoi("-3147483649"));
		
	}

}
