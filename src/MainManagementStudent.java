import java.util.ArrayList;
import java.util.Scanner;

public class MainManagementStudent {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        try {
            // Add first student to list

            MainManagementStudent.addStudent();

            Scanner scanner = new Scanner(System.in);
            int slected;

            //   JavaG1.createStudent(javaG1s, count);
            do {
                ManuManagement.showManu();
                System.out.println("\n Enter your choice");
                slected = scanner.nextInt();
                System.out.flush();

                switch (slected) {
                    case 1: {
                        System.out.println("1. Enter new student");
                        ManuManagement.addNewStudent(students);
                        break;
                    }
                    case 2: {
//
                        System.out.println("2. Show list student");
                        if (students.size() == 0) {
                            System.out.println("List is empty");
                        } else {
                            ManuManagement.outputSinhVien(students);
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.println("3. Sort student follow total score");

                            System.out.println("Pre-sort");
                            ManuManagement.outputSinhVien(students);
                            System.out.println("After-sort");
                            students.sort(new StudentIdConparator());
                            ManuManagement.outputSinhVien(students);
                            break;
                        } catch (Exception ex) {
                            throw ex;
                        }

                    }
                    case 4: {
                        System.out.println("4. Check Score sum is sorted ?. ");
                        break;
                    }
                    case 5: {
                        System.out.println("5. Search linearly by total points");
                        break;
                    }
                    case 6: {
//                        if (count.getCountStudent() == 0) {
//                            System.out.println("Chưa có sinh viên nào trong danh sách bạn hãy chọn menu 1 để nhập các thông tin cho sinh viên.");
//                        } else {
//                            System.out.print("\n6. Sửa tên sinh viên có mã được nhập từ bàn phím.");
//                            CheckInput.editSinhVien(javaG1s, count.getCountStudent());
//                        }

                        break;
                    }
                    case 7: {
//                        if (count.getCountStudent() == 0) {
//                            System.out.println("Chưa có sinh viên nào trong danh sách bạn hãy chọn menu 1 để nhập các thông tin cho sinh viên.");
//                        } else {
//                            System.out.print("\n7. Xóa sinh viên có mã sinh viên được nhập từ bàn phím.");
//                            CheckInput.removeAt(javaG1s, count);
//                        }

                        break;
                    }

                    case 0: {
                        System.out.println("Kết thúc.");
                        break;
                    }
                    default: {
                        System.out.println("Chương trình không có chức năng này.");
                        break;
                    }

                }
            } while (slected != 0);
            System.out.flush();


        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.print("Bạn nhập sai chương trình tự động kết thúc.");
            System.exit(0);
        }
    }
    public static void addStudent(){
        students.add(new Student("1", "Hoang van A", "male", 2, 2, 2));
        students.add(new Student("3", "Hoang van B", "male", 2, 2, 2));
        students.add(new Student("3", "Hoang van C", "male", 2, 2, 2));
    }
}
