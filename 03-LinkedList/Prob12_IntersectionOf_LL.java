/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*

The logic is to first count the total number of nodes in both the lists 
After that, move both the temp nodes to head
Now ensure that both the lists reach the intersection point together by moving them to the same distance from
interesection point.
Once done, traverse both the lists till either of them is null, remember to check first because for the lists 
with same length, they might already be at the same position from the intersection

if nothing is found return null;

*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1 = 0;
        int c2 = 0;
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1!=null)
        {
            t1 = t1.next;
            c1++;
        }
        while(t2!=null)
        {
            t2 = t2.next;
            c2++;
        }
        t1 = headA;
        t2 = headB;

        if(c1>c2)
        {
            for(int i=1;i<=(c1-c2);i++)
            {
                t1 = t1.next;
            }
        }
        else
        {
            for(int i=1;i<=(c2-c1);i++)
            {
                t2 = t2.next;
            }
        }
        while(t1!=null || t2!=null)
        {
            if(t1==t2)
            return t1;
            t1 = t1.next;
            t2 = t2.next;
        }
        return null;
    }
}
