import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int area = a * b;

        if((c <= area) && ((c % a == 0) || (c % b == 0))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}