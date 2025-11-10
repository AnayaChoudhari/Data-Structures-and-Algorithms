class Solution {
    public int findGCD(int[] nums) {
        //by using Euclidean
        int a=nums[0]; //min
        int b=nums[nums.length-1]; //max
        for(int i=0;i<=nums.length-1;i++){
            if(a<nums[i]) a=nums[i];
            if(b>nums[i]) b=nums[i];
        }
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
}