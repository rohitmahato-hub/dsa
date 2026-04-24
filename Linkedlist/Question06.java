class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question06 {
    public static void main(String args[]){
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    int k = 2;

    ListNode result = rotateRight(head, k);

    ListNode temp = result;
    while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
}

    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k % length;
        if(k==0){
           temp.next = null;
           return head;
        }
        ListNode newtemp = head;
        for(int i = 1; i < length-k;i++){
            newtemp = newtemp.next;
        }
        ListNode newNode = newtemp.next;
        newtemp.next = null;
        return newNode;
    }
}
