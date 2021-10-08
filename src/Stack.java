import java.util.Arrays;

public class Stack {

    private static  Integer[] stackArray;

    Stack(int size){
        stackArray = new Integer[size];
        System.out.println(stackArray.length);
    }

    public void push(int num){
        for(int i=0;i<stackArray.length;i++){
            if(stackArray[i]==null){
                stackArray[i]=num;
                System.out.println("Pushed to stack:" +num);
                break;
            }
        }
    }

    public void pop(){
        for(int i=stackArray.length-1;i>=0 ;i--){
            if(stackArray[i]!=null){
                System.out.println("Removed from stack:" +stackArray[i]);
                stackArray[i]=null;
                break;
            }
        }
    }

    public void popAll(){
        for(int i=stackArray.length-1;i>=0 ;i--){
            if(stackArray[i]!=null){
                System.out.println("Removed from stack:" +stackArray[i]);
                stackArray[i]=null;
            }
        }
    }

    public void peak(){
        System.out.println(Arrays.toString(stackArray));
    }



    public static void main(String args[]){
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.peak();
        s.pop();
        s.peak();
        s.popAll();
        s.peak();

    }
}
