import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Using VECTOR to create stack to avoid size declaration and Runtime exceptions
 */
public class StackVector {
    private static final Vector<Integer> stack = new Vector<>();

    public static void main(String[] args) {
        StackVector stackVector = new StackVector();
        stackVector.push(1);
        stackVector.push(2);
        stackVector.push(3);
        stackVector.push(101011);
        stackVector.push(3);

        stackVector.peak();
        stackVector.pop();
        stackVector.pop();
        stackVector.pop();

        stackVector.popAll();
        stackVector.peak();
    }

    public void peak(){
        List<Integer> list = new ArrayList<>(stack);
       System.out.println("Elements of the stack: " + list);
    }

    public void push(int num) {
        stack.add(num);
        System.out.printf("Number %s added to the stack.\n", num);
    }

    public void pop() {
        int lastElement = stack.lastElement();
        stack.removeElementAt(stack.lastIndexOf(lastElement));
        System.out.printf("Number %d removed from the stack.\n", lastElement);
    }

    public void popAll() {
        stack.removeAllElements();
        System.out.println("Removed all elements in the stack.");
    }
}
