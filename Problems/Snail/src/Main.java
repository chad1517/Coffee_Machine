import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int finalHeight = num1 - num2;
        int steps = num2 - num3;

         double result = Math.round(Math.ceil(finalHeight / steps)+1);
         boolean check = false;

         int finalResult = (int) result;


        System.out.println(finalResult);
    }
}