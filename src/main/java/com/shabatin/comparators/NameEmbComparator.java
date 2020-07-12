package main.java.com.shabatin.comparators;

import main.java.com.shabatin.model.Family;

import java.util.Comparator;

public class NameEmbComparator {
    public static Comparator<Family> sortByNameOfEmblem() {
        return Comparator
                .comparingInt(o -> o.getNameOfEmblem().length());
    }
}
