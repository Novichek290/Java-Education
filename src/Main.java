import controller.Controller;
import core2.DeleteDublicates;import core2.UniqueElement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> listOne = List.of(0, 1 , 2 , 3 , 4 , 5);
//        List<Integer> listTwo = List.of(3 , 4 , 7);
//        List<Integer> result = UniqueElement.isInList(listOne, listTwo);

//        for(Integer integer : result){
//            System.out.print(integer + " ");
//      }

        DeleteDublicates deleteDublicates = new DeleteDublicates();
        deleteDublicates.dD();

        Controller controller = new Controller();
        controller.swicher();
    }
}