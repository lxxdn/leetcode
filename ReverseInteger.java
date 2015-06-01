
public class ReverseInteger {
	public int reverse(int x){
		int result = 0;
		while((x % 10) != x){
			result = result*10 + (x % 10);
			x = x/10;
		}
		// 边界检查
		if (result >= Integer.MAX_VALUE/10 || result <= Integer.MIN_VALUE/10){
			if(result >= 0 && (result > Integer.MAX_VALUE/10 || Integer.MAX_VALUE - x < result*10)){
				return 0;
			}else if( result <0 && (result < Integer.MIN_VALUE/10 || Integer.MIN_VALUE -x  > result*10)){
				return 0;
			}
		}

		return result*10 + x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger ri = new ReverseInteger();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(ri.reverse(-1463847412));
	}

}
