import java.util.ArrayList;

public class SinhVien {
    private String idStudent;
    private String fullName;
    private String sexStudent;
    private double mathScore;
    private double physicalScore;
    private double chemistryScore;


    public SinhVien() {

    }

    public SinhVien(String idStudent, String fullName, String sexStudent) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.sexStudent = sexStudent;
    }

    public SinhVien(double mathScore, double physicalScore, double chemistryScore) {
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    public SinhVien(String idStudent, String fullName, String sexStudent, double mathScore, double physicalScore, double chemistryScore) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.sexStudent = sexStudent;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return this.idStudent;
    }

    public void setSexStudent(String sexStudent) {
        this.sexStudent = sexStudent;
    }

    public String getSexStudent() {

        return sexStudent;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setPhysicalScore(double physicalScore) {
        this.physicalScore = physicalScore;
    }

    public double getPhysicalScore() {
        return physicalScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }
    public double getSumScore(){
        return getMathScore()+getPhysicalScore()+getChemistryScore();
    }

    public void displaySinhVien() throws Exception
    {
        try
        {
            System.out.printf(" %-10s | %-35s | %-9s | %-10.2f | %-10.2f | %-10.2f ", idStudent, fullName, sexStudent, mathScore, physicalScore, chemistryScore);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }


}
