import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        int size = scanner.nextInt();
        int[] array = new int[size];
        int n, m;

        for (int i = 0; i < array.length; i++) {
            array[i] += scanner.nextInt();
        }
        n = scanner.nextInt();
        m = scanner.nextInt();
    for(int i = 0;i < array.length-1;i++){
            if ((array[i] == n && array[i+1] ==m) || (array[i] == m && array[i+1]== n)) {
                check = false;
        }
    }
if (check == false) {
    System.out.println("false");
} else {
    System.out.println("true");
}
    }
}