import controller.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        while(true) Controller.swicher();
//        List<String> words = List.of("java" , "git" , "java" , "hibernate", "spring" );
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words.size(); i++) {
//            String word = words.get(i);
//            if(map.containsKey(word)){
//                map.put(word, map.get(word)+1);
//            } else {
//                map.put(word, 1);
//            }
//        }
////        System.out.println(map);
//////////////////////////////////////////////////////////////
//        String word = "abracadabra gfege !?,...";
//        Map<Character, Integer> charMap = new HashMap<>();
//        char[] wordChar = word.replaceAll("[ !,.?'\"]", "").toCharArray();
//        for (char c : wordChar) {
//            if(charMap.containsKey(c)) {
//                charMap.put(c, charMap.get(c)+1);
//            }
//            else charMap.put(c, 1);
//        }
////        System.out.println(charMap);
//////////////////////////////////////////////////////////////
////        Нужно сгруппировать их по возрасту в Map<Integer, List<Person>>.
//        List<Person> people = List.of(
//                new Person("Alice", 25),
//                new Person("Bob", 30),
//                new Person("Charlie", 25),
//                new Person("David", 30)
//        );
//        Map<Integer, List<Person>> peopleByAge = new HashMap<>();
//        for(Person person : people) {
//            peopleByAge.computeIfAbsent(person.getAge(), k-> new ArrayList<>()).add(person);
//        }
//        System.out.println(peopleByAge);
    }
}
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}