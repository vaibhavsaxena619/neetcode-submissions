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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> temp = new ArrayList<>();
        for(ListNode list : lists){
            while(list != null){
                temp.add(list.val);
                list= list.next;
            }
        }

        Collections.sort(temp);
       
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : temp) {
            current.next = new ListNode(value);
            current = current.next;
        }

        ListNode result = dummy.next;
        return result;
    }
}
