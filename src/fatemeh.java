import java.util.Scanner;

public class fatemeh {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("fatemeh");
        System.out.println("enter a number to calculate it's factorial : ");
        System.out.println("the fact is : " + Factorial(scanner.nextInt()));
    }

    public static int Factorial(int number) {
        if (number == 1)
            return 1;
        return number * Factorial(number - 1);
    }
}
