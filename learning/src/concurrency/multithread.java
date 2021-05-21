package concurrency;

public class multithread {
    public static void main(String[] args) {

        Thread userdefinedThread = new Thread(()->{
            System.out.println("Thread Trials:"+Thread.currentThread().getName()+" with priority of "+Thread.currentThread().getPriority());
        });

        userdefinedThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        userdefinedThread.start();
        System.out.println(Thread.currentThread().getName());

    }
}
