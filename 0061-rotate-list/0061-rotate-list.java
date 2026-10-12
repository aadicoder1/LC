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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int n=0;
        ListNode temp=head;

        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0) return head;

        ListNode i=head,j=head;
        for(int p=0;p<k;p++) j=j.next;
        while(j.next!=null){
            i=i.next;
            j=j.next;
        }

        j.next=head;
        head=i.next;
        i.next=null;
        return head;
    }
}