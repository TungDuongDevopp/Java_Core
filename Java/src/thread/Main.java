package thread;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Counter counter = new Counter();
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            Callable<Integer> task = () -> 100;
            Runnable task1 = () -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increase();
                }
            };
            Future<?> f1 = executor.submit(task1);
            Future<?> f2 = executor.submit(task1);
            Future<Integer> f3 = executor.submit(task);
            f1.get();
            f2.get(); // đợi task xong
            int report = f3.get();
            System.out.println(counter.getCount());
            System.out.println(report);
        }


    }
}
