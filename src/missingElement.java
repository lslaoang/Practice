import java.util.Arrays;

public class missingElement {
    //Conflicting result
    private int usingXOR(int[] a){

        Arrays.sort(a);

        //Using XOR operator
        if(a.length>0){
            int next =1;
            int init = a[0];
            int arrLen = a.length;

            if(a[0]==0){
                for(int x = 0; x<arrLen;x++){
                    a[x] = a[x] +1;
                }
            }

            for (int i = 1; i < arrLen; i++) {
                        init = init ^ a[i];
                    }
            for (int i = 2; i <= arrLen + 1; i++) {
                        next = next ^ i;
            }


        return (init ^ next) ;
        }
    return 1;
    }


    public int usingArray(int[] b){
        Arrays.sort(b);
        int len = b.length;
        int total = 1;

        for(int i =2; i <= (len +1);i++){

            //total length
            //total = total + i;
            total += i;

            //Update the value of total by subtracting it from the starting index
            //total = total - a[i-2];
            total -= b[i-2];

        }
        return total;
    }


    public int usingMath(int[] c){
        Arrays.sort(c);
        int len = c.length;
        int SumOfElements = len * (len + 1) / 2;
        int sum = 0;

        for(int i = 0; i < len-1;i++){
            sum = sum + c[i];
        }
         return SumOfElements - sum;
    }

    public static void main(String[]args){
        missingElement miss = new missingElement();
        int[] a = {9,0,5,3,4,1,6,8,7};
       System.out.println(miss.usingXOR(new int[] {9,0,5,3,4,1,6,8,7}));
       //System.out.println(miss.missingNumber(new int[] {1,2}));
       //System.out.println(miss.missingNumber(new int[] {3,2}));
       //System.out.println(miss.missingNumber(new int[] {2}));
       //System.out.println(miss.missingNumber(new int[] {}));

        System.out.println(miss.usingArray(new int[] {9,0,5,3,4,1,6,8,7}));
        System.out.println(miss.usingMath(new int[] {9,0,5,3,4,1,6,8,7}));

    }

}
