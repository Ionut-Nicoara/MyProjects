package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        JFrame frameC = new JFrame("Car Race");
        frameC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frameC.getContentPane().add(carPanel);
        frameC.pack();
        frameC.setSize(500, 300);
        frameC.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);


        JFrame frameS = new JFrame("Semaphore");
        frameS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frameS.getContentPane().add(semaphorePanel);
        frameS.pack();
        frameS.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();



        PlaySound ps = new PlaySound();

        semaphoreThread.join();
        TimerThread timerThread = new TimerThread();
        timerThread.start();

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        ps.playSound();


        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
            ps.stopSound();
            timerThread.stopTimer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ps.stopSound();


    }
}
