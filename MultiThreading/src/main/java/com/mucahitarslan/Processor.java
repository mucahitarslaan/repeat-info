package com.mucahitarslan;

public class Processor extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Merhaba");
        }
    }

    public void shotdown(){
        this.running = false;
    }
}
