public class missingElement {

    private int missingNumber(int[] A){

        //Using XOR operator

        if(A.length>0){
            int next =1;
            int init = A[0];
            int arrLen = A.length;

           if(A[0]!=0) {
               for (int i = 1; i < arrLen; i++) {
                  init = init ^ A[i];
               }
               for (int i = 2; i <= arrLen + 1; i++){
                   next = next ^ i;
               }
           }

        return (init ^ next);
        }
    return 1;
    }

    public static void main(String[]args){
        missingElement miss = new missingElement();

       System.out.println(miss.missingNumber(new int[] {1,2,3,5,7,4}));
       //System.out.println(miss.missingNumber(new int[] {1,2}));
       //System.out.println(miss.missingNumber(new int[] {3,2}));
       //System.out.println(miss.missingNumber(new int[] {2}));
       //System.out.println(miss.missingNumber(new int[] {}));

    }

}
