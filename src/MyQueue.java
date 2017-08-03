import java.util.NoSuchElementException;

/**
 * Created by req91304 on 08/01/2017.
 */
public class MyQueue<T> {
    public int top;
    public int rear;
    public int size;
    public T[] queueArray;

    public MyQueue(int size) {
        this.rear = 0;
        this.top = -1;
        this.size = size;
        this.queueArray = (T[]) new Object[this.size];
    }

    public void enqueue(T element) {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.queueArray[++this.top] = element;
    }

    public T dequeue() {
        T element = this.queueArray[0];
        for(int i = 0; i < this.top; i++) {
            this.queueArray[i] = this.queueArray[i+1];
        }
        this.queueArray[this.top] = null;
        this.top--;
        return element;

    }

    public T peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Underflow error");
        }
        return this.queueArray[0];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return(this.top==(this.size -1));
    }

    public int getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T[] getQueueArray() {
        return queueArray;
    }


    public static void main (String [] args) {
        QueueTwoStacks queue = new QueueTwoStacks(10);
        queue.enqueue("Hello");
        queue.enqueue("my");
        queue.enqueue("Name");
        queue.enqueue("is");
        queue.enqueue("Gauri");

    }
}
