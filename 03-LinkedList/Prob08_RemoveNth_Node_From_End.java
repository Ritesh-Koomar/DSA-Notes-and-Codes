/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*

this is similar to using fast and slow pointer but not exactly the same
so we have 2 pointers both pointing to head
then, we move one pointer ahead by n steps 
then we move both pointers ahead by 1 step till one of them turns null
we have reached the nth node from the end but through the pointer which was late to begin

There's an edge case such that the list has only 2 elements and n = 2
for that case once we move ahead by n
we first search if t1 here turns null if it does we simply return the element next to head as the first
element has to be deleted anyway.

*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t1 = head;
        for(int i=1;i<=n;i++)
        {
            t1 = t1.next;
        }
        if(t1==null)
        {
            return head.next;
        }
        ListNode t2= head;
        while(t1.next!=null)
        {
            t1 = t1.next;
            t2 = t2.next;
        }
        t2.next = t2.next.next;
        return head;
    }
}
