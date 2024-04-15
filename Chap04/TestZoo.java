package Chap04;

import java.util.Random;
import java.util.Scanner;
public class TestZoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animals[] = new Animal[3];
        Random r = new Random();


        System.out.println("现在动物园有三个宿舍，请购买动物");

        for(int i=0; i<animals.length; i++) {
            System.out.println("买小狗输入1，买小猫输入2");
            int x = sc.nextInt();
            if (x == 1) {
                animals[i] = new Dog();
                System.out.println("输入小狗姓名： ");
                String name = sc.next();
                double w = r.nextDouble(bound:20);
                animals[i] = new Dog(name, w);
            }
            if (x==2) {
                
            }
        }


        for(int i=0; i<10; i++) {
            System.out.println("查看动物输入1， 喂食输入2");
            int x = sc.nextInt();
            if (x == 1) {
                for(int j=0; j<animals.length; j++) {
                    System.out.println(
                        animals[i].getName()
                        + "体重： "
                        + animals[i].getWeight()
                    );
                }
            }
            if (x == 2) {
                for(int j=0; j<animals.length; j++) {
                    animals[i].eat();
                }
            }
        }




    }
}