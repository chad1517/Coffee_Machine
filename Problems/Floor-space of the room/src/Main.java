import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.nextLine();
    double a, b, c, r, area;


        switch(shape) {
        case "triangle" :
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            double p = 0.5 * (a + b + c)  ;
           area =Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(area);
            break;
        case "rectangle" :
            a = sc.nextDouble();
            b = sc.nextDouble();
            area = a * b;
            System.out.println(area);

            break;
        case "circle" :
            r = sc.nextDouble();
            area = 3.14 * (r * r);
            System.out.println(area);

    }
    }
}