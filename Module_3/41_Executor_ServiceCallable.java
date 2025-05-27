import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = List.of(
            () -> "Task 1", () -> "Task 2", () -> "Task 3"
        );
        List<Future<String>> results = es.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        es.shutdown();
    }
}
