
public class CheckInput {
/*
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
    }*/

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


}
