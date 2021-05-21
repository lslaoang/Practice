public class FrogJmp {
    private int JumpCnt(int initial, int destination, int count){
        double jumpInit = 0;
        int    jumpFinal = 0;
        if(destination>initial && destination>-1){
            jumpInit = (double)(destination-initial)/count;

            jumpFinal = (int)jumpInit;
            if(jumpInit != (double)jumpFinal ){jumpFinal++;}
        }
        return jumpFinal;
    }

    public static void main(String...args){
        FrogJmp fj = new FrogJmp();
        System.out.println(fj.JumpCnt(10,85,30));
        System.out.println(fj.JumpCnt(0,5,1));
        System.out.println(fj.JumpCnt(0,-1,30));
    }
}
