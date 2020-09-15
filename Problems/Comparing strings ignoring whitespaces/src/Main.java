import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String firstStringTrimmed = firstString.replace(" " , "");
        String secondStringTrimmed = secondString.replace(" " , "");
                System.out.println(firstStringTrimmed.equals(secondStringTrimmed));
    }
}