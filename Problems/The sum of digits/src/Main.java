import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wholeNumber = scanner.nextInt();

        int number1 = wholeNumber / 100;
        int number2 = (wholeNumber%100) / 10;
        int number3 = (wholeNumber%10);

        int result = number1 + number2 + number3;

        System.out.println(result);
    }
}