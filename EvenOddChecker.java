import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput(); // get user input
        String result = checkEvenOrOdd(number); // check if even or odd
        System.out.println(result); // display result
    }

    // method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: "); //ask the user to input an integer
        return scanner.nextInt(); // scans user input
    }

    // method to check if the given number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) { // if the number is divisible by 2, display it as even
            return number + " is an Even number.";
        } else { // if the number is not divisible by 2, display it as odd
            return number + " is an Odd number.";
        }
    }
}
