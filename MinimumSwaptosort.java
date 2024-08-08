class Solution
{
    void swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n=nums.length;
        int[] a= nums.clone() ;
        Arrays.sort(a);
        
        HashMap<Integer,Integer>hm=new HashMap();
        for(int i=0; i<n; i++){
            hm.put(a[i],i);
        }
        int count=0;
        for(int i=0; i<n; i++){
            while(hm.get(nums[i])!=i){
                count++;
                swap(nums,i,hm.get(nums[i]));
            }
        }
        return count;
    }
}