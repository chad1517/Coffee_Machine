import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNumber;

    while(sc.hasNext()) {
        inputNumber = sc.nextInt();

        if(inputNumber ==0) {
            break;
        } else if(inputNumber % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }


    }
}