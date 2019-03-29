import java.util.Scanner;

public class Management {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // Add first 3 student in list
            ManuManagement manuManagement = new ManuManagement();
            manuManagement.addStudents();

            int selected;
            do {
                ManuManagement.showManu();

                System.out.println("\n Enter your choice");
                selected = scanner.nextInt();
                System.out.flush();
                switch (selected) {
                    case 1: {

                        System.out.println("1. Enter new student");
                        manuManagement.addNewStudent();
                        break;

                    }
                    case 2: {
                        System.out.println("2. Show list student");
                        if (manuManagement.students.size() == 0) {
                            System.out.println("List is empty");
                        } else {
                            manuManagement.showListStudent();
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.println("3. Sort student by ID");
                            manuManagement.sortStudentByID();
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
                        manuManagement.findStudent();
                        break;
                    }
                    case 6: {
                        System.out.println("6. Rename student use index of student");
                        manuManagement.renameStudent();
                        break;
                    }
                    case 7: {
                        System.out.println("7. Remove student with id input from keyboa");
                        manuManagement.removeStudent();
                        break;
                    }
                    case 0: {
                        System.out.println("End process");
                        break;
                    }
                    default: {
                        System.out.println("Process have no this function");
                        break;
                    }
                }
            } while (selected != 0);
            System.out.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.print("Your choice is incorrect");
            System.exit(0);
        }
    }
}
