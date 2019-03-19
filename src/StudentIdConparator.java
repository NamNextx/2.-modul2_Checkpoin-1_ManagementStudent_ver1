import java.util.Comparator;

public class StudentIdConparator implements Comparator<SinhVien> {

    @Override
    public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
        int number1=Integer.parseInt(sinhVien1.getIdStudent());
        int number2=Integer.parseInt(sinhVien2.getIdStudent());
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else return 0;
    }

}
