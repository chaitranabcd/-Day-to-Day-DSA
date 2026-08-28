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
    public ListNode reverseList(ListNode head) 
    {
        ListNode pervious = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = pervious;
            pervious = curr;
            curr = next;
        }
        head = pervious;

        ListNode x = head;

        while(x!=null)
        {
            System.out.print(x.val + "<-");
            x = x.next;
        }
        return head;
    }
}