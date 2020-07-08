package main.java.com.homework7.comparators;

public class Family implements Comparable<Family>{
    private String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    @Override
    public int compareTo(Family o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                ", Qantity Member: " + this.quantityMember +
                ", Title: " + this.title +
                ", Name of Member: " + this.nameOfEmblem;
    }
}
