import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admissions {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();
    private static Class classA = new Class("Toán", "Lý", "Hóa");
    private static Class classB = new Class("Toán", "Hóa", "Sinh");
    private static Class classC = new Class("Văn", "Sử", "Địa");

    static {
        Student student1 = new Student(1, "A", "aaa", classA, "Mức độ 1");
        Student student2 = new Student(2, "B", "bbb", classB, "Mức độ 2");
        Student student3 = new Student(3, "C", "ccc", classC, "Khu vực 1");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

    public static void show() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public static void add() {
        int id = inputId();
        String name = inputName();
        String address = inputAddress();
        Class aclass = inputClass();
        String priority = inputPriorityLevel();

        Student student = new Student(id, name, address, aclass, priority);
        studentList.add(student);
    }

    public static void searchById(int id) {
        if (studentList != null) {
            System.out.println(getStudentById(id));
        } else {
            System.out.println("Không tìm thấy sinh viên với số báo danh trên!");
        }
    }

    public static Student getStudentById(int id) {
        Student student = null;
        for (Student student1 : studentList) {
            if (student1.getId() == id) {
                student = student1;
                break;
            }
        }
        return student;
    }

    public static int inputId() {
        System.out.print("Nhập số báo danh sinh viên: ");
        while (true) {
            try {
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (Exception e) {
                System.out.println("Số báo danh không hợp lệ. Vui lòng nhập lại id!");
            }
        }
    }

    public static String inputName() {
        System.out.print("Nhập tên sinh viên: ");
        return scanner.nextLine();
    }

    public static String inputAddress() {
        System.out.print("Nhập địa chỉ sinh viên: ");
        return scanner.nextLine();
    }

    public static Class inputClass() {
        while (true) {
            System.out.print("Nhập khối thi (1-Khối A/ 2-Khối B/ 3-Khối C): ");
            int choose = Integer.parseInt(scanner.nextLine());
            Class aClass = null;
            switch (choose) {
                case 1:
                    aClass = classA;
                    break;
                case 2:
                    aClass = classB;
                    break;
                case 3:
                    aClass = classC;
                    break;
                default:
                    System.out.println("Vui lòng chọn số có trong menu!");
                    break;
            }
            return aClass;
        }
    }

    public static String inputPriorityLevel() {
        while (true) {
            System.out.println("//Nhóm ưu tiên 1 (+2đ): Dân tộc thiểu số, thương binh, bệnh binh, quân nhân tại ngũ được cử đi học, con liệt sĩ.");
            System.out.println("//Nhóm ưu tiên 2 (+1đ): Thanh niên xung phong được cử đi học, con người có công giúp đỡ cách mạng, người khuyết tật, giảng viên, trung cấp dược/ y sĩ.");
            System.out.println("//Khu vực 1 (+0.75đ): Khu vực I, II, III vùng dân tộc và miền núi.");
            System.out.println("//Khu vực 2-NT (+0.5đ): Nông thôn.");
            System.out.println("//Khu vực 2 (+0.25đ): Thị xã/ thành phố trực thuộc tỉnh, ngoại thành.");
            System.out.println("//Khu vực 3 (+0.5đ): Nội thành.");
            System.out.print("Nhập mức độ ưu tiên (1-Nhóm ưu tiên 1/ 2-Nhóm ưu tiên 2/ 3-Khu vực 1/ 4-Khu vực 2-NT/ 5-Khu vực 2/ 6-Khu vực 3): ");
            int choose = Integer.parseInt(scanner.nextLine());
            String priority = null;
            switch (choose) {
                case 1:
                    priority = "Nhóm ưu tiên 1";
                    break;
                case 2:
                    priority = "Nhóm ưu tiên 2";
                    break;
                case 3:
                    priority = "Khu vực 1";
                    break;
                case 4:
                    priority = "Khu vực 2-NT";
                    break;
                case 5:
                    priority = "Khu vực 2";
                    break;
                case 6:
                    priority = "Khu vực 3";
                    break;
                default:
                    System.out.println("Mời chọn số trong menu!");
                    break;
            }
            return priority;
        }
    }
}
