package Chap04;

public class Cat extends Animal{

    public Cat() {

    }

    public Cat(String name, double weight) {

        this.setName(name);
        this.setWeight(weight);
    }

    public void eat() {
        System.out.println("cat ear...");
        this.setWeight(this.getWeight()+1);
    }

    public play() {
        System.out.println("喵喵叫");
    }


}