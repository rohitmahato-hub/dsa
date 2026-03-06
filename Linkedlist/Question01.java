class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Question01{

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(middleNode(head).val);
    }
//brute force apporach

    // public static  ListNode middleNode(ListNode head) {

    //     int count = 0;
    //     ListNode temp = head;

    //     while(temp != null){
    //         count++;
    //         temp = temp.next;
    //     }

    //     int mid = count / 2;

    //     temp = head;

    //     for(int i = 0; i < mid; i++){
    //         temp = temp.next;
    //     }

    //    return temp;

 //optimum apporach: slow fast apporach
       public static  ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    }
//}