class Solution {
    public static long m=1000000007;
     public long convertLinkedListToInteger(Node head){
      if(head == null){
          return 0;
      }
      
      Node temp = head;
      long INT = 0;
      while(temp!=null){
          long val = temp.data;
          long rem = val%m;
          INT = ((INT*10) + rem)%m;
          temp = temp.next;
      }
      
      return INT;
     }
    public long multiplyTwoLists(Node l1, Node l2) {
        // Code here
           long a = convertLinkedListToInteger(l1);
          long b = convertLinkedListToInteger(l2);
          
          return (a*b)%m;
    }
}