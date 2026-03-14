import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius and length from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate area and volume
        double cylinderArea = calculateArea(radius);
        double cylinderVolume = calculateVolume(cylinderArea, length);

        // Display the results
        System.out.printf("The area of the cylinder is: %.2f%n", cylinderArea);
        System.out.printf("The volume of the cylinder is: %.2f%n", cylinderVolume);

        scanner.close();
    }

    // Function to calculate area of a cylinder
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Function to calculate volume of a cylinder
    public static double calculateVolume(double area, double length) {
        return area * length;
    }
}