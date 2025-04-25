// Class to perform addition operation
public class AdditionTask implements Runnable {

    @Override
    public void run() {
        int a = 10;
        int b = 5;
        int sum = a + b;

        // Output the result of addition
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
    }
}
