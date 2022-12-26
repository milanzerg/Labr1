package bsu.rfe.java.group6.lab1.Zhiv.varA11;

public class Cake extends Food{
    public String icing;
    public String Type1 = "chocolate", Type2 = "cream", Type3 = "caramel";
    public Cake (String name, String icing){
        super(name,icing);
    }

    @Override
    public void consume(String icings) {
        if (!isEaten) {
            System.out.println("That "  + icings + " " + this + " is eaten.");
            isEaten = true;
        }
    }

}