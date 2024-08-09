class Solution {
    public ListNode middleNode(ListNode head) {
     ListNode temp=head;
     int c=0;
     while(temp!=null){
        c++;
        temp=temp.next;
     }
     temp=head;
     int x=c/2;
     for(int i=0; i<x; i++){
        temp=temp.next;
     }
     head=temp;

     return temp; 
    }
}