package com.kevin.stopthread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 生产者消费者模式来证明 Volatile 不是能适合所有的情况
 * 当生产者生产速度足够快的时候,消费者 消耗数据更不上就会造成队列阻塞
 */
public class WrongWayVolatileCannStop {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);
        Producer producer = new Producer(storage);
        Thread thread = new Thread(producer);
        thread.start();
        Thread.sleep(1000);
        Consumer consumer = new Consumer(storage);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.storage.take() + "被消费掉了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多的数据");
        producer.cancled = true;
    }
}

class Producer implements Runnable {

    public volatile boolean cancled = false;

    BlockingQueue storage;

    public Producer(BlockingQueue storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int num = 0;
        try {
            while (num <= 10000 && !cancled) {
                if (num % 100 == 0) {
                    storage.put(num);
                    System.out.println(num + "是100的倍数,被放到仓库中了。");
                }
                num++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("生产者结束运行");
        }
    }
}


class Consumer {
    BlockingQueue storage;

    public Consumer(BlockingQueue storage) {
        this.storage = storage;
    }

    public boolean needMoreNums() {
        if (Math.random() > 0.95) {
            return false;
        }
        return true;
    }
}
