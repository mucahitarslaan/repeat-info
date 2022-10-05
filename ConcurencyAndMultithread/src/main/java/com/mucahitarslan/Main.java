package com.mucahitarslan;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("It's a runnable program!");
        Thread thread = new Thread(runnable);
        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Runnable> runnableList = Arrays.asList(
                () -> System.out.println("Runnable 1"),
                () -> System.out.println("Runnable 2"),
                () -> System.out.println("Runnable 3"),
                () -> System.out.println("Runnable 4"),
                () -> System.out.println("Runnable 5"),
                () -> System.out.println("Runnable 6"),
                () -> System.out.println("Runnable 7"),
                () -> System.out.println("Runnable 8"),
                () -> System.out.println("Runnable 9"));

        List<Callable<Integer>> callableList = Arrays.asList(
                () -> {int a = 1; System.out.println("Callable 1"); return 1;},
                () -> {int a = 1; System.out.println("Callable 2"); return 2;},
                () -> {int a = 1; System.out.println("Callable 3"); return 3;},
                () -> {int a = 1; System.out.println("Callable 4"); return 4;},
                () -> {int a = 1; System.out.println("Callable 5"); return 5;},
                () -> {int a = 1; System.out.println("Callable 6"); return 6;});

        try {
            List<Future<Integer>> results = executorService.invokeAll(callableList);
            results.forEach(i -> {
                try {
                    System.out.println(i.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        IntStream.range(0,9).forEach(i -> executorService.submit(runnableList.get(i)));

        IntStream.range(0,100).forEach(i -> executorService.submit(() -> {
            System.out.println("Task " + i + "executed by " + Thread.currentThread().getName());
        }));
    }
}