import java.util.ArrayList;
import java.util.Scanner;

public class MainManagementStudent {

    //public static Student sv=new Student();


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // Add first 3 student in list
            ManuManagement manuManagement=new ManuManagement();
            manuManagement.addStudents();

            int selected;

            do {
                ManuManagement.showManu();
                System.out.println("\n Enter your choice");
                selected = scanner.nextInt();
                System.out.flush();

                switch (selected) {
                    case 1: {
/*
System.out.println("1. Enter new student");
ManuManagement.addNewStudent(students);
break;
*/
                    }
                    case 2: {
//
                        System.out.println("2. Show list student");
                        if (manuManagement.students.size() == 0) {
                            System.out.println("List is empty");
                        } else {
                            manuManagement.showListStudent();
                        }
                        break;
                    }
                    case 3: {
                       /* try {
                            System.out.println("3. Sort student follow total score");

                            System.out.println("Pre-sort");
                            manuManagement.showListStudent();
                            System.out.println("After-sort");
                            students.sort(new StudentIdConparator());
                            manuManagement.showListStudent();
                            break;
                        } catch (Exception ex) {
                            throw ex;
                        }*/

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
                        /*if (students.size() <= 0) {
                            System.out.println("List is empty, pls press '1' to add new student to list");
                        } else {
                            System.out.print("\n6. Rename student: pls input id of student");
                            ManuManagement.editSinhVien();
                        }

                        break;*/
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
            } while (selected != 0);
            System.out.flush();


        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.print("Bạn nhập sai chương trình tự động kết thúc.");
            System.exit(0);
        }
    }
}
