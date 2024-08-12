class Solution {
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
      // User function Template for Java

    int n = arr.size();
    for (int i = 1; i < n; i++) {
        if (arr.get(i) < arr.get(i - 1)) {
            return false; // Found an out-of-order pair
        }
    }
    return true; // All elements are in non-decreasing order
    }
}