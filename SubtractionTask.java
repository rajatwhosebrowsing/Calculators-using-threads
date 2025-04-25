// Class to perform subtraction operation
public class SubtractionTask implements Runnable {

    @Override
    public void run() {
        int a = 10;
        int b = 5;
        int result = a - b;

        // Output the result of subtraction
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
}
