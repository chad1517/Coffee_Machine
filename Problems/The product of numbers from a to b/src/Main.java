import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       long sum = 0;
int temp;
     while(scanner.hasNext()){
         temp = scanner.nextInt();
         sum += temp;
     }


        System.out.println(sum);

    }
}