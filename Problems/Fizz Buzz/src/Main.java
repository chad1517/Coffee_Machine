import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if  (a % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            }else if(a % 3 ==0)  {
                System.out.println("Fizz");
            }
            else {
                System.out.println(a);
            }
            a++;
        }
    }
}