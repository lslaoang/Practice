public class FigureToWord {

    static String convertToWord(int number) {
        char[] numberInChar = String.valueOf(number).toCharArray();
        int digits = numberInChar.length;

        StringBuilder stringBuilder = new StringBuilder();
            for (int x = 0; x < digits; x++) {
                switch (digits) {
                    case 4:
                        switch (x) {
                            case 0 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ").append(higherDigitsInWord(digits)).append(" ");
                            case 1 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ").append(higherDigitsInWord(digits-1)).append(" ");
                            case 2 -> stringBuilder.append(tensInWord(numberInChar[x])).append(" ");
                            case 3 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ");
                        }
                        break;
                    case 3:
                        switch (x) {
                            case 0 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ").append(higherDigitsInWord(digits)).append(" ");
                            case 1 -> stringBuilder.append(tensInWord(numberInChar[x])).append(" ");
                            case 2 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ");
                        }
                        break;
                    case 2:
                        if(numberInChar[0] == '1'){
                            x = digits;
                            stringBuilder.append(tenthsInWord(numberInChar[1]));
                        } else {
                            switch (x) {
                                case 0 -> stringBuilder.append(tensInWord(numberInChar[x])).append(" ");
                                case 1 -> stringBuilder.append(onesInWord(numberInChar[x])).append(" ");
                            }
                        }
                        break;
                    case 1:
                        stringBuilder.append(onesInWord(numberInChar[x])).append(" ");
                        break;
                }
            }

        return stringBuilder.toString();
    }

    private static String onesInWord(char number) {
        return switch (number) {
            case '0' -> "";
            case '1' -> "One";
            case '2' -> "Two";
            case '3' -> "Three";
            case '4' -> "Four";
            case '5' -> "Five";
            case '6' -> "Six";
            case '7' -> "Seven";
            case '8' -> "Eight";
            case '9' -> "Nine";
            default -> null;
        };
    }

    private static String tenthsInWord(char digits) {
        return switch (digits) {
            case '0' -> "Ten";
            case '1' -> "Eleven";
            case '2' -> "Twelve";
            case '3' -> "Thirteen";
            case '4' -> "Fourteen";
            case '5' -> "Fifteen";
            case '6' -> "Sixteen";
            case '7' -> "Seventeen";
            case '8' -> "Eighteen";
            case '9' -> "Nineteen";
            default -> null;
        };
    }

    private static String tensInWord(char digits) {
        return switch (digits) {
            case '2' -> "Twenty";
            case '3' -> "Thirty";
            case '4' -> "Forty";
            case '5' -> "Fifty";
            case '6' -> "Sixty";
            case '7' -> "Seventy";
            case '8' -> "Eighty";
            case '9' -> "Ninety";
            default -> null;
        };
    }

    private static String higherDigitsInWord(int digit) {
        return switch (digit) {
            case 3 -> "Hundred";
            case 4 -> "Thousand";
            default -> null;
        };
    }

    public static void main(String[] args) {
        System.out.println(convertToWord(2134));
        System.out.println(convertToWord(134));
        System.out.println(convertToWord(34));
        System.out.println(convertToWord(4));
        System.out.println(convertToWord(11));
        System.out.println(convertToWord(10));
        System.out.println(convertToWord(20));
        System.out.println(convertToWord(2));
        System.out.println(convertToWord(23));
    }
}
