

class SharedResource {
    private int data;
    private boolean isDataAvailable = false;

    // Method for producer to put data
    public synchronized void produce(int value) {
        while (isDataAvailable) {
            try {
                wait(); // Wait until data is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = value;
        isDataAvailable = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer that data is available
    }

    // Method for consumer to get data
    public synchronized void consume() {
        while (!isDataAvailable) {
            try {
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isDataAvailable = false;
        notify(); // Notify producer that data is consumed
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Produce 5 items
            resource.produce(i);
            try {
                Thread.sleep(500); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Consume 5 items
            resource.consume();
            try {
                Thread.sleep(500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(); // Create shared resource
        Producer producer = new Producer(resource); // Create producer thread
        Consumer consumer = new Consumer(resource); // Create consumer thread

        producer.start(); // Start producer thread
        consumer.start(); // Start consumer thread
    }
}
