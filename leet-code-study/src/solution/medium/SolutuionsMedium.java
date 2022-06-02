package solution.medium;
import java.util.Arrays;

import baseClass.ListNode;

public class SolutuionsMedium {

    public static void main(String[] args) {
        //ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        //ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l1 = ListNode.makeListNodeFromList(Arrays.asList(2, 4, 3));
        ListNode l2 = ListNode.makeListNodeFromList(Arrays.asList(5, 6, 4));
        
//        ListNode l1 = null;
//        ListNode l2 = null;

        new AddTwoNumbers().addTwoNumbers(l1, l2);
    }

    
}

