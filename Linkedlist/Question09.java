public class Question09 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int val = 6;
        ListNode res = removeElements(head,val);
        ListNode temp = res;
    while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
    }
    public static ListNode removeElements(ListNode head, int val) {
       ListNode temp = new ListNode(0);
       temp.next = head;

       ListNode curr = temp;

        while(curr.next != null){
           if(curr.next.val == val){
            curr.next = curr.next.next;
           }else{
            curr = curr.next;
           }
        }
        return temp.next;
    }
}
