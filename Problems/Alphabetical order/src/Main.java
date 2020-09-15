import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int length = 0;
        String[] txt = in.nextLine().split(" ");

        for (int i = 0; i < txt.length - 1; i++) {
            k = txt[i].compareTo(txt[i + 1]);
        }
        if ( k > 0)  {
            System.out.println("false");
        } else if(k<0 || k==0) {
            System.out.println("true");
        }
    }
}