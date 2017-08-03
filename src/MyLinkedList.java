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

    public void insertAtBeginning(T element) {
       if(this.head == null) {
           this.head = new Node(element);
           this.head.setNext(null);
       } else {
           Node<T> oldHead = this.head;
           this.head = new Node(element);
           this.head.setNext(oldHead);
       }
    }

    public void insertAtEnd(T element) {
        Node<T> pointer = this.head;
        while(pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(new Node<>(element));
    }

    public void add(T element, int index) {
        //todo implement;
    }

    public void remove(int index) {
        //TODO implement
    }

    public void clear() {
       //todo implement
    }

    public Node<T> get(int index) {
        //TODO implement.
        int count = 0;
        Node pointer = this.head;
        while(pointer != null) {
            if(count == index) {
                return pointer;
            }
            pointer = pointer.getNext();
            count++;
        }
        return null;
    }




}
