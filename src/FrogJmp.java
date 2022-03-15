public class FrogJmp {
    public static void main(String... args) {
        FrogJmp fj = new FrogJmp();
        System.out.println(fj.JumpCnt(10, 85, 30));
        System.out.println(fj.JumpCnt(0, 5, 1));
        System.out.println(fj.JumpCnt(0, -1, 30));

        System.out.println(fj.jumpCounter(10, 85, 30));
        System.out.println(fj.jumpCounter(0, 5, 1));
        System.out.println(fj.jumpCounter(-1, -1, 1));
        System.out.println(fj.jumpCounter(-10, -1, 0));
    }

    private int JumpCnt(int initial, int destination, int count){
        double jumpInit = 0;
        int jumpFinal = 0;
        if (destination > initial && destination > -1) {
            jumpInit = (double) (destination - initial) / count;

            jumpFinal = (int) jumpInit;
            if (jumpInit != (double) jumpFinal) {
                jumpFinal++;
            }
        }
        return jumpFinal;
    }

    private int jumpCounter(int starting, int destination, int count) {
        if (destination <= starting || count == 0) {
            return 0;
        }
        int offset = destination - starting;
        return (offset % count) == 0 ? offset / count : (offset / count) + 1;
    }
}
