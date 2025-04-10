package core2;

import java.util.*;

public class FrequencyOfWords {
    public Map<String, Integer> frequency () {
        List<String> words = List.of("java" , "git" , "java" , "hibernate", "spring" );
        HashMap <String, Integer> hm = new HashMap<>();
        for(String word : words){
            hm.merge(word, 1,Integer::sum);
        }
        return hm;
    }
}
