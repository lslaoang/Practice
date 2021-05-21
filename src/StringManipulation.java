public class StringManipulation {

    private String removeChar(String word, char index){

        int charLocation = word.indexOf(index);
        char[] nWord = word.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char c : nWord){
            if ((c != index))   sb.append(c);
        }
        String resultWord = sb.toString();
        return resultWord;
    }

    public static void main(String[]args){
            String thisword ="The quick brown fox jumps over the lazy dog";
            StringManipulation sm = new StringManipulation();
            System.out.println(sm.removeChar("The quick brown fox jumps over the lazy dog",'c'));
            System.out.println(thisword.replace("c",""));
    }
}
