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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        boolean carry = false;
        
        
        while(p1 != null || p2 != null) {
            
            int sum = 0;
            
            if(p1 == null){
                sum += p2.val;
                p2 = p2.next;
            }else if (p2 == null) {
                sum += p1.val;
                p1 = p1.next;
            }else{
                sum += (p1.val + p2.val);
                p1 = p1.next;
                p2 = p2.next;
                
            }
            
            //important! check if carry from prev sum
            if(carry) {
                sum++;
            }
            
            if(sum >= 10) {
                sum %= 10;
                carry = true;
            }else{
                carry = false;
            }
            
            ListNode newNode = new ListNode(sum);
            head.next = newNode;
            head = head.next;
        }
        
        //to add if last digits >= 10
        if(carry) {
            head.next = new ListNode(1);
        }
        
        return dummy.next;
        
        
     
        
        
    }
}

/*
Note: the numbers we are actually adding are 342 + 465 = 807

2 4 3
5 6 4
-----
7 0 8 => read as 807

9 9 9 9 9 9 9
9 9 9 9 
-------------
8 9 9 9 0 0 1 => read as 1,009,998

9 9 9
1
------
0 0 0 1 => read as 1000




*/