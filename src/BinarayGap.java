public class BinarayGap {

    private int lenOfBinaryGap(int number){
        String strBinary = Integer.toBinaryString(number);
        int count = 0;
        int result = 0;

        System.out.println(strBinary);

        for(int i=0;i<strBinary.length();i++){
            if(strBinary.charAt(i)=='0'){
                count++;
            }
            else{
                if(count>result){result = count;}
                count = 0;
            }
        }

        return result;
    }
    public static void main(String args[]){
        BinarayGap bg =new BinarayGap();
        System.out.println(bg.lenOfBinaryGap(137));
    }
}
