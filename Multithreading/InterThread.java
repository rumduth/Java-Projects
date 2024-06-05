class MyData {
    int value = 0;

    boolean flag = true;

    synchronized void set(int v) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = v;

        flag = false;
        notify();

    }

    synchronized int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData d;

    public Producer(MyData dat) {
        d = dat;
    }

    public void run() {
        int i = 1;
        while (true) {
            d.set(i);
            System.out.println("producer: " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    MyData d;

    Consumer(MyData dat) {
        d = dat;
    }

    public void run() {
        while (true) {
            System.out.println("consumer " + d.get());
        }
    }
}

public class InterThread {
    public static void main(String args[]) {
        MyData data = new MyData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
