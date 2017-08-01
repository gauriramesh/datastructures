/**
 * Array Implementation of Stack
 */
public class MyStack<T> {
    private int top;
    private T[] stackArray;
    private int size;

    public MyStack(int size) {
        this.size = size;
        this.stackArray = (T[]) new  Object[size];
        this.top = -1;
    }

    public void push(T element) {
        if(isFull()) {
            throw new IndexOutOfBoundsException();
        }
        this.stackArray[++top] = element;
    }

    public T pop() {
        if(isEmpty()) {
            throw new NullPointerException("Stack is empty");
        }
        return this.stackArray[top--];
    }

    public boolean isFull() {
        if(this.top==(size - 1)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(this.top== -1) {
            return true;
        }
        return false;
    }

    public int getTop() {
        return top;
    }

    public T[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(T[] stackArray) {
        this.stackArray = stackArray;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
