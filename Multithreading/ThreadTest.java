
class MyRun implements Runnable {
    public void run() {
    }
}

class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class ThreadTest {
    public static void main(String[] args) throws Exception {
        // Thread t = new Thread(new MyRun(), "My name");
        Mythread t = new Mythread("My Thread 1");

        System.out.println(t.getName() + " " + t.getId());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
    }
}
