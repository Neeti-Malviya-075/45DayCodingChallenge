class Solution {
    public boolean validPalindrome(String s) {
    int i=0;
    int j=s.length()-1;

    while(i<j){
       char l=s.charAt(i);
       char r=s.charAt(j);

       if(l!=r) 
        return (compare(s,i+1,j) || compare(s,i,j-1));

        i++;
        j--;

       }
        return true;
     }
    
    public boolean compare(String s, int i, int j){
        while(i<j){
       char l=s.charAt(i);
       char r=s.charAt(j);
        if(l!=r) return false;
        i++;
        j--;
    }
    return true;
    }
}