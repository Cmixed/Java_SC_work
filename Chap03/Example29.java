package Chap03;

public class Example29 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 13, 14, 15 };
        int score = 12;
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < 3; i++) {
            arr2[i] = arr[i];
        }
        arr2[2] = score;
        for (int i = 3; i < arr2.length; i++) {
            arr2[i] = arr[i-1];
        }
        System.out.print("添加新元素之前的 arr 数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
        System.out.println("");
        System.out.print("添加新元素之后的 arr2 数组");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }
    }
}