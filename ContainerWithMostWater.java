
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length -1;
        for(;i<j;){
            int left = height[i];
            int right = height[j];
            max = Math.max(max, Math.min(left, right)*(j-i));
            if(left > right){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater cwmw = new ContainerWithMostWater();
		
		System.out.println(cwmw.maxArea(new int[]{1,1}));
	}

}
