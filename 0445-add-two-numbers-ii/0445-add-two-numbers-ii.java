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
    public ListNode addTwoNumbers(ListNode head, ListNode head1) {


        ListNode perv1 = null;
        ListNode curr1 = head;
        ListNode next1 = null;

        while(curr1!=null)
        {
            next1 = curr1.next;
            curr1.next = perv1;
            perv1 = curr1;
            curr1 = next1;
        }
        head = perv1;

        ListNode x = head;
        // while(x!=null)
        // {
        //     System.out.print(x.data + " ");
        //     x = x.next;
        // }

        ListNode perv2 = null;
        ListNode curr2 = head1;
        ListNode next2 = null;

        while(curr2!=null)
        {
            next2 = curr2.next;
            curr2.next = perv2;
            perv2 = curr2;
            curr2 = next2;
        }
        head1 = perv2;

        // x = head1;
        // while(x != null)
        // {
        //     System.out.print(x.data + " ");
        //     x = x.next;
        // }
        

        ListNode res = new ListNode(0);
        ListNode temp = res;
        int carry = 0;

        while(head != null || head1 != null || carry != 0)
        {
            int val1 =  head != null ? head.val : 0;
            int val2 = head1 != null ? head1.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;

            if(head != null) head = head.next;

            if(head1 != null) head1 = head1.next;
        }

        // x = res;

        ListNode perv = null;
        ListNode curr = res.next;
        ListNode next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = perv;
            perv = curr;
            curr = next;
        }
        res = perv;

        return res;
    }
}