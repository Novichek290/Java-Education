package controller;

import core1.EvenNumber;
import core1.MaxNumber;

import java.util.Scanner;

public class Controller {
    public void swicher(){
        System.out.println("""
                \nWhat u gonna do?
                1: is "Is even number?"
                2: is "Which is max?"
                3: Which is uniq elem?
                10: Quit
                """);
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:
                System.out.println("Give me a number:");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println(EvenNumber.evenNumber(scanner1.nextInt()));
            break;
            case 2:System.out.println("Give me a 2 numbers:");
                   Scanner scanner2 = new Scanner(System.in);
                   System.out.println("Max number is: "+MaxNumber.isMax(scanner2.nextInt(), scanner2.nextInt()));
            break;
            case 3: /*UniqueElement.isInList(listOne, listTwo);*/
            break;
            default:
                System.out.println("WRONG NUMBER");
            break;
            case 10: System.exit(1);
        }
    }
}
