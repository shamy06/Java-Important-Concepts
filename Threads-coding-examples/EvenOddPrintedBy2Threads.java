public class EvenOddPrintedBy2Threads
{
    private int count = 1;
    private final Object lock = new Object();

    public void printOdd() {
        synchronized (lock) {
            while (count <= 10) {
                while (count % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
e.printStackTrace();                    }
                }
                System.out.println("Odd Thread: " + count);
                count++;
                lock.notify();
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (count <= 10) {
                while (count % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread: " + count);
                count++;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrintedBy2Threads numberPrinter = new EvenOddPrintedBy2Threads();

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printOdd();
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                numberPrinter.printEven();
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
