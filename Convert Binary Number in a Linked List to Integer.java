class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        int num=0;
        for(int i=c-1; i>=0; i--){
            num+=temp.val*(int)Math.pow(2,i);
            temp=temp.next;
        }
        return num;
    }
}