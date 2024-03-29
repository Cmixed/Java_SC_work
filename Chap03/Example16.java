package Chap03;

public class Example16 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // System.out.print("\n"); // 等价于 println（）
            System.out.println();
        }
    }
}