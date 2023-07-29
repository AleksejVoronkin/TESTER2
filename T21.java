package JAVA.TEST;
import java.util.Scanner;

public class T21 {

    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatFromUser() {

        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число: ");
                number = Float.parseFloat(scanner.nextLine());
                scanner.close();
                isValidInput = true;
            } catch (NumberFormatException ex) {
                System.out.println("Повторите попытку и введите дробное число.");
            }
        }
        return number;
    }
}
