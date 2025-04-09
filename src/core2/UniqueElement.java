package core2;

import java.util.ArrayList;
import java.util.List;
//Найди элементы, которые есть в одном списке, но нет в другом (Коллекции)
//
//Даны два List<Integer>. Найди все элементы, которые есть в первом списке,
// но не во втором, верни их в виде List<Integer>
//
//Пример:

public class UniqueElement {
    public static List<Integer> isInList() {
        List <Integer> list1 = List.of(0, 1 , 2 , 3 , 4 , 5);
        List <Integer> list2 = List.of(3 , 4 , 7);
        List<Integer> result = new ArrayList<>();

        for(Integer num1 : list1) {
            boolean isEqual = false;
            for (Integer num2 : list2){
                if(num1.equals(num2)) {
                    isEqual = true;
                    break;
                }
            }
            if(!isEqual) result.add(num1);
        }
        return result;
    }
}
