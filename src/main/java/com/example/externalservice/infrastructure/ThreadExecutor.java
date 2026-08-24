package com.example.externalservice.infrastructure;

import java.util.concurrent.Callable;

public class ThreadExecutor {
    public <T> T execute(Callable<T> callable) throws Exception {
        Thread thread = new Thread(() -> {
            try {
                callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        thread.join();
        return callable.call();
    }
}