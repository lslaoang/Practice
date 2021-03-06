/**
 * Armstrong number is a number which will result to the same figure if you multiply each individual digits.
 * Example : 153 --> 1 x 5 x 3 = 153
 */
public class ArmStrong {

    public boolean isArmStrong(int num){
        int initialValue = num;
        int sum = 0, remainder;
        int digits = numberOfDigits(num);


        while(initialValue > 0){
            remainder = initialValue % 10;
            sum += Math.pow(remainder, digits);
            initialValue = initialValue / 10;
        }
        return sum == num;
    }

    /**
     * Check the number of digits of an input number
     * @param number
     * @return number of digits
     */
    private int numberOfDigits(int number) {
        int counter = 0;
        while(number != 0){
            counter++;
            number = number / 10;
        }
        /* Returned number should be greater than 1. The minimum operation should be square of num */
        return counter == 1 ? 2 : counter;
    }

    public static void main(String[] args){
        ArmStrong armStrong = new ArmStrong();
        System.out.println("Is 153 armstrong? " + armStrong.isArmStrong(153));
        System.out.println("Is 370 armstrong? " +armStrong.isArmStrong(370));
        System.out.println("Is 371 armstrong? " +armStrong.isArmStrong(371));
        System.out.println("Is 407 armstrong? " +armStrong.isArmStrong(407));
        System.out.println("Is 200 armstrong? " +armStrong.isArmStrong(200));
        System.out.println("Is 1 armstrong? " +armStrong.isArmStrong(1));
        System.out.println("Is 0 armstrong? " +armStrong.isArmStrong(0));
        System.out.println("Is 3 armstrong? " +armStrong.isArmStrong(3));
        System.out.println("Is 1634 armstrong? " +armStrong.isArmStrong(1634));
    }
}
