package trainingtasks;



import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
        for (int element : array) {
            System.out.println(element);
        }
        int sumElements = 0;
        for (int element : array) {
            sumElements += element;
        }
        int moreThanEight = 0;
        for (int element : array) {
            if (element > 8) {
                moreThanEight++;
            }
        }

        int equalOne = 0;
        for (int element : array) {
            if (element == 1) {
                equalOne++;
            }
        }

        int evenNumber = 0;
        for (int element: array) {
            if(element % 2 == 0){
                evenNumber++;
            }
        }

        int oddNumber = 0;
        for (int element: array) {
            if(element % 2 != 0){
                oddNumber++;
            }
        }
        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел, равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sumElements);
    }
}
