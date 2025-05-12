import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("arr1[" + i + "]: ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("arr2[" + i + "]: ");
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }

        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
