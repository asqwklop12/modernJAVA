package chapter15;

import org.springframework.util.StopWatch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample {
    static int f(int x) {
        return x - 1;
    }

    static int g(int x) {
        return x + 1;
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int x = 1337;
        thread(x);
        noThread(x);
        threadV2(x);
    }

    private static void noThread(int x) {
        StopWatch sw = new StopWatch();
        sw.start();
        int y = f(x);
        int z = g(x);
        System.out.println(y + z);
        sw.stop();
        System.out.println(sw.prettyPrint());
    }


    private static void thread(int x) throws InterruptedException {
        StopWatch sw = new StopWatch();
        sw.start();
        Result result = new Result();

        Thread t1 = new Thread(() -> {
            result.left = f(x);
        });
        Thread t2 = new Thread(() -> {
            result.right = g(x);
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(result.left + result.right);
        sw.stop();
        System.out.println(sw.prettyPrint());
    }

    private static void threadV2(int x) throws InterruptedException, ExecutionException {
        StopWatch sw = new StopWatch();
        sw.start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> y = executorService.submit(() -> f(x));
        Future<Integer> z = executorService.submit(() -> g(x));

        System.out.println(y.get() + z.get());
        executorService.shutdown();
        sw.stop();
        System.out.println(sw.prettyPrint());
    }

    private static class Result {
        private int left;
        private int right;
    }
}
