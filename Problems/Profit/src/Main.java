import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double m = sc.nextInt();
        int p = sc.nextInt();
        double k = sc.nextInt();
        int counter = 0;

        while(k > m){

            m += ((m * p) / 100);
            counter++;


        }
        System.out.println(counter);


    }
}