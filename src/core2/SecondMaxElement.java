package core2;

import java.util.List;

public class SecondMaxElement {
    public static void secindMaxElement(){
        List<Integer> numbers = List.of(5 , 1 , 9 , 4, 7);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(Integer number : numbers) {
            if(number > max1) {
                max2 = max1;
                max1 = number;
            } else if(number > max2 & number != max1) {
                max2 = number;
            }
        }
        System.out.println("*************************\n" + max2 +
                "\n*************************");
    }
}
