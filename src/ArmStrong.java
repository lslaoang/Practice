public class ArmStrong {

    public boolean isArmString(int num){
        int initialValue = num;
        int sum = 0;
        int remainder;
        boolean flag = false;

        while(initialValue > 0){
            remainder = initialValue % 10;
            sum += (remainder * remainder * remainder);
            initialValue = initialValue / 10;
        }
        if(sum == num){
            flag = true;
        }
        return flag;
    }

    public static void main(String args[]){
        ArmStrong armStrong = new ArmStrong();
        System.out.println(armStrong.isArmString(153));
        System.out.println(armStrong.isArmString(370));
        System.out.println(armStrong.isArmString(371));
        System.out.println(armStrong.isArmString(407));
        System.out.println(armStrong.isArmString(200));
        System.out.println(armStrong.isArmString(1));
        System.out.println(armStrong.isArmString(0));
        System.out.println(armStrong.isArmString(3));
    }
}
