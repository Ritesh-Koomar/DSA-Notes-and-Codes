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
class Solution {
  /*
    using the getMiddle function, get the middle node 
    now we just need to update the value at mid to the value next of it and same goes for next
    
    then, we realise the edge cases what if head is null or head.next is null
    -> since for one element it is only the mid so it's deleted and null is returned

    we are trying to reach mid.next.next but what if mid.next is itself null
    this is possible for a list with 2 values hence we delete the middle one that is the second one 
    head.next becomes null and we return head ultimately
  */
    public ListNode deleteMiddle(ListNode head) {
        ListNode mid = getMiddle(head);
        if(head == null || head.next == null)
        return null;
        else if(mid.next==null)
        {
            head.next = null;
        }
        else {
                mid.val = mid.next.val;
                mid.next = mid.next.next;
              }
          return head;
    }
    public ListNode getMiddle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
