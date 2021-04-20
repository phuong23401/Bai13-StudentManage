import java.util.Scanner;

public class Main {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int id;

        while (true) {
            System.out.println("=====================================");
            System.out.println("----- QUẢN LÝ THÍ SINH -----");
            System.out.println("1. Hiển thị danh sách thí sinh");
            System.out.println("2. Thêm mới thí sinh");
            System.out.println("3. Tìm kiếm thì sinh theo số báo danh");
            System.out.println("0. Thoát");
            System.out.println("Mời chọn chức năng: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Admissions.show();
                    break;
                case 2:
                    Admissions.add();
                    System.out.println("Đã thêm thí sinh!");
                    break;
                case 3:
                    id = Admissions.inputId();
                    Admissions.searchById(id);
                    break;
                case 0:
                    System.out.println("Đã thoát!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời chọn chức năng trong menu!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
