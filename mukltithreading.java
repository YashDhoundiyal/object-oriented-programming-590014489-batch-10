// WAP to show thread execution with sleep()

class SleepThread extends Thread {

    public void run() {

        try {
            for(int i=1; i<=5; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(1000); // 1 second delay
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class SleepDemo {

    public static void main(String[] args) {

        SleepThread t1 = new SleepThread();
        t1.start();

    }
}