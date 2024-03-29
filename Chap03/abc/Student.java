package Chap03.abc;

public class Student {
    int id;
    int age;
    private String name;
    String phoneNumber;
    String address;

    public static void main(String[] args) {

    }

    public String getName() {
        return "STU: " + name;
    }

    public String getid() {
        return "STU ID: " + id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int id) {
        this.id = id;
    }
}