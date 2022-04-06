import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        double firstRoot = 0;
        double secondRoot = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter a value for b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter a value for c: ");
        double c = scanner.nextDouble();

        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt)/(2*a);
            secondRoot = (-b - sqrt)/(2*a);
            System.out.println("Roots are: " + firstRoot +" and " + secondRoot);
        }
        else if (determinant == 0){
            System.out.println("Root is: " + (-b + sqrt)/(2*a));
        }
        else {
            System.out.println("The equation has no real roots.");
        }

    }
}
