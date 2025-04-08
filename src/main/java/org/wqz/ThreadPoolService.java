package org.wqz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolService {
    private final ExecutorService executorService;

    public ThreadPoolService(ThreadPoolProperties properties) {
        this.executorService = new ThreadPoolExecutor(
                properties.getCorePoolSize(),
                properties.getMaximumPoolSize(),
                properties.getKeepAliveTime(),
                java.util.concurrent.TimeUnit.SECONDS,
                new java.util.concurrent.LinkedBlockingQueue<>()
        );
    }

    public void execute(Runnable task) {
        executorService.execute(task);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}