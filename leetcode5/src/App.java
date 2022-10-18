

public class App {
    
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
    
    
    public static void main(String[] args) throws Exception {
        int[] array = {-2,-3,-2,};
        App app = new App();
        System.out.println(app.maxSubArray(array));
    }
}
