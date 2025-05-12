import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các giá trị cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập số cột muốn tính tổng: ");
        int columnIndex = scanner.nextInt();

        if (columnIndex >= 0 && columnIndex < cols) {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][columnIndex];
            }

            System.out.println("Tổng các phần tử trong cột " + columnIndex + " là: " + sum);
        } else {
            System.out.println("Cột không hợp lệ.");
        }
    }
}
