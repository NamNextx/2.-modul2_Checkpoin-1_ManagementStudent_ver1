import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int number1=Integer.parseInt(student1.getIdStudent());
        int number2=Integer.parseInt(student2.getIdStudent());

        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else return 0;
    }

}
