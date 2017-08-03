import java.util.NoSuchElementException;

/**
 * Created by Gauri Ramesh on 08/02/2017.
 */
public class QueueTwoStacks<T> {
    protected MyStack stack1;
    protected MyStack stack2;
    protected int size;

    public QueueTwoStacks(int size) {
        this.size = size;
        this.stack1 = new MyStack(size);
        this.stack2 = new MyStack(size);
    }

    public void enqueue(T element) {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException("Overflow error");
        }
        this.stack1.push(element);
    }

    public T dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Underflow error");
        }
        for(int i = 0; i < this.stack1.getTop(); i++) {
            this.stack2.push(this.stack1.pop());
        }
        T element = (T) this.stack2.pop();
        for(int i = 0; i < this.stack2.getTop(); i++) {
            this.stack1.push(this.stack2.pop());
        }
        return element;
    }

    public boolean isFull() {
        if(this.stack1.top == (size-1)) {
            return true;
        } return false;
    }

    public boolean isEmpty() {
        if(this.stack1.top == 1) {
            return true;
        } return false;
    }

}
