package coffeeMachine;

import java.util.Scanner;

public class Main {
    private static int initialWaterSupply = 400;
    private static int initialMilkSupply = 540;
    private static int initialCoffeeBeanSupply = 120;
    private static int initialCupSupply = 9;
    private static int initialMoneySupply = 550;
    private static Scanner tell = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        menu();
    }

    public static void menu() {
        boolean comeOut = false;
        while (!comeOut) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choice = tell.nextLine();
            switch (choice) {
                case "buy": {
                    buy();
                    break;
                }
                case "fill": {
                    fill();
                    break;
                }
                case "take": {
                    take();
                    break;

                }
                case "remaining": {
                    remaining();
                    break;
                }
                case "exit": {
                    comeOut = true;
                    break;
                }
                default:
                    System.out.println("sorry wrong input :(");
            }

        }
    }

    private static void remaining() {
        System.out.println("\nThe coffee machine has :");
        System.out.println(initialWaterSupply + " of water");
        System.out.println(initialMilkSupply + " of milk");
        System.out.println(initialCoffeeBeanSupply + " of coffee beans");
        System.out.println(initialCupSupply + " of disposable cups");
        System.out.println("$"+initialMoneySupply + " of money");
    }
    private static void buy(){
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        int choice = tell.nextInt();
        makeCoffee(choice);
    }
    private static void fill(){
        System.out.println("Write how many ml of water do you want to add: ");
        initialWaterSupply += tell.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        initialMilkSupply += tell.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        initialCoffeeBeanSupply += tell.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        initialCupSupply += tell.nextInt();
    }
}
