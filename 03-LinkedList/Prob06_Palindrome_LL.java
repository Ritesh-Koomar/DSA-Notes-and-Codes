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
class Solution {
  This solution is actually a brute force solution and takes O(n) time and O(n) space.
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null)
        {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            if(temp.val!=st.pop())
            return false;
            temp = temp.next;
        }  
        return true;   
    }
}
*/
