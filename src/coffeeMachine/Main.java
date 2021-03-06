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
        menu();
    }

    public static void menu() {
        boolean comeOut = false;
        while (!comeOut) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String choice = tell.next();
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
        System.out.println(((initialMoneySupply != 0) ? "$" : "") + initialMoneySupply + " of money");
    }

    private static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        int choice = tell.nextInt();
        makeCoffee(choice);
    }

    private static void fill() {
        System.out.println("\nWrite how many ml of water do you want to add: ");
        initialWaterSupply += tell.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        initialMilkSupply += tell.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        initialCoffeeBeanSupply += tell.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        initialCupSupply += tell.nextInt();
    }

    private static void take() {
        System.out.println("I gave you $" + initialMoneySupply);
        initialMoneySupply = 0;
    }

    private static void makeCoffee(int choice) {
        MakeDesision.makeOn(choice);
    }

    public static int getInitialWaterSupply() {
        return initialWaterSupply;
    }

    public static void setInitialWaterSupply(int initialWaterSupply) {
      Main.initialWaterSupply = initialWaterSupply;
    }

    public static int getInitialMilkSupply() {
        return initialMilkSupply;
    }

    public static void setInitialMilkSupply(int initialMilkSupply) {
        Main.initialMilkSupply = initialMilkSupply;
    }

    public static int getInitialCoffeeBeanSupply() {
        return initialCoffeeBeanSupply;
    }

    public static void setInitialCoffeeBeanSupply(int initialCoffeeBeanSupply) {
        Main.initialCoffeeBeanSupply = initialCoffeeBeanSupply;
    }

    public static int getInitialCupSupply() {
        return initialCupSupply;
    }

    public static void setInitialCupSupply(int initialCupSupply) {
        Main.initialCupSupply = initialCupSupply;
    }

    public static int getInitialMoneySupply() {
        return initialMoneySupply;
    }

    public static void setInitialMoneySupply(int initialMoneySupply) {
        Main.initialMoneySupply = initialMoneySupply;
    }
}