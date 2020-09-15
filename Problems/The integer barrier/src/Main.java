import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber;
        int sum = 0;

        while(sc.hasNext()) {
            inputNumber = sc.nextInt();
            sum += inputNumber;

            if (inputNumber == 0) {
                System.out.println(sum);
                break;
            } else if(sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }

    }
}