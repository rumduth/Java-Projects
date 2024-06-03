
class stackOverFlow extends Exception {
    public String toString() {
        return "stackoverflow";
    }
}

class stackUnderFlow extends Exception {
    public String toString() {
        return "stackunderflow";
    }
}

class myStack {
    final private int size = 5;

    private int[] myStack = new int[5];
    private int current = 0;

    public void push(int n) throws stackOverFlow {
        if (current < size) {
            myStack[current] = n;
            current++;
        } else {
            throw new stackOverFlow();
        }
    }

    public void pop() throws stackUnderFlow {
        if (current <= 0)
            throw new stackUnderFlow();
        else {
            System.out.println("Element popped is: " + myStack[current]);
            current--;
        }
    }
}

public class StudentChallenges {
    public static void main(String args[]) {
        myStack st = new myStack();
        try {
            st.pop();
            st.push(3);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
