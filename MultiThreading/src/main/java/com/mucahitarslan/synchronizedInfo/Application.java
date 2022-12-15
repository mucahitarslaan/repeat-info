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
     private void doCount() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++){
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (i == 3){
                        throw  new RuntimeException("xxx");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("i : " + i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
        for (int i = 0 ; i < 10; i++) {
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("count  = " + count);
        }


    }
}
