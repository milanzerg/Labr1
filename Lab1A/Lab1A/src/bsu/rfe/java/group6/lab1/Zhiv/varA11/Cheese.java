package bsu.rfe.java.group6.lab1.Zhiv.varA11;

public class Cheese extends Food{

    public Cheese(String name, String sth) {
        super(name,sth);
    }

    @Override
    public void consume(String sth) {
        if (!isEaten) {
            System.out.println("That piece of " + this + " is eaten.");
            isEaten = true;
        }
    }

//    public void consume() {
//        if (!isEaten) {
//            System.out.println("That piece of cheese is eaten.");
//            isEaten = true;
//        }
//    }
}