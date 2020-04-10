package coffeeMachine;

public class MakeDesision extends Main {


    public static void makeOn(int choice) {
        int espressoWater = 250;
        int espressoCoffeeBeans = 16;
        int espressoPrice = 4;
        int latteWater = 350;
        int latteCoffeeBeans = 20;
        int lattePrice = 7;
        int latteMilk = 75;
        int cappuccinoWater = 200;
        int cappuccinoCoffeeBeans = 12;
        int cappuccinoPrice = 6;
        int cappuccinoMilk = 100;
        switch (choice) {

            case 1: {
                if (Main.getInitialWaterSupply() >= espressoWater && Main.getInitialCoffeeBeanSupply() >= espressoCoffeeBeans) {
                    System.out.println("I have enough resources, making you a coffee!");
                    Main.setInitialWaterSupply(Main.getInitialWaterSupply() - espressoWater);
                    Main.setInitialCoffeeBeanSupply(Main.getInitialCoffeeBeanSupply() - espressoCoffeeBeans);
                    Main.setInitialMoneySupply(Main.getInitialMoneySupply() + espressoPrice);
                    Main.setInitialCupSupply(Main.getInitialCupSupply() - 1);
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;

            }
            case 2: {
                if (Main.getInitialWaterSupply() >= latteWater && Main.getInitialCoffeeBeanSupply() >= latteCoffeeBeans && Main.getInitialMilkSupply() >= latteMilk) {
                    System.out.println("I have enough resources, making you a coffee!");
                    Main.setInitialWaterSupply(Main.getInitialWaterSupply() - latteWater);
                    Main.setInitialCoffeeBeanSupply(Main.getInitialCoffeeBeanSupply() - latteCoffeeBeans);
                    Main.setInitialMoneySupply(Main.getInitialMoneySupply() + lattePrice);
                    Main.setInitialMilkSupply(Main.getInitialMilkSupply() - latteMilk);
                    Main.setInitialCupSupply(Main.getInitialCupSupply() - 1);
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            }
            case 3: {
                if (Main.getInitialWaterSupply() >= cappuccinoWater && Main.getInitialCoffeeBeanSupply() >= cappuccinoCoffeeBeans) {
                    System.out.println("I have enough resources, making you a coffee!");

                    Main.setInitialWaterSupply(Main.getInitialWaterSupply() - cappuccinoWater);
                    Main.setInitialCoffeeBeanSupply(Main.getInitialCoffeeBeanSupply() - cappuccinoCoffeeBeans);
                    Main.setInitialMoneySupply(Main.getInitialMoneySupply() + cappuccinoPrice);
                    Main.setInitialMilkSupply(Main.getInitialMilkSupply() - cappuccinoMilk);
                    Main.setInitialCupSupply(Main.getInitialCupSupply() - 1);
                } else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            }
            default:
                System.out.println("Sorry wrong input :(");
        }
    }
}
