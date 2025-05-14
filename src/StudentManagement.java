import java.util.Scanner;

public class StudentManagement {
    static final int MAX = 100;
    static double[] diem = new double[MAX];
    static int soLuong = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int chọn = scanner.nextInt();

            switch (chọn) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                case 1:
                    nhapDanhSachDiem();
                    break;
                case 2:
                    thongKeDiem();
                    break;
                case 3:
                    timKiemDiem();
                    break;
                case 4:
                    phanLoaiHocLuc();
                    break;
                case 5:
                    sapXepDiem();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    static void showMenu() {
        System.out.println("\n MENU ");
        System.out.println("1. Nhập và hiển thị danh sách điểm");
        System.out.println("2. Thống kê điểm");
        System.out.println("3. Tìm kiếm điểm");
        System.out.println("4. Phân loại học lực");
        System.out.println("5. Sắp xếp danh sách điểm");
        System.out.println("0. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    static void nhapDanhSachDiem() {
        System.out.print("Nhập số lượng sinh viên: ");
        soLuong = scanner.nextInt();
        if (soLuong > MAX) {
            System.out.println("Vượt quá số lượng tối đa (100). Vui lòng nhập lại.");
            return;
        }

        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Nhập điểm sinh viên %d: ", i + 1);
            diem[i] = scanner.nextDouble();
        }

        System.out.println("Danh sách điểm:");
        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Sinh viên %d: %.2f\n", i + 1, diem[i]);
        }
    }

    static void thongKeDiem() {
        if (soLuong == 0) {
            System.out.println("Vui lòng nhập dữ liệu");
            return;
        }

        double sum = 0, max = diem[0], min = diem[0];
        int countPass = 0;

        for (int i = 0; i < soLuong; i++) {
            sum += diem[i];
            if (diem[i] >= 5) countPass++;
            if (diem[i] > max) max = diem[i];
            if (diem[i] < min) min = diem[i];
        }

        double tb = sum / soLuong;
        System.out.printf("Điểm trung bình: %.2f\n", tb);
        System.out.printf("Số sinh viên đạt (>=5): %d\n", countPass);
        System.out.printf("Điểm cao nhất: %.2f\n", max);
        System.out.printf("Điểm thấp nhất: %.2f\n", min);
    }

    static void timKiemDiem() {
        if (soLuong == 0) {
            System.out.println("Vui lòng nhập dữ liệu");
            return;
        }

        System.out.print("Nhập điểm cần tìm: ");
        double diemCanTim = scanner.nextDouble();
        boolean timThay = false;

        for (int i = 0; i < soLuong; i++) {
            if (diem[i] == diemCanTim) {
                System.out.printf("Điểm %.2f xuất hiện ở vị trí: %d\n", diemCanTim, i + 1);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy điểm trong danh sách.");
        }
    }

    static void phanLoaiHocLuc() {
        if (soLuong == 0) {
            System.out.println("Vui lòng nhập dữ liệu");
            return;
        }

        System.out.println("Phân loại học lực:");
        for (int i = 0; i < soLuong; i++) {
            String hocLuc;
            if (diem[i] >= 8) {
                hocLuc = "Giỏi";
            } else if (diem[i] >= 6.5) {
                hocLuc = "Khá";
            } else if (diem[i] >= 5) {
                hocLuc = "Trung bình";
            } else {
                hocLuc = "Yếu";
            }
            System.out.printf("Sinh viên %d: %.2f - %s\n", i + 1, diem[i], hocLuc);
        }
    }

    static void sapXepDiem() {
        if (soLuong == 0) {
            System.out.println("Vui lòng nhập dữ liệu");
            return;
        }

        // Bubble sort
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = 0; j < soLuong - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    double temp = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = temp;
                }
            }
        }

        System.out.println("Danh sách điểm sau khi sắp xếp tăng dần:");
        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Sinh viên %d: %.2f\n", i + 1, diem[i]);
        }
    }
}

//https://docs.google.com/document/d/1NdCNXHChsHj2GHG7PVu8Zl95jrIzxNaLuAVoovG-Jw4/edit?tab=t.0#heading=h.tusn3nqpfg4z