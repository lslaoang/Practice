import java.util.Arrays;

/**
 * @method = solution
 * @param = array (more than one integer), rotation (any integer that indicates the rotation times)
 * Member of an array will be moved in a based on the integer input(rotation)
 */
public class CyclicRotation {

    private int[] solution(int[] A, int K){
        int lastElement;
        int arrSize = A.length;

        if(arrSize != 0){
            for(int i=0;i<K;i++){
                lastElement = A[arrSize-1];
                System.arraycopy(A, 0, A, 1, arrSize - 1);
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
        System.arraycopy(arrNum, (arrNum.length - rotation), tmpArr, 0, tmpArr.length - 1 + 1);

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

        System.out.println(Arrays.toString(cr.solution(new int[]{1, 2, 3, 4,5,6,7,8,9},8)));
        //System.out.println(Arrays.toString(cr.solution(new int[]{},5)));
        //System.out.println(Arrays.toString(cr.solution(new int[]{1,2},5)));

        System.out.println(cr.solutionB(new int[]{1, 2, 3, 4,5,6,7,8,9},8));
        System.out.println(cr.solutionB(new int[]{1, 2, 3, 4,5,6,7,8,9},3));
        System.out.println(cr.solutionB(new int[]{1, 2, 3, 4,5,6,7,8,9},5));
        System.out.println(cr.solutionB(new int[]{1, 2, 3, 4,5,6,7,8,9},0));
    }
}
