public class LinkedListMergeSort {
    private static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val  = val;
        }
    }

    //Merge sort
    public static Node mergeSort(Node a) {

        if(a.next == null) {
            return a;
        }


        Node p1 = a;
        Node p2 = a.next;

        while(p2 != null && p2.next!=null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        //p1 should be at the middle now.
        Node newHead = p1.next;
        p1.next = null;
        Node leftSide = mergeSort(a);
        Node rightSide = mergeSort(newHead);

        return merge(leftSide, rightSide);


    }

    public static Node merge(Node a, Node b) {
        Node resultTracker = null;
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        if(a.val <= b.val) {
            resultTracker = a;
            resultTracker.next = merge(a.next, b);
        } else {
            resultTracker = b;
            resultTracker.next = merge(a, b.next);
        }
            return resultTracker;
    }

    public static void main (String [] args) {
        Node a = new Node(0);
        a.next = new Node(3);
        a.next.next = new Node(2);
        a.next.next.next = new Node(5);
        a.next.next.next.next = new Node(-1);
        Node result = mergeSort(a);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

