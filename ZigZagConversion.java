import java.util.Vector;


public class ZigZagConversion {
//	public String convert(String s, int numRows) {
//		if (s.length() <= numRows){
//			return s;
//		}
//        String result = "";
//        int interval = 2*numRows - 2;
//        for(int i = 0; i < numRows; i++){
//        	int j = i;
//        	while(j < s.length()){
//        		result += s.charAt(j);
//        		int next = j+interval-i*2;
//        		if(i != 0 && i != numRows -1 && next < s.length()){
//        			result += s.charAt(next);
//        		}
//        		j += interval;
//        	}
//        }
//        return result;
//    }
	
	public String convert(String s, int numRows) {
		if(numRows == 1){
			return s;
		}
		String result [] = new String[numRows];
		for (int i = 0; i < numRows; i++) {
			result[i] = "";
		}
		int magic = numRows * 2 -2;
		for(int i = 0; i < s.length(); i++){
			int index = i%magic;
			if(index >= numRows){
				index = magic - index;
			}
			result[index] += s.charAt(i);
		}
		String res = "";
		for(int i = 0; i < numRows; i++){
			res += result[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagConversion s = new ZigZagConversion();
		System.out.println(s.convert("A", 4));
	}

}