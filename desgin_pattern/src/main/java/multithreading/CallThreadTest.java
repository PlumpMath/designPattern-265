package main.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by mengye on 17/4/22.
 */
public class CallThreadTest implements Callable<Integer> {
  @Override
  public Integer call() {
    int i = 0;
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }
    return i;
  }

  public static void main(String[] args) {
    CallThreadTest callThreadTest = new CallThreadTest();
    FutureTask<Integer> futureTask = new FutureTask<>(callThreadTest);
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
      if (i == 20) {
        new Thread(futureTask, "有返回值的线程").start();
      }
    }
    try {
      System.out.println("子线程的返回值：" + futureTask.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
