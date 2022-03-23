import java.util.Vector;

public class StackVector {
    private static Vector<Integer> stack = new Vector<>();

    public static void main(String[] args) {
        StackVector stackVector = new StackVector();
        stackVector.push(1);
        stackVector.push(2);
        stackVector.push(3);

        stackVector.pop();
        stackVector.pop();

        stackVector.popAll();
    }

    public void push(int num) {
        stack.add(num);
        System.out.printf("Number %s added to the stack.\n", num);
    }

    public void pop() {
        int lastElement = stack.lastElement();
        stack.removeElementAt(lastElement - 1);
        System.out.printf("Number %d removed from the stack.\n", lastElement);
    }

    public void popAll() {
        stack.removeAllElements();
        System.out.println("Removed all elements in the stack.\n");
    }
}
