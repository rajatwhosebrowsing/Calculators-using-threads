// Class to perform division operation
public class DivisionTask implements Runnable {

    @Override
    public void run() {
        int a = 10;
        int b = 5;

        // Check for divide-by-zero error
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
