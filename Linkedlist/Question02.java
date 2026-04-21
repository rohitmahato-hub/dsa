class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Question02 {
    public static void main(String[] args) {
        // Create list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Question02 obj = new Question02();
        ListNode result = obj.mergeTwoLists(list1, list2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }                
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode newNode = new ListNode(0);
        ListNode currNode = newNode; 
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                currNode.next = list1;
                list1 = list1.next;
            }else{
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }
        if(list1 == null){
            currNode.next = list2;
        }
        if(list2 == null){
            currNode.next = list1;
        }
        return newNode.next;
    } 
}
