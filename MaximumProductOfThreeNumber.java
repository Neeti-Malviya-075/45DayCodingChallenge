class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int m1=nums[0]*nums[1]*nums[n-1];
        int m2=nums[n-1]*nums[n-2]*nums[n-3];
        if(m1>m2){
            return m1;
        }
        else{
            return m2;
        }
    }
}