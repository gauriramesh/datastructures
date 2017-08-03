/**
 * Gauri Ramesh
 */
public class MyLinkedList<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
        public Node<T> getNext() {
            return next;
        }
        public T getData(){
            return data;
        }
    }

    protected Node head;

    public MyLinkedList(){
        this.head = null;
    }

    public void insert(T element) {
        Node node = new Node(element);
        if(this.head == null) {
            this.head = node;
        } else if(this.head.getNext() == null) {
            this.head.setNext(node);
            node.setNext(null);
        } else {
            //TO BE IMPLEMENTED.
        }
    }


}
