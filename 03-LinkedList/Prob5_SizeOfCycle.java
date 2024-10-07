
/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.
/*

The logic is again pretty similar 
First find a place where both slow and fast tend to meet
if they meet, means the solution will exist so just move fast till it reaches back to 
slow (fast moves with normal speed) return c which was initially initialised to 1

TC : O(n)
SC : O(1)
*/
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        boolean loopexists = false;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            // the comparison should be done at the end
            // so that it never misses to give the correct result.
            if(slow == fast)
            {
                loopexists = true;
                break;
            }
        } 
        if(loopexists)
        {
            int c = 1;
            fast = fast.next;
            while(fast!=slow)
            {
                fast = fast.next; 
                c++;
            }
            return c;
        }
        return 0;
    }
}
