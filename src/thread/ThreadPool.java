package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool implements Runnable {

    private static final String MESSAGE = "출력중 [%s][%d회]";
    private final String threadName;

    public ThreadPool(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(String.format(MESSAGE, threadName, i));
        }
    }

    public static void main(String[] args) {
        ThreadPool runnableA = new ThreadPool("ThreadA");
        ThreadPool runnableB = new ThreadPool("ThreadB");
        ThreadPool runnableC = new ThreadPool("ThreadC");

        // Thread Pool을 만들어서 개수를 3개로 제한
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(runnableA);
        executorService.execute(runnableB);
        executorService.execute(runnableC);

        // .shutdown() : 실행 중인 작업뿐만 아니라 작업 큐에 대기하고 있는 모든 작업들을 "처리"하고 Thread Pool을 중지시킨다.
        // .shutdownNow() : 즉시 중지
        executorService.shutdown();
        try {
            /* .awaitTermination : .shutdown() 호출 후 해당 시간만큼안에 Thread Pool 작업을 수행하지 못하면,
                실행 중이던 Thread에 Interrupt를 발생시키고 false를 반환한다.
             */
            if (!executorService.awaitTermination(5, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }
}
