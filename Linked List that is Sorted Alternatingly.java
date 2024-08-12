class Solution {
    
   public Node sort(Node head){
        
    int[] cnt = new int[120];
    Node ptr = head;

    // Count occurrences
    while (ptr != null) {
        cnt[ptr.data]++;
        ptr = ptr.next;
    }

    // Update the linked list with sorted values
    ptr = head;
    int i = 0;
    while (ptr != null) {
        if (cnt[i] == 0) {
            i++;
        } else {
            ptr.data = i;
            cnt[i]--;
            ptr = ptr.next;
        }
    }

    // Return the head of the sorted list
    return head;

   }


}