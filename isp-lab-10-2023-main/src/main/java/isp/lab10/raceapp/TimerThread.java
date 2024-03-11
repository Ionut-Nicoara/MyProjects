package isp.lab10.raceapp;

public class TimerThread extends Thread {
    private long startTime;
    private long elapsedTime;

    public TimerThread() {
        startTime = System.currentTimeMillis();
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                break;
            }
            elapsedTime = System.currentTimeMillis() - startTime;
        }
        System.out.println("Total time: " + elapsedTime + "ms");
    }

    public void stopTimer() {
        interrupt();
    }
}