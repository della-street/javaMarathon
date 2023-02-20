package trainingtasks;

import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя цикл for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);

        int min = 10000;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);

        int numberEndsWithZero = 0;
        for (int element : array) {
            if (element % 10 == 0) {
                numberEndsWithZero++;
            }
        }
        System.out.println(numberEndsWithZero);

        int sumEndsWithZero = 0;
        for (int element : array) {
            if (element % 10 == 0) {
                sumEndsWithZero += element;
            }
        }
        System.out.println(sumEndsWithZero);
    }
}
