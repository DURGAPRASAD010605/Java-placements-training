abstract class X {
    abstract void one();
    abstract void three();

    public void two() {
        System.out.println("welcome");
    }
}

class Y extends X {
    public void one() {
        System.out.println("Method one");
    }

    public void three() {
        System.out.println("Method three");
    }
}

public class anonymous {
    public static void main(String args[]) {
        Y t = new Y();
        t.two();
    }
}