class Whiteboard {
    String text;
    int noOfStud = 0;
    int count = 0;

    public void attendance() {
        noOfStud++;
    }

    synchronized void write(String t) {
        System.out.println("Teacher is writing " + t);
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        text = t;
        count = noOfStud;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
            ;
        }
        String t = text;
        count--;
        if (count == 0)
            notify();
        return t;
    }
}

class Teacher extends Thread {
    Whiteboard whiteboard;
    String notes[] = { "Java is language", "It is OOPs", "It is Platform Indepdendent", "It supports threads", "End" };

    public Teacher(Whiteboard w) {
        whiteboard = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            whiteboard.write(notes[i]);
        }
    }

}

class Student extends Thread {
    Whiteboard whiteboard;
    String name;

    public Student(Whiteboard w, String n) {
        whiteboard = w;
        name = n;
    }

    public void run() {
        String text;
        whiteboard.attendance();
        do {
            text = whiteboard.read();
            System.out.println(name + " READING " + text);
            System.out.flush();
        } while (!text.equals("End"));
    }

}

public class TeacherStudent {
    public static void main(String[] args) {

        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student(wb, "1. John");
        Student s2 = new Student(wb, "2. Ajay");
        Student s3 = new Student(wb, "3. Kloob");
        Student s4 = new Student(wb, "4. Smith");

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
