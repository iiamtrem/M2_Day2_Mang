import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần chèn: ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (0 đến " + (n - 1) + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Không thể chèn phần tử vào mảng vì vị trí không hợp lệ.");
            return;
        }

        for (int i = n - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;

        System.out.print("Mảng sau khi chèn: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
