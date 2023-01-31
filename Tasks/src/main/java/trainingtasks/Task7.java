package trainingtasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(dividend / divisor);
        }
    }
}
