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

store odd as head
store next of head as even 
keep connecting and keep moving both even and odd forward by 2 to meet their corresponding possitions 
and then move ahead in the list

then you reach the end of both the lists 
that's why it's important to save the head of even so that you can straightaway connect it to the next of odd
return the original head, but all the above execution if head!=null but even if it is still return head

TC : O(n)
SC : O(1)

  */
    public ListNode oddEvenList(ListNode head) {
        if(head!=null)
        {
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while(even!=null && even.next!=null)
            {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
