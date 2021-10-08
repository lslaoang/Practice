public class OrClass {

    static int number1 = 1;
    static int number2 = 2;

    public boolean checkOr(int a){
        boolean flag = false;
        if(a==number1){
           flag =true;
        }

        if(a==number2){
           flag = true;
        }
        return  flag;
    }

    public static void main(String args[]){
        OrClass orClass = new OrClass();

        System.out.println(orClass.checkOr(1));
        System.out.println(orClass.checkOr(2));
        System.out.println(orClass.checkOr(3));
    }
}
