class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question05 {
   public static void main(String[] args) {
       ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        
        ListNode result = detectCycle(head);
        if (result != null) {
            System.out.println(result.val);
        } else {
            System.out.println("No cycle");
        }
   } 
   public static ListNode detectCycle(ListNode head) {
         ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
            ListNode start = head;

            while (start != slow) {
                start = start.next;
                slow = slow.next;
            }

            return start; 
        }
        }
        return null;
    }
}
