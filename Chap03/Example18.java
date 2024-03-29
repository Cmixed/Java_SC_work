package Chap03;

public class Example18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i > 4) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}