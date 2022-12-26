import bsu.rfe.java.group6.lab1.Zhiv.varA11.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the number of cakes: ");
        Scanner numCakConsume = new Scanner(System.in);
        int NCakes = Integer.parseInt(numCakConsume.nextLine());
        Cake[] CakesRow = new Cake[NCakes];
        String[] icings = new String[NCakes];
        Food.equals(NCakes, icings, CakesRow);

        Scanner choices = new Scanner(System.in);


        System.out.print("Enter the number of cheese pieces: ");
        Scanner numCheConsume = new Scanner(System.in);
        int NCheese = Integer.parseInt(numCheConsume.nextLine());
        Cheese[] CheeseRow = new Cheese[NCheese];
        for (int i = 0; i < NCheese; i++) {
            CheeseRow[i] = new Cheese("Cheese","");
        }



        System.out.print("Enter the number of apples: ");
        Scanner numAppConsume = new Scanner(System.in);
        int NApple = Integer.parseInt(numAppConsume.nextLine());
        Apple[] AppleRow = new Apple[NApple];
        String[] sizes = new String[NApple];
        System.out.print("Enter the apple size (small, medium, big):\n");
        for (int i = 0; i < NApple; i++) {
            System.out.print("cake " + i + ": ");
            Scanner temp = new Scanner(System.in);
            label:
            while (true) {
                sizes[i] = temp.nextLine();
                switch (sizes[i]) {
                    case "small":
                        break label;
                    case "medium":
                        break label;
                    case "big":
                        break label;
                }
            }
            AppleRow[i] = new Apple("Apple",sizes[i]);
        }

        int Flength = NApple+NCheese+NCakes;

        Food[] FoodMassive = new Food[Flength];
        for (int i = 0; i < NCheese; i++) {
            FoodMassive[i] = CheeseRow[i];
        }
        for (int i = NCheese; i < NCheese + NApple; i++) {
            FoodMassive[i] = AppleRow[i-NCheese];
        }
        for (int i = NCheese + NApple; i < NCheese + NApple + NCakes; i++) {
            FoodMassive[i] = CakesRow[i-NCheese - NApple];
        }

        for (int i = 0; i <Flength; i++){
            FoodMassive[i].consume("");
        }


        // consuming!
//        for (int i = 0; i < NCakes; i++){
//            CakesRow[i].consume(icings[i]);
//        }
//
//        for (int i = 0; i < NCheese; i++){
//            CheeseRow[i].consume();
//        }
//        for (int i = 0; i < NApple; i++){
//            AppleRow[i].consume(sizes[i]);
//        }
    }
}