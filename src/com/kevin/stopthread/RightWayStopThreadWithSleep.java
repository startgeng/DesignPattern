package com.kevin.stopthread;

public class RightWayStopThreadWithSleep implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadWithSleep());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

    @Override
    public void run() {
        int num = 0;
        while (!Thread.currentThread().isInterrupted() && num <= Integer.MAX_VALUE){
            if (num % 1000 == 0 ){
                System.out.println(num + " 是1000的倍数");
            }
            num++;
        }
        System.out.println("任务执行结束");
    }
}
