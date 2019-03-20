import java.util.ArrayList;
import java.util.Scanner;

public class CheckInput {

    public static boolean checkContinue(String s) throws Exception {
        try {

            if (s.equalsIgnoreCase("continue") || s.equalsIgnoreCase("new") || s.equalsIgnoreCase("cancel")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }


    public static boolean checkFullName(String fullName) throws Exception {
        try {
            if (fullName.matches("[a-z A-Z]{5,40}")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }
    public static boolean checkSex(String sexOfstudent){
        if (sexOfstudent.equalsIgnoreCase("Male")|| sexOfstudent.equalsIgnoreCase("Femail")){
            return true;
        }
        else return false;
    }

    public static boolean checkScore(double score) {
        if (score >= 0 && score <11) {
            return true;
        } else return false;
    }

    public static boolean checkAlready(ArrayList<Student> studentArrayList, String id) {

        for (Student student : studentArrayList) {
            if (student.getIdStudent().equalsIgnoreCase(id)) {
                System.out.println("Already have this id");
                return true;
            }
        }
        return false;
    }

    public static boolean checkAready(String index){

        boolean flag=false;
        for (Student student: MainManagementStudent.students){
            if (student.getIdStudent().equalsIgnoreCase(index)){
                flag=true;
            }
        }
        return flag;

    }
}
