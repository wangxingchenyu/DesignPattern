package main.java.highConcurrency.v13_singleton;

import java.util.concurrent.CountDownLatch;

class Driver { // ...
    public void main() throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(100);

        for (int i = 0; i < 100; ++i) { // create and start threads
            new Thread().start();

            //doSomethingElse();            // don't let run yet
            // startSignal.countDown();      // let all threads proceed
            // doSomethingElse();
            doneSignal.countDown();
            doneSignal.await();           // wait for all to finish
        }
    }
}