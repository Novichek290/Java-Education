package controller;

import core1.EvenNumber;
import core1.MaxNumber;
import core2.DeleteDuplicates;
import core2.SecondMaxElement;
import core2.UniqueElement;

import java.util.Scanner;

public class Controller {
    public static void swicher(){
        System.out.println("""
                \nWhat u wanna do?
                1: Is even number?
                2: Which number is max?
                3: Which is unique numbers?
                4: Delete duplicates from List
                5: Second max element
                10: Quit
                """);
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:
                System.out.println("Give me a number:");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("*************************\n" +
                        "Even number is: " + EvenNumber.evenNumber(scanner1.nextInt()) +
                        "\n*************************");
                break;

                case 2:System.out.println("Give me a 2 numbers:");
                   Scanner scanner2 = new Scanner(System.in);
                   System.out.println("*************************\n" +
                           "Max number is: " + MaxNumber.isMax(scanner2.nextInt(), scanner2.nextInt()) +
                           "\n*************************");
                break;

                case 3:
                System.out.println("Uniq numbers in list 1 is: \n*************************");
                for(Integer integer : UniqueElement.isInList()){
                    System.out.print(integer + " ");
            }
                    System.out.println("\n*************************");
                break;
                case 4:
                System.out.println("The collection after deleted duplicates: ");
                    DeleteDuplicates.dD();
                break;
            case 5:
                System.out.println("Second max element is: ");
                SecondMaxElement.secindMaxElement();
                break;
            default:
                System.out.println("*************************\nWRONG NUMBER\n*************************");
            break;
            case 10:
                System.out.println("*************************\nВСЕГО ХАРО-ШЕ-ГО\n*************************");
                System.exit(1);
        }
    }
}
