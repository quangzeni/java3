package BaiTapB3;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentList = new Student[5];
        studentList[0] = new Student(01, "A", 20, "Hà Nội", 987812345);
        studentList[1] = new Student(02, "B", 20, "Hà Nội", 987812345);
//        studentList[2] = new Student(03, "C", 20, "Hà Nội", 987812345);
//        studentList[3] = new Student(04, "D", 20, "Hà Nội", 987812345);
        do {
            System.out.println("******Menu*****");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Danh sách sinh viên");
                    for (int i = 0; i < 5; i++) {
                        if (studentList[i] != null) {
                            studentList[i].display();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thêm Sinh viên");
                    Student studentNew = new Student();
                    studentNew.input(scanner);
                    for (int i = 0; i < 5; i++) {
                        if (studentList[i] == null) {
                            studentList[i] = studentNew;
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Chọn mã sinh viên cần sửa: ");
                    int editId = Integer.parseInt(scanner.nextLine());
                    Student studentEdit = new Student();
                    studentEdit.setId(editId);
                    System.out.println("Tên:");
                    studentEdit.setName(scanner.nextLine());
                    System.out.println("tuổi:");
                    studentEdit.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Địa chỉ:");
                    studentEdit.setAddress(scanner.nextLine());
                    System.out.println("phone:");
                    studentEdit.setPhone(Integer.parseInt(scanner.nextLine()));
                    for (int i = 0; i < 5; i++) {
                        if (studentList[i] !=null && studentList[i].getId() == editId){
                            studentList[i] = studentEdit;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Chọn mã sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < 5; i++) {
                        if (studentList[i] !=null && studentList[i].getId() == deleteId){
                            studentList[i] = null;
                        }
                    }
                    System.out.println("Đã xóa xong");
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
        while (true);
    }
}
