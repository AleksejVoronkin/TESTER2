package JAVA.TEST;

import java.util.Scanner;
public class T24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        String input;
        do {
            System.out.print("Введите строку: ");
            input = scanner.nextLine();
            try {
                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }
                System.out.println("Вы ввели: " + input);
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    while (true);
    scanner.close();
    }
}

