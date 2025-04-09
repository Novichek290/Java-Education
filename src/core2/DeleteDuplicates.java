package core2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicates {
    public static void dD(){
        List<Integer> numbers = List.of(1 , 2  , 3 , 4 , 5 , 1 , 6 , 1 , 7);
        Set<Integer> set = new HashSet<>(numbers);
        System.out.println("*************************");
        for(Integer integer : set) {
            System.out.print(integer+" ");
        }
        System.out.println("\n*************************");
    }


}
