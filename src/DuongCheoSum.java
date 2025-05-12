import java.util.Scanner;

public class DuongCheoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước ma trận vuông: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("Nhập các giá trị cho ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng các phần tử ở đường chéo chính là: " + sum);
    }
}
