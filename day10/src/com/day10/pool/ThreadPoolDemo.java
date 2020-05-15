package com.day10.pool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	private static final String filePath1 = "E:/JavaTest/test1.txt";
    private static File file1 = new File(filePath1);

    // 数据量
    private static final int num = 2000 * 500;

    public static void main(String[] args) {
        /**
         * 创建线程池
         * coreSize：4
         * maximumPoolSize：4
         * keepAliveTime 和 TimeUnit.SECONDS：线程存活时间为1秒
         * threadFactory：使用默认的线程工厂
         * RejectedExecutionHandler：拒绝策略为AbortPolicy
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 1, TimeUnit.SECONDS,
                new ArrayBlockingQueue(20),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        try {
            // 创建10个任务提交到线程池
            for (int i = 0; i < 10; i++) {
                threadPoolExecutor.submit(() -> {
                    try {
                        // 调用io操作的方法，模拟线程执行的耗时，方便监控工具的查看
                        writeFile(file1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    // 写文件的IO操作
    static void writeFile(File file) throws IOException {
        // 判断是否有该文件
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < num; i++) {
                try {
                    bufferedWriter.write(i);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + new Date() + " 执行完成");
        }finally {
            bufferedWriter.close();
        }
}
    }
