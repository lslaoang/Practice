public class FigureToWord {

    static String convertToWord(int number) {
        char[] numberInChar = String.valueOf(number).toCharArray();
        int digits = numberInChar.length;

        StringBuilder stringBuilder = new StringBuilder();
        for (int x = 0; x < digits; x++) {
            switch (digits) {
                case 4:
                    switch (x) {
                        case 0 -> stringBuilder.append(onesInWord(numberInChar[x])).append(higherDigitsInWord(digits));
                        case 1 -> {
                            if (numberInChar[x] != '0') {
                                stringBuilder.append(onesInWord(numberInChar[x])).append(higherDigitsInWord(digits - 1));
                            }
                        }
                        case 2 -> x = getTenths(numberInChar, digits, stringBuilder, x);
                        case 3 -> getOnes(numberInChar, stringBuilder, x);
                    }
                    break;
                case 3:
                    switch (x) {
                        case 0 -> stringBuilder.append(onesInWord(numberInChar[x])).append(higherDigitsInWord(digits));
                        case 1 -> x = getTenths(numberInChar, digits, stringBuilder, x);
                        case 2 -> getOnes(numberInChar, stringBuilder, x);
                    }
                    break;
                case 2:
                    x = getTenths(numberInChar, digits, stringBuilder, x);
                    break;
                case 1:
                    getOnes(numberInChar, stringBuilder, x);
                    break;
            }
        }

        return stringBuilder.toString();
    }

    private static int getTenths(char[] numberInChar, int digits, StringBuilder stringBuilder, int x) {
        if (numberInChar[numberInChar.length - 2] == '1') {
            x = digits;
            stringBuilder.append(tenthsInWord(numberInChar[numberInChar.length - 1]));
        } else {
            if (x == 1) {
                stringBuilder.append(onesInWord(numberInChar[x]));
            } else {
                stringBuilder.append(tensInWord(numberInChar[x]));
            }
        }
        return x;
    }

    private static void getOnes(char[] numberInChar, StringBuilder stringBuilder, int x) {
        stringBuilder.append(onesInWord(numberInChar[x]));
    }

    private static String onesInWord(char number) {
        return switch (number) {
            case '1' -> "One ";
            case '2' -> "Two ";
            case '3' -> "Three ";
            case '4' -> "Four ";
            case '5' -> "Five ";
            case '6' -> "Six ";
            case '7' -> "Seven ";
            case '8' -> "Eight ";
            case '9' -> "Nine ";
            default -> "";
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
            default -> "";
        };
    }

    private static String tensInWord(char digits) {
        return switch (digits) {
            case '2' -> "Twenty ";
            case '3' -> "Thirty ";
            case '4' -> "Forty ";
            case '5' -> "Fifty ";
            case '6' -> "Sixty ";
            case '7' -> "Seventy ";
            case '8' -> "Eighty ";
            case '9' -> "Ninety ";
            default -> "";
        };
    }

    private static String higherDigitsInWord(int digit) {
        return switch (digit) {
            case 3 -> "Hundred ";
            case 4 -> "Thousand ";
            default -> "";
        };
    }

    public static void main(String[] args) {

        System.out.println(convertToWord(1031));
        System.out.println(convertToWord(1234));
        System.out.println(convertToWord(2011));
        System.out.println(convertToWord(30));
        System.out.println(convertToWord(31));
        System.out.println(convertToWord(4));
        System.out.println(convertToWord(111));
        System.out.println(convertToWord(1001));
        System.out.println(convertToWord(101));
        System.out.println(convertToWord(1011));
        System.out.println(convertToWord(20));
        System.out.println(convertToWord(2));
        System.out.println(convertToWord(23));
    }
}
