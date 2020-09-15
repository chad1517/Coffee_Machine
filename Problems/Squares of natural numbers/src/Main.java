import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int k = 0;
        while(k <= n){
            k = i * i;
            i++;
            if(k <= n) {
                System.out.println(k);
            }
        }
    }
}