package com.mucahitarslan;

class Main {
    public static void main(String[] args) {
        /*
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        runner1.start();
        runner2.start();
         */

        /*
        Thread thread1 = new Thread(new RunnerV2());
        Thread thread2 = new Thread(new RunnerV2());
        thread1.start();
        thread2.start();
         */

        /*
        Thread thread = new Thread(new RunnerV2()){
            @Override
            public void run() {
                System.out.println("Merhaba");
            }
        };
        thread.start();
         */

        //Thread thread = new Thread(() -> System.out.println("Merhaba"));

        Processor processor = new Processor();
        processor.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        processor.shotdown();
    }
}