// Class to perform multiplication operation
public class MultiplicationTask implements Runnable {

    @Override
    public void run() {
        int a = 10;
        int b = 5;
        int result = a * b;

        // Output the result of multiplication
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }
}
