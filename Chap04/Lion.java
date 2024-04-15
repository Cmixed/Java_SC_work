package Chap04;

public class Lion extends Animal{

    public Lion() {

    }

    public Lion(String name, double weight) {

        this.setName(name);
        this.setWeight(weight);
    }

    public void Lion() {
        System.out.println("Lion ear...");
        this.setWeight(this.getWeight()+1);
    }

    public Shout() {
        System.out.println("Oi!!!");
    }

    public Sleep() {
        System.out.println("Sleep......"); 
    }


}