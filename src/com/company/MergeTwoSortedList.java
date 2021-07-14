package com.company;

public class MergeTwoSortedList {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        while (p != null && q != null){
            if(p.val>q.val){
                curr.next= p;
                p=p.next;

            }else{
                curr.next=q;
                q=q.next;
            }
            curr=curr.next;
        }
           while (q!= null){
               curr.next=q;
               curr=curr.next;
               q=q.next;
       }
           while (p!= null){
               curr.next=p;
               curr=curr.next;
               p=p.next;
           }

       return head.next;
    }
}
