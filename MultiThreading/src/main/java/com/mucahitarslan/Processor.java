package com.mucahitarslan;

public class Processor extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Merhaba");
        }
    }
    public void shotdown(){
        this.running = false;
    }
}
