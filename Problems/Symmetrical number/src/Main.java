import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

       if(((Character.getNumericValue(n.charAt(0))) == (Character.getNumericValue(n.charAt(3)))) && ((Character.getNumericValue(n.charAt(1))) == (Character.getNumericValue(n.charAt(2))))) {
           System.out.println(1);
       } else {
           System.out.println(69);
       }
    }
}