import java.util.LinkedList;


public class IntegertoRoman {
	public String intToRoman(int num) {
        char[] oneSeries = new char[]{'I', 'X', 'C', 'M'};
        char[] fiveSeries = new char[]{'V', 'L', 'D'};
        String result = "";
        for(int i = 0; num >0; i++){
        	int n = num%10;
        	num /= 10;
        	String n2String = ""; 
        	if(i < 3){
        		switch (n) {
				case 1:
				case 2:
				case 3:
					for(int j = 0; j < n; j++){
						n2String += oneSeries[i];
					}
					break;
				case 4:
					n2String = ""+oneSeries[i]+fiveSeries[i];
					break;
				case 5:
					n2String = ""+fiveSeries[i];
					break;	
				case 6:
				case 7:
				case 8:
					n2String += fiveSeries[i];
					for(int j = 0; j < n-5; j++){
						n2String += oneSeries[i];
					}
					break;
				case 9:
					n2String = "" + oneSeries[i]+oneSeries[i+1];
				default:
					break;
				}
        	}else{
        		for(int j = 0; j< n; j++){
        			n2String += oneSeries[3];
        		}
        	}
        	result = n2String + result;
        }
        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegertoRoman ir = new IntegertoRoman();
		System.out.println(ir.intToRoman(9));
	}

}
