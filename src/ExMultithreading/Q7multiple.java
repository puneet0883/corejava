package ExMultithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Q7multiple {

    public static void main(String args[]){

        BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();

        Thread prodThread1 = new Thread(new Producerr(sharedQueue,1));
        Thread prodThread2 = new Thread(new Producerr(sharedQueue,2));
        Thread consThread1 = new Thread(new Consumerr(sharedQueue,1));
        Thread consThread2 = new Thread(new Consumerr(sharedQueue,2));

        prodThread1.start();
        prodThread2.start();
        consThread1.start();
        consThread2.start();
    }

}

class Producerr implements Runnable {

    private final BlockingQueue<Integer> sharedQueue;
    private int threadNo;

    public Producerr(BlockingQueue<Integer> sharedQueue,int threadNo) {
        this.threadNo = threadNo;
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=1; i<= 5; i++){
            try {
                int number = i;
                System.out.println("Produced:" + number + ":by thread:"+ threadNo);
                sharedQueue.put(number);
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }

}

class Consumerr implements Runnable{

    private final BlockingQueue<Integer> sharedQueue;
    private int threadNo;
    public Consumerr (BlockingQueue<Integer> sharedQueue,int threadNo) {
        this.sharedQueue = sharedQueue;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        while(true){
            try {
                int num = sharedQueue.take();
                System.out.println("Consumed: "+ num + ":by thread:"+threadNo);
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }
}
