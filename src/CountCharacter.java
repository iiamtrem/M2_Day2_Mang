import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập ký tự cần đếm: ");
        char character = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }

        System.out.println("Ký tự '" + character + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
