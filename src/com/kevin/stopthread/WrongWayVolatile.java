package com.kevin.stopthread;

public class WrongWayVolatile implements Runnable{

    private volatile boolean cancled = false;


    @Override
    public void run() {
        int sum = 0;
        while (sum <= 10000 && ! cancled){
            if (sum % 100 == 0){
                System.out.println(sum);
            }
            sum++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WrongWayVolatile r = new WrongWayVolatile();
        Thread thread = new Thread(r);
        thread.start();
        Thread.sleep(5000);
        r.cancled = true;
    }
}
