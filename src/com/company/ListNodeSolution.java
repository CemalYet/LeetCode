package com.company;

public class ListNodeSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y;
            if (sum > 10 || sum == 10) sum=sum+carry-10;carry=1;
            if (sum < 10) sum=sum+carry;carry=0;
            curr.next = new ListNode(sum);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        return head.next;

    }

}
