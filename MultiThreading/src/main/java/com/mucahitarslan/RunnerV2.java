package com.mucahitarslan;

public class RunnerV2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Hi : " + i);
        }
    }
}
