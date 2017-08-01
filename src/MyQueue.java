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
        this.queueArray[++top] = element;
    }

    public T dequeue() {
        T element = this.queueArray[0];
        for(int i = 0; i < this.queueArray.length-1; i++) {
            this.queueArray[i] = this.queueArray[i+1];
        }
        this.queueArray[this.queueArray.length] = null;
        return element;

    }

    public T peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Underflow error");
        }
        return this.queueArray[0];
    }

    public boolean isEmpty() {
        if(this.top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(this.top==(this.size -1)) {
            return true;
        }
        return false;
    }
}
