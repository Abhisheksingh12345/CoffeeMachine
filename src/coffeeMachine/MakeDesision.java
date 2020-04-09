package coffeeMachine;

public class MakeDesision {
    private static int espressoWater = 250;
    private static int espressoCoffeeBeans = 16;
    private static int espressoPrice = 4;
    private static int latteWater = 350;
    private static int latteCoffeeBeans = 20;
    private static int lattePrice = 7;
    private static int latteMilk = 75;
    private static int cappuccinoWater = 200;
    private static int cappuccinoCoffeeBeans = 12;
    private static int cappuccinoPrice = 6;
    private static int cappuccinoMilk = 100;

    public static void makeOn(int choice) {
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
