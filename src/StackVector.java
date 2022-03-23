import java.util.Vector;

public class StackVector {
    private static Vector<Integer> stack;

    StackVector() {}

 public void push(int num){
        stack.add(num);
        System.out.printf("Number %s added to the stack.", num);
 }

    public void pop(){
        int lastElement = stack.lastElement();
        stack.removeElementAt(lastElement);
        System.out.printf("Number %d removed from the stack.", lastElement);
    }

    public void popAll(){
        stack.removeAllElements();
        System.out.println("Removed all elements in the stack.");
    }

    public static void main(String[] args){
        StackVector stackVector = new StackVector();
        stackVector.push(1);
        stackVector.push(1);
        stackVector.push(1);
    }
}
