class Solution {
    Node compute(Node head) {
        // your code here
        head=reverse(head);
        
        Node ans=head;
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            if(temp.data>temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return reverse(ans);
    }
    Node reverse(Node head){
        Node prev=null;
        Node cur=head;
        
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            
        }
        return prev;
    }
}