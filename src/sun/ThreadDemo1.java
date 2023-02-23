package sun;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo1 {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyThread1());
        t2.start();

        Thread t5 = new Thread(() -> {
            System.out.println("我是线程5");
        }
        );
        t5.start();

        FutureTask<String> f3 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "线程3测试";
            }
        });
        Thread t3 = new Thread(f3);
        t3.start();

        Callable<String> c4 = new MyThread2(100);
        FutureTask f4 = new FutureTask(c4);
        Thread t4 = new Thread(f4);
        t4.start();
        Object o = f4.get();
        System.out.println(o);

        String s = f3.get();
        System.out.println(s);
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是线程11111的执行结果：" + i);

        }
    }
}
class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是线程22222的执行结果：" + i);
        }
    }
}

class MyThread2 implements Callable<String>{
    private int n;

    public MyThread2(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "线程3的执行结果是:" + sum;
    }
}

