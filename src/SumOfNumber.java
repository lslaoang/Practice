import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfNumber {

    static private List<String> addendsOf(int num){

        HashMap<Integer,Integer> setOfNumber = new HashMap<>();
        HashMap<Integer,Integer> results = new HashMap<>();

        for(int x = 1;x<=10 ; x++){
            setOfNumber.put(x,x);
        }

        int delta = 0;
        for(int i = 1; i<=10 ;i++) {
            delta = num - setOfNumber.get(i);
            if (setOfNumber.containsValue(delta)) {
                if(results.containsValue(delta) == results.containsKey(delta)){
                    results.put(delta,setOfNumber.get(i));
                }
            }
        }
    List<String> finalResult = new ArrayList<>();

        for(Map.Entry m : results.entrySet()){
            finalResult.add(m.getKey() +" + "+ m.getValue());
        }

        return  finalResult;
    }


    public static void main(String args[]){
        System.out.println(SumOfNumber.addendsOf(15));
    }
}
