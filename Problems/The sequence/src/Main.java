import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int temp =0;

        while(s.hasNext()){
           temp = s.nextInt();
           if(temp % 4 == 0 && temp >a){
               a = temp;

}
        }
        System.out.println(a);
    }
}