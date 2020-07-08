package main.java.com.homework7.executor;

import main.java.com.homework7.comparators.Family;
import main.java.com.homework7.comparators.NameEmbComparator;
import main.java.com.homework7.comparators.TitleComparator;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Executor {

    public static void start(){
        startOne();
        startTwo();
    }

    public static void startOne(){
       String str = "1, 2, 3, 4, 4, 5";
       deleteDuplicates(str);
    }

    public static void startTwo(){
        Map<Family, Integer> members = new TreeMap<>();
        Map<Family, Integer> data = new TreeMap<>(TitleComparator.comparatorOfTitle());
        Map<Family,Integer> emblems = new TreeMap<>(NameEmbComparator.sortByNameOfEmblem());

        fillMap(members,data,emblems);

        System.out.println("Map:");
        members.forEach(((integer, family) -> System.out.println(integer + " : " + family)));

        System.out.println("Sort by name: ");
        printMap(data);

        System.out.println("Sort by name of Emblem: ");
        printMap(emblems);
    }

    public static void fillMap(Map<Family,Integer> ... maps) {
        for (Map<Family,Integer> map : maps) {
            map.put(new Family("Stalin", 52, "Leader", "USSR Forever!"), 1);
            map.put(new Family("Churchill", 80, "Prime Minister", "England Forever!"), 2);
            map.put(new Family("Gagarin", 63, "Cosmonaut", "To the Space!, To The Moon!"), 3);
            map.put(new Family("Kalashnikov", 82, "engineer", "Do the things!"), 4);
        }
    }

    private static void deleteDuplicates(String str) {
        System.out.println("Source string: " + str);
        System.out.print("Result string: ");

        Arrays.stream(
                str.replaceAll(" ", "")
                        .split(",")
        ).collect(Collectors.toSet())
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static void printMap(Map<Family, Integer> map) {
        map.forEach((Family, Integer) -> System.out.println(Family));
    }
}
