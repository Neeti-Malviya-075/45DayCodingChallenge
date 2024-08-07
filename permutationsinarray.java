   public boolean isPossible(int k, int[] a, int[] b) {
        // Your code goes here.
    Arrays.sort(b);
    Arrays.sort(a);
    int n = a.length;
    for (int i = 0; i < n; i++) {
        if (a[i] + b[n - i - 1] < k) {
            return false;
        }
    }
    return true;
    }
}