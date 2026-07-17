import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        int[] output = nextLargerNodes(head);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    public static int[] nextLargerNodes(ListNode head) {
     
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        
        int n = values.size();
        int[] result = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
        
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
              
                result[stack.pop()] = values.get(i);
            }
           
            stack.push(i);
        }    
        return result;
    }
}
