package main.java.com.homework7.comparators;

import java.util.Comparator;

public class NameEmbComparator {
    public static Comparator<Family> sortByNameOfEmblem() {
        return Comparator
                .comparingInt(o -> o.getNameOfEmblem().length());
    }
}
