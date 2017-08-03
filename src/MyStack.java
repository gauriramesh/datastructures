import java.util.NoSuchElementException;

/**
 * Array Implementation of Stack
 * A stack is a data structure that is LIFO (the most recent element put in will be the first one to come off.)
 * Stacks have many useful applications in computer programming.
 * Today we're going to implement an array-based stack. Read the comments for a complete walk through of how this works.
 */
public class MyStack<T> {

    /**
     * We need references to 3 different variables.
     * top: is a reference to the index of the top of the stack.
     * stackArray is the array in which we're holding all of our values. It takes elements of generic type T.
     * size: user-defined size of the stack.
     */

    protected int top;
    protected T[] stackArray;
    protected final int size;

    /**
     * For those new to OOP, right below this is the constructor for the Stack object.
     * We will initialize the stack's size that was passed in as a parameter.
     * Then we will initialize the stackArray reference to be an array of that size.
     * We'll initialize the top of the stack to be -1. This way, every time you push to the stack,
     * top will accurately reflect the index of the top of the stack.
     */

    public MyStack(int size) {
        this.size = size;
        this.stackArray = (T[]) new  Object[size];
        this.top = -1;
    }

    /**
     * PUSH method
     * This method will push any element of type T as long as the stack is not full.
     * Then we add the element to the array and simultaneously preincrement the top.
     */

    public void push(T element) {
        if(isFull()) {
            throw new IndexOutOfBoundsException();
        }
        this.stackArray[++top] = element;
    }

    /**
     * POP method
     * This method will remove any element of type T as long as the stack is not empty.
     * We remove the element from the array and simultaneously decrement the top.
     * We can use the popped element since this method returns it.
     */

    public T pop() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T returnValue = this.stackArray[top];
        this.stackArray[top--] = null;
        return returnValue;
    }

    /**
     * Do we have stack overflow?
     * The naive approach to this is iterating through the array and seeing if all of the spaces are filled.
     * However, a much easier and more efficient way to do this is just check where the index of the top is!
     * If the index of the top of the stack is the size of the stack, that means the last available space is used.
     */

    public boolean isFull() {
        if(this.top == (size - 1)) {
            return true;
        }
        return false;
    }

    /**
     * Do we have stack underflow?
     * We can use a similar approach as above.
     * We initialized an empty stack to have top index of -1. If this is true, then the stack is empty!
     */

    public boolean isEmpty() {
        if(this.top == -1) {
            return true;
        }
        return false;
    }

    /**
     * Here are a few getters and setters because hey, what's an object without them?
     */

    public int getSize() {
        return top;
    }

    public T[] getStackArray() {
        return stackArray;
    }


    public int getCapacity() {
        return size;
    }
}
