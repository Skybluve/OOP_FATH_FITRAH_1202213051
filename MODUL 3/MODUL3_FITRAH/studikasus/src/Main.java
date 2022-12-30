
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Choose an option:");
                System.out.println("1. Calculate Square");
                System.out.println("2. Calculate Circle");
                System.out.println("3. Calculate Trapezoid");
                System.out.println("0. Exit");
                System.out.print("Option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter side: ");
                        double side = input.nextDouble();
                        Calculation calculation = new Calculation();
                        calculation.setSquare(side);
                        System.out.println("Square area: " + calculation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter radius: ");
                        double radius = input.nextDouble();
                        calculation = new Calculation();
                        calculation.setCircle(radius);
                        System.out.println("Circle area: " + calculation.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter a: ");
                        double a = input.nextDouble();
                        System.out.print("Enter b: ");
                        double b = input.nextDouble();
                        System.out.print("Enter t: ");
                        double t = input.nextDouble();
                        calculation = new Calculation();
                        calculation.setTrapezoid(a, b, t);
                        System.out.println("Trapezoid area: " + calculation.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program finished");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Input must be a number");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }
        } while (repeat);
        input.close();
    }
}
  