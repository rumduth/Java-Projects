class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String id, String name, int maxMarks) {
        this.subID = id;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public Subject(String id, String name, int maxMarks, int marksObtain) {
        this.subID = id;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public String getName() {
        return name;
    }

    public String getSubId() {
        return subID;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int m) {
        maxMarks = m;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    boolean isQualified() {
        return marksObtain >= (maxMarks / 10 * 4);
    }

    public String toString() {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private Subject[] subjects = new Subject[3];

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public Student(String rollNo, String name, String dept, Subject... subs) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = subs[i];
        }
    }

    public void studentsInformation() {
        String info = "\nStudent ID: " + rollNo + "\nName: " + name + "\n";
        System.out.println(info);
        for (Subject s : subjects) {
            System.out.println(s.toString());
            if (s.isQualified())
                System.out.println("Status: Passed");
            else
                System.out.println("Status: Failed");
        }
    }

}

public class StudentChallenges {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100, 20);
        subs[1] = new Subject("s102", "Algorithm", 100, 90);
        subs[2] = new Subject("s103", "Opearating System", 100, 50);
        Student s = new Student("1123", "ABC", "CSCE", subs);
        s.studentsInformation();
    }
}
