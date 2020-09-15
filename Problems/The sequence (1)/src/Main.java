import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int counter = 0;


        for (int i = 0; ; i++) {
            for (int j = 1; j <= i; j++) {

                if(counter <= input) {
                    System.out.print(i + " ");
                }
                counter++;

                if (counter == input) {
                    break;
                }
            }

            if (counter == input){
                break;
            }
        }
    }
}