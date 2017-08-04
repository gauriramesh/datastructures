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
        Node node = new Node(element);
        Node prevNode = this.get(index -1);
        node.setNext(this.get(index));
        prevNode.setNext(node);
    }

    public void remove(int index) {
        Node next = this.get(index).getNext();
        this.get(index).setNext(null);
        this.get(index - 1).setNext(next);
    }

    public void clear() {
      Node pointer = this.head;
      while(pointer.getNext() != null) {
          pointer.setNext(null);
          pointer = pointer.getNext();
      }
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
