package com.prep.spring.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class class1 {

    public static void main(String[] args) {



    }

    class DeferredResponseSystem {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        public CompletableFuture<String> deferredExecution() {
            CompletableFuture<String> test = CompletableFuture.supplyAsync(() -> {
                System.out.println("test");
                return "Hello";
            });
            try {
                test.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

//            test.handleAsync(() -> System.out.println("df");
//
          return test;
        }
    }
}
