package bsu.rfe.java.group6.lab1.Zhiv.varA11;

public class Apple extends Food {

    public String size;
    public String Type1 = "small", Type2 = "medium", Type3 = "big";
    public Apple (String name, String size) {
        super(name,size);
    }

    @Override
    public void consume(String sizes) {
        if (!isEaten) {
            System.out.println("That " + this + " " + sizes + " is eaten.");
            isEaten = true;
        }
    }

}