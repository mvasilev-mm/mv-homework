import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter a value for height H in centimeters: " );
        int heightH = scanner.nextInt();
        System.out.print( "Enter a value for side B in centimeters: " );
        int sideB = scanner.nextInt();


        System.out.printf("The area of this triangle is: %.2f cm", 0.5 * heightH * sideB);
    }
}
