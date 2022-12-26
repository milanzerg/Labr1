package bsu.rfe.java.group6.lab1.Zhiv.varA11;

import java.util.Scanner;

public abstract class Food implements Consumable {

    boolean isEaten = false;
    String name = null;
    String sth = null;
    public Food(String name, String sth ) {
        this.name = name;
        this.sth = sth;
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void equals(int N, String[] icings, Cake[] Row) {
        int numType1 = 0, numType2 = 0, numType3 = 0;
        System.out.print("Enter the cake types (chocolate, cream, caramel):\n");
        for (int i = 0; i < N; i++){
            System.out.print("cake " + i + ": ");
            Scanner temp = new Scanner(System.in);
            label:
            while (true){
                icings[i] = temp.nextLine();
                switch (icings[i]) {
                    case "chocolate":
                        numType1++;
                        break label;
                    case "cream":
                        numType2++;
                        break label;
                    case "caramel":
                        numType3++;
                        break label;
                }
            }
            Row[i] = new Cake("Cake",icings[i]);
        }
        System.out.print("Enter one of the available cake icing types (chocolate, cream, caramel): ");
        Scanner stroke = new Scanner(System.in);
        String icingType = stroke.nextLine();
        switch (icingType) {
            case "chocolate" -> System.out.print("The number of chocolate cakes: " + numType1 + "\n");
            case "cream" -> System.out.print("The number of cream cakes: " + numType2 + "\n");
            case "caramel" -> System.out.print("The number of caramel cakes: " + numType3 + "\n");
        }
    }

//    @Override
//    public void consume(String sth) {
//        if (!isEaten) {
//            System.out.println("That " + this.name + this.sth + " is eaten.");
//            isEaten = true;
//        }
//    }

}