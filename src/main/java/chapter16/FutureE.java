package chapter16;

import org.springframework.util.StopWatch;

import java.util.Random;
import java.util.concurrent.*;

public class FutureE {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();

        st.start();
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Double> future = executor.submit(() -> doSomeLongComputation());
        doSomethingElse();

        try {
            Double result = future.get(10, TimeUnit.SECONDS);
            System.out.println(result.doubleValue());
        } catch (ExecutionException ee) {

        } catch (InterruptedException ie) {

        } catch (TimeoutException te) {
            System.out.println(te.getStackTrace());
        }

        st.stop();
//        System.out.println(st.prettyPrint());
    }

    private static void doSomethingElse() {
        System.out.println("안녕하세요...!!!!");
    }

    private static Double doSomeLongComputation() {
        double result = 1;
        Random random = new Random(100);
//        for(int i = 0; i<100_000_000;i++) {
//            result += (i +1) * random.nextDouble();
//        }
        return result * random.nextDouble();
    }
}
