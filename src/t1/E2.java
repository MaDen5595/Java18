package t1;

public class E2 {
    public void exceptionDemo() {
        System.out.println( 2.0 / 0.0 );
    }

    public static void main(String[] args) {
        E2 a = new E2();
        a.exceptionDemo();
    }
}
