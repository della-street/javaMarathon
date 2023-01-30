package trainingtasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                break;
            }
            System.out.println(dividend / divisor);
        }
    }
}

