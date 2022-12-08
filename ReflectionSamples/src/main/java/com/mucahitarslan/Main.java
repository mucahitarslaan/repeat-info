package com.mucahitarslan;
import java.util.Timer;
import java.util.TimerTask;

class Main {
    public static void main(String[] args)
    {
        /*var timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run()
            {
                System.out.println(".");
            }
        }, 0, 1000);
        //Console.writeLine("main ends");

        //.

         */

        Class<Sample> clsSample = Sample.class;
        Class<Mample> clsMample = Mample.class;
        Class<String> clsString = String.class;
        Class<?> clsDouble = double.class;

        Class<String> clasString1 = String.class;
        Class<String> clasString2 = String.class;

        System.out.println(clasString1 == clasString2);
    }
}

class Sample{
}

class Mample{
}