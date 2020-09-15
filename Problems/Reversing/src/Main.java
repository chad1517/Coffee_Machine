import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int number1 = number / 100;
        int number2 = (number % 100) / 10;
        int number3 = number % 10;

        int newNumber1 = number1;
        int newNumber2 = number2 * 10;
        int newNumber3 = number3 * 100;

        int result = newNumber1 + newNumber2 + newNumber3;

        System.out.println(result);
    }
}