package main.java.com.homework7.comparators;

import java.util.Comparator;

public class TitleComparator {
    public static Comparator<Family> comparatorOfTitle(){
        return Comparator.comparing(Family::getTitle).reversed();
    }
}
