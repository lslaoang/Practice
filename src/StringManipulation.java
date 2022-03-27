public class StringManipulation {

    private String removeChar(String word, char letter){

        char[] nWord = word.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char c : nWord){
            if ((c != letter))   sb.append(c);
        }
        return sb.toString();
    }

    private static String removeWord(String sentence, String word){
            return sentence.replace(word,"");
    }

    public static void main(String[]args){
            String thisWord ="The quick brown fox jumps over the lazy dog";
            StringManipulation sm = new StringManipulation();
            System.out.println(sm.removeChar("The quick brown fox jumps over the lazy dog",'c'));
            System.out.println(sm.removeChar("This is sample of word",'e'));
            System.out.println(thisWord.replace("c",""));

            System.out.println(removeWord("What sentence is this?", "is "));
        System.out.println(removeWord("What is this sentence?", "is "));
    }
}
