class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
        for(int i=0; i<n; i++){
            int currIndex=arr[i]-1;
            while((0<=currIndex && currIndex<=n-1) && (arr[i]!=arr[currIndex])){
                int temp=arr[i];
                arr[i]=arr[currIndex];
                arr[currIndex]=temp;
                
                currIndex=arr[i]-1;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=i+1)return i+1;
        }
        return n+1;
    }
}
