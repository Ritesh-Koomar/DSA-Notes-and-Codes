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

This is another O(n) solution 
so we actually need to add in opposite direction i.e. from left to right
so we make another curr node to store the sum list
and initially keep carry as zero
for everytime, the sum begins with carry
we used an or because there's a possibility that one list gets over and other doesn't or that both
lists got over but a carry was still there so everything is covered with such conditions
list will anyway hold the remainder so save and move to next 
also move temp to its next value
Initially the first node is dummy so return the next of it

*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(-1);
        ListNode temp = curr;
        int carry = 0;
        while(l1!=null || l2!=null ||carry!=0)
        {
            int sum = carry;
            if(l1!=null)
            {
                sum += l1.val;
                l1= l1.next;
            }
            if(l2!=null)
            {
                sum += l2.val;
                l2= l2.next;
            }
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
        }
        return curr.next;
    }
}
