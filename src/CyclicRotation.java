import java.util.Arrays;

public class CyclicRotation {

    private int[] solution(int[] A, int K){
        int lastElement;
        int arrSize = A.length;

        if(arrSize != 0){
            for(int i=0;i<K;i++){
                lastElement = A[arrSize-1];
                for(int x=arrSize-1;x>0;x--){
                    A[x] = A[x-1];
                }
                A[0] = lastElement;
            }
        }
        return A;
    }

    private String solutionB(int[] arrNum, int rotation){

        if(arrNum.length < rotation){
            return "Invalid Input";
        }

        int[] tmpArr = new int[rotation];
        for(int i = 0; i <= tmpArr.length-1; i++){
            tmpArr[i] = arrNum[(arrNum.length-rotation) + i];
        }


        for(int x = arrNum.length-1; x>=0 ;x--){
            if(x < rotation){
                arrNum[x]=tmpArr[x];
            }else {
                arrNum[x] = arrNum[x-rotation];
            }

        }
        return Arrays.toString(arrNum);
    }

    public static void main(String...args){
        CyclicRotation cr = new CyclicRotation();

        System.out.println(Arrays.toString(cr.solution(new int[]{1, 2, 3, 4,5,6,7,8,9},7)));
        //System.out.println(Arrays.toString(cr.solution(new int[]{},5)));
        //System.out.println(Arrays.toString(cr.solution(new int[]{1,2},5)));

        System.out.println(cr.solutionB(new int[]{1, 2, 3, 4,5,6,7,8,9},7));
    }
}
