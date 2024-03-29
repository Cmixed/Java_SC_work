package Chap03;

public class Example19B {
    public static void main(String[] args) {
        printRectangle(3);
        printRectangle(2);
        printRectangle(6);
    }

    public static void printRectangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}