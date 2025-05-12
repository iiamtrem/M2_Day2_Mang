import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
