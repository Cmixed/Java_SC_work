package Chap04;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, double weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    @Override
    public void eat() {
        System.out.println("dog eat...");
        this.setWeight(this.getWeight() + 1);
    }

}
