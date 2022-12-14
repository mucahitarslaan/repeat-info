package com.mucahitarslan.synchronizedInfo;

import com.mucahitarslan.RunnerV2;

public class Application {
    private int count = 0;

    public static void main(String[] args) {
        Application application = new Application();
        application.doCount();
    }


    public synchronized void increment(){
        count++;
    }
     private void doCount(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        System.out.println("count  = " + count);
    }
}
