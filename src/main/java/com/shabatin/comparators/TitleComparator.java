package main.java.com.shabatin.comparators;

import main.java.com.shabatin.model.Family;

import java.util.Comparator;

public class TitleComparator {
    public static Comparator<Family> comparatorOfTitle() {
        return Comparator.comparing(Family::getTitle).reversed();
    }
}
