import java.util.Scanner;

public class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();

        int ageResult = age * 10;
        System.out.println(firstName + " " + lastName + " " + ageResult);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());
        System.out.println(ageResult);

        scanner.close();
    }

    public static void main(String[] args) {
        new PassportFormCreator().createForms();
    }
}
