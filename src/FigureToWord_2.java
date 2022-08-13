public class FigureToWord_2 {

    public static String figureToWord(int number) {
        String hundred = " hundred";
        String numberInWord = "";

        if (number == 0) {
            return " zero";
        }

        if (number < 100) {
            if (number / 10 > 1) {
                return tensNames[number / 10] + onesNames[number % 10];
            } else {
                return onesNames[number];
            }

        }

        if (number % 100 > 19) {

            String onesNumber = onesNames[number % 10];
            number /= 10;

            numberInWord = tensNames[number % 10] + onesNumber;
            number /= 10;

            return onesNames[number % 10] + hundred + numberInWord;

        } else {
            numberInWord = onesNames[number % 100];
            number /= 10;
        }

        return onesNames[number % 10] + hundred + numberInWord;
    }







    private static final String[] onesNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] specialNames = {
            "",
            " thousand",
            " million",
            " billion",
            " trillion",
            " quadrillion",
            " quintillion"
    };



    public static void main(String[]args){
        FigureToWord_2 f2word = new FigureToWord_2();
        System.out.println(f2word.figureToWord(120));
        System.out.println(f2word.figureToWord(320));
        System.out.println(f2word.figureToWord(999));
        System.out.println(f2word.figureToWord(20));
        System.out.println(f2word.figureToWord(29));
        System.out.println(f2word.figureToWord(1));
        System.out.println(f2word.figureToWord(0));
    }
}
