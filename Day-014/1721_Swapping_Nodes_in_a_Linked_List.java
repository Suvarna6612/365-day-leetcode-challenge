class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode second = head;

        // Find the kth node from the beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Move fast k nodes ahead
        ListNode fast = first;

        // Find the kth node from the end
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}