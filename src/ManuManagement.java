import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ManuManagement{


    public static void printLine() {
        for (int i = 0; i <= 100; i++) {
            //boolean testPoint=(i==0 || i=100) ? true: false;
            if (i == 0 || i == 100) {
                System.out.print("+");
            } else System.out.print("-");
        }
    }

    public static void showManu() {
        printLine();
        System.out.printf("\n| %-90s %7s", "Menu: ", "|");
        System.out.printf("\n| %-90s %7s", "1. Nhập một sinh viên mới.", "|");
        System.out.printf("\n| %-90s %7s", "2. Xem danh sách sinh viên.", "|");
        System.out.printf("\n| %-90s %7s", "3. Sắp xếp danh sách theo thứ tự tăng dần theo tổng điểm.", "|");
        System.out.printf("\n| %-90s %7s", "4. Kiểm tra xem danh sách đã sắp xếp theo tổng điểm hay chưa.", "|");
        System.out.printf("\n| %-90s %7s", "5. Tìm kiếm tuyến tính theo tổng điểm.", "|");
        System.out.printf("\n| %-90s %7s", "6. Sửa tên sinh viên có mã được nhập từ bàn phím.", "|");
        System.out.printf("\n| %-90s %7s", "7. Xóa sinh viên có mã sinh viên được nhập từ bàn phím.", "|");
        System.out.printf("\n| %-90s %7s", "8. Chèn một sinh viên vào danh sách đã sắp xếp mà tính sắp xếp vẫn được bảo tồn. ", "|");
        System.out.printf("\n| %-90s %7s", "0. Kết thúc.", "|");
        printLine();
    }


    public static void addNewStudent(ArrayList<Student> student) {

        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            String id;
            do {
                System.out.println("Pls enter ID of student");
                id = inputBuffer.readLine();
            }
            while (CheckInput.checkAlready(student, id));

            Student studentMember = new Student();
            addElement(studentMember, id);

            student.add(studentMember);

        } catch (Exception ex) {

            ex.printStackTrace();
            System.err.print("Error");
            System.exit(0);

        }
    }



    public static void addElement(Student student, String id) {
        Scanner sc = new Scanner(System.in);
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        try {

            student.setIdStudent(id);

            do {
                System.out.println("pls enter full name of student");
               // dataInputString = inputBuffer.readLine();
                student.setFullName(inputBuffer.readLine());
            }
            while (!CheckInput.checkFullName(student.getFullName()));

            do {
                System.out.println("Pls enter sex");
                student.setSexStudent(inputBuffer.readLine());
            } while (!CheckInput.checkSex(student.getSexStudent()));


            do {
                System.out.println("Pls enter mathScore");
                student.setMathScore(sc.nextInt());
            } while (!CheckInput.checkScore(student.getMathScore()));

            do {
                System.out.println("Pls enter physicalScore");
               // dataInputInterger = sc.nextInt();
                student.setPhysicalScore(sc.nextInt());
            }
            while (!CheckInput.checkScore(student.getPhysicalScore()));


            do {
                System.out.println("Pls enter chemistryScore");
                student.setChemistryScore(sc.nextInt());
            }
            while (!CheckInput.checkScore(student.getChemistryScore()));


        } catch (Exception ex) {

            ex.printStackTrace();
            System.err.print("Error");
            System.exit(0);

        }

    }

    public static void outputSinhVien(ArrayList<Student> student) throws Exception
    {
        try
        {
            printTile();//in ra tiêu đề
            for(int i = 0; i < student.size(); i++)
            {
                System.out.printf("\n| %-10d |", i + 1);
                student.get(i).displaySinhVien();
                System.out.printf("| %-10.2f |", student.get(i).getSumScore());
                printFormat();//in ra các line
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public static void printFormat() {
        System.out.println();
        for (int i = 1; i <= 129; i++) {
            if (i == 1 || i == 14 || i == 27 || i == 65 || i == 77 || i == 90 || i == 103 || i == 116 || i == 129) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }
    public static void printTile() {
        printFormat();
        System.out.printf("\n| %-10s | %-10s | %-35s | %-9s | %-10s | %-10s | %-10s | %-10s |", "STT", "Mã SV", "Họ Và Tên", "Giới Tính", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "Tổng Điểm");
        printFormat();
    }
}
