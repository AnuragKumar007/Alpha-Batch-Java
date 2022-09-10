public class TrappingRainwater {
    //Time Complexity - O(n)
    public static int trappedRainwater(int height[]){
        int n = height.length;
        int waterLevel =0;
        int trappedWater =0;
        // Calculate Left Max Boundary array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate Right Max Boundary array
        
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loops
        for(int i=0;i<n;i++) {
            // WaterLevel = min(leftMax , rightMax)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // TrappedWater = waterLevel - height[i] * width;
            trappedWater += waterLevel - height[i]; //width =1
        }
        return trappedWater;
    }
    
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        System.out.println("Trapped Rainwater = "+ trappedRainwater(height));
    }
}
