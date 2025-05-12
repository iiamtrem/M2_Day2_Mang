import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 12, 7, 15, 20};
        int n = arr.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá: ");
        int x = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                System.out.println("Phần tử " + x + " được tìm thấy tại vị trí " + i);
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử không có trong mảng.");
            return;
        }

        for (int i = index_del; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Mảng sau khi xoá: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
