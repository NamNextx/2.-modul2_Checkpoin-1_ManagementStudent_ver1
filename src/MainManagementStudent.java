import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class MainManagementStudent {
    public static void main(String[] args) {
        try {
            final int max = 100;

            ArrayList<SinhVien> sinhViens = new ArrayList<>();
            sinhViens.add(new SinhVien("1", "Hoang van nam", "male", 2, 2, 2));
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
                        ManuManagement.addNewStudent(sinhViens);
                        break;
                    }
                    case 2: {
//
                        System.out.println("2. Show list student");
                        if (sinhViens.size() == 0) {
                            System.out.println("List is empty");
                        } else {
                            ManuManagement.outputSinhVien(sinhViens);
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.println("3. Sort student follow total score");
                            Collections.sort(sinhViens, new StudentIdConparator());
                            sinhViens.sort(new StudentIdConparator());
                            for (SinhVien sinhVien : sinhViens) {
                                ManuManagement.outputSinhVien(sinhViens);
                            }

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
}