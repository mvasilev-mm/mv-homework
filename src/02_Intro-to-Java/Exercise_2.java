import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter a value for side A in centimeters: " );
        int sideA = scanner.nextInt();
        System.out.print( "Enter a value for side B in centimeters: " );
        int sideB = scanner.nextInt();
        System.out.print( "Enter a value for side C in centimeters: " );
        int sideC = scanner.nextInt();


        System.out.printf("The parameter of this triangle is: %d cm", sideA + sideB + sideC);
    }
}
