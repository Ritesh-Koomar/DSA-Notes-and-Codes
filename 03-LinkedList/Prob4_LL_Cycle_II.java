/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*

The logic again uses hare and tortoise but is a bit optimised
First, we look for the place where slow and fast become equal and break
then slow moves back to head and now fast moves with normal pace until it meets slow
then it's optional to return either slow or fast 

TC : O(n) but two traversals are needed
SC : O(1) 
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head== null)
        return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            break; 
        }
        if(fast==null || fast.next==null)
        return null;
        slow = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
