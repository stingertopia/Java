import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for meter: ");
        double meters = sc.nextDouble();
        System.out.println("Enter a value for foot:");
        double foot = sc.nextDouble();

        double m = foot * 0.305;
        double f = meters * 3.279;
        System.out.println("Value of " + meters +" meter in foor:" + f);
        System.out.println("Value of " + foot + " foor in meter:" +m);
    }
}
