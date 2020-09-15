package machine;
import java.util.Scanner;




public class CoffeeMachine{


    public static void main(String[] args) {

        // System.out.println("Starting to make a coffee");
        // System.out.println("Grinding coffee beans");
        // System.out.println("Boiling water");
        // System.out.println("Mixing boiled water with crushed coffee beans");
        // System.out.println("Pouring coffee into the cup");
        // System.out.println("Pouring some milk into the cup");
        // System.out.println("Coffee is ready!");

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cupAmount = 9;
        int money = 550;

        String selection;
        String coffeeSelection;

        int fillWater;
        int fillMilk;
        int fillCoffeeBeans;
        int fillCupAmount;


        Scanner scanner = new Scanner(System.in);

        // status of the coffee machine
        //System.out.println("The coffee machine has:");
        //System.out.println(water + " of water");
        //System.out.println(milk + " of milk");
        //System.out.println(coffeeBeans + " of coffee beans");
        //System.out.println(cupAmount + " of disposable cups");
        //System.out.println(money + " of money");
        //System.out.println();

        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            selection = scanner.next();

            if (selection.equals("buy")) {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                coffeeSelection = scanner.next();
                switch (coffeeSelection) {
                    case "1":

                        if (water >= 250 && coffeeBeans >= 16 && cupAmount >= 1 && milk >= 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            coffeeBeans -= 16;
                            money += 4;
                            cupAmount -= 1;
                        }else if (water < 250){
                            System.out.println("Sorry, not enough water");
                        } else if (coffeeBeans > 16){
                            System.out.println("Sorry, not enough coffee beans");
                        } else if(cupAmount < 1) {
                            System.out.println("Sorry, not enough disposable cups");
                        }
                        System.out.println();

                        break;
                    case "2":

                        if (water >= 350 && coffeeBeans >= 20 && cupAmount >= 0 && milk >= 75) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 350;
                            milk -= 75;
                            coffeeBeans -= 20;
                            money += 7;
                            cupAmount -= 1;

                        }else if (water < 350){
                            System.out.println("Sorry, not enough water");
                        } else if (coffeeBeans > 20){
                            System.out.println("Sorry, not enough coffee beans");
                        } else if(cupAmount < 1) {
                            System.out.println("Sorry, not enough disposable cups");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk");
                        }
                        System.out.println();

                        break;
                    case "3":

                        if (water >= 200 && coffeeBeans >= 12 && cupAmount >= 1 && milk >= 100) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 200;
                            milk -= 100;
                            coffeeBeans -= 12;
                            money += 6;
                            cupAmount -= 1;

                        }else if (water < 200){
                            System.out.println("Sorry, not enough water");
                        } else if (coffeeBeans > 12){
                            System.out.println("Sorry, not enough coffee beans");
                        } else if(cupAmount < 1) {
                            System.out.println("Sorry, not enough disposable cups");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk");
                        }
                        System.out.println();

                        break;
                    case "back":
                        System.out.println();
                        break;

                }
            } else if (selection.equals("fill")) {
                System.out.println("Write how many ml of water do you want to add:");
                fillWater = scanner.nextInt();
                water += fillWater;
                System.out.println("Write how many ml of milk do you want to add:");
                fillMilk = scanner.nextInt();
                milk += fillMilk;
                System.out.println("Write how many ml of coffee beans do you want to add:");
                fillCoffeeBeans = scanner.nextInt();
                coffeeBeans += fillCoffeeBeans;
                System.out.println("Write how many ml of disposable cups do you want to add:");
                fillCupAmount = scanner.nextInt();
                cupAmount += fillCupAmount;
                System.out.println();
            } else if (selection.equals("take")) {
                System.out.println();
                System.out.println("I gave you " + money);
                money -= money;
                System.out.println();
            } else if (selection.equals("exit")){
                System.out.println();
                System.exit(0);
            } else if (selection.equals("remaining")) {
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(cupAmount + " of disposable cups");
                System.out.println("$" + money + " of money");
                System.out.println();

            }

        }





//        System.out.println("Write how many ml of water the coffee machine has: ");
//        waterInput = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        milkInput = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine:");
//        coffeeInput = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        cupAmount = scanner.nextInt();
//
//        int pWater = waterInput / water;
//        int pMilk = milkInput / milk;
//        int pCoffee = coffeeInput / coffeeBeans;
//
//        int temp = Math.min(pWater,pMilk);
//        int possibleCups = Math.min(temp,pCoffee);
//
//
//
//        if((possibleCups == 1) || (possibleCups == 0)) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if ((possibleCups >= 1) && (possibleCups > cupAmount)) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +( possibleCups - 1) +" more than that");
//        }else {
//            System.out.println("No, I can make only " + possibleCups + " cup(s) of coffee");
//        }




    }


}
