import java.util.Scanner;

public class MaxInMatrix {
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

        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ của phần tử lớn nhất là: [" + maxRow + "][" + maxCol + "]");
    }
}
