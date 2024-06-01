
class Student {
    private static int No = 0;
    private String rollNo;

    static Student getStudent() {
        No++;
        Student s = new Student();
        s.rollNo = "Univ-2020-" + No;
        return s;
    }

    public String getInfo() {
        return this.rollNo;
    }
}

public class StudentRollNumber {
    public static void main(String args[]) {
        Student s = Student.getStudent();
        System.out.println(s.getInfo());

        s = Student.getStudent();
        System.out.println(s.getInfo());
    }
}
