class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Question12 {
    public static void main (String agrs[]){
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = swapPairs(head);
         ListNode curr = head;
         while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode prev = dummy;
        
        // while(prev.next != null && prev.next.next != null){
        //    ListNode first = prev.next;
        //    ListNode second = first.next;

        //    first.next = second.next;
        //    second.next = first;
        //    prev.next = second;

        //     prev = first;
        // }
        // return dummy.next;


        //another method
        ListNode a = swapPairs(head.next.next);
        head.next.next = head;
        ListNode newHead = head.next;
        head.next = a;
        return newHead;
    }
}
