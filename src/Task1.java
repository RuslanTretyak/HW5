import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("начальный массив:");
        printArray(array);
        System.out.println("введите число для добавления к элементам массива");
        Scanner scanner = new Scanner(System.in);
        int adder = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += adder;
            }
        }
        System.out.println("получен массив после добавления числа " + adder + "к каждому элементу");
        printArray(array);
        int sum = 0;
        for (int[] tempArray : array) {
            for (int element : tempArray) {
                sum += element;
            }
        }
        System.out.println("сумма всех элементов массира равна: " + sum);
    }

    private static void printArray(int[][] arrayToPrint) {
        for (int[] line : arrayToPrint) {
            System.out.print("\n");
            for (int elementToPrint : line) {
                System.out.print(elementToPrint + "  ");
            }
        }
        System.out.println("\n");
    }
}