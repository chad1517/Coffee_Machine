import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationInDays = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();

        int totalCost = (durationInDays * (foodCost) + 2 * (flightCost) + ((durationInDays - 1) * nightCost));

        System.out.println(totalCost);
    }
}