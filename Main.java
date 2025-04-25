// Name: Nimit Prakash
// PRN: 23070126082
// Batch: B1

public class Main {
    public static void main(String[] args) {

        // Create instances of each task
        AdditionTask addTask = new AdditionTask();
        SubtractionTask subTask = new SubtractionTask();
        MultiplicationTask mulTask = new MultiplicationTask();
        DivisionTask divTask = new DivisionTask();

        // Create threads for each task
        Thread t1 = new Thread(addTask);
        Thread t2 = new Thread(subTask);
        Thread t3 = new Thread(mulTask);
        Thread t4 = new Thread(divTask);

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Join threads to ensure main waits for completion
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("All tasks completed.");
    }
}
