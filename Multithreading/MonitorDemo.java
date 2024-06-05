class MyData {
    synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
}

class Mythread1 extends Thread {
    MyData d;

    Mythread1(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("Hello World\n");
    }
}

class Mythread2 extends Thread {
    MyData data;

    Mythread2(MyData dat) {
        data = dat;
    }

    public void run() {
        data.display("Welcome\n");
    }
}

public class MonitorDemo {
    public static void main(String args[]) {
        MyData d = new MyData();
        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);

        t1.start();
        t2.start();
    }
}
