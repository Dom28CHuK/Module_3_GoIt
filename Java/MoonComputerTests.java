import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        System.out.println("Your string is " + str);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int resultSum = number1 + number2;
        int resultSub = number1 - number2;
        int resultMyl = number1 * number2;
        int resultDiv = number1 / number2;

        System.out.println(resultSum + " " + resultSub + " " + resultMyl + " " + resultDiv);

        scanner.close();
    }
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testMath();
    }
}
