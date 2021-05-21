package concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Count implements Runnable {
    int i;
    int courseTime;
    static double d;
    static AtomicInteger totalCourseFee  = new AtomicInteger();
    int courseFee;

    Count(int i, int courseTime, int courseFee) {
        this.i = i;
        this.courseTime = courseTime;
        this.courseFee = courseFee;
    }

    synchronized void addFees() {
        this.totalCourseFee.getAndAdd(courseFee);
    }

    public static synchronized void printCPUUsage() {
        ThreadMXBean tms = ManagementFactory.getThreadMXBean();
        long cpuTime = tms.getThreadCpuTime(Thread.currentThread().getId());
        d+=(cpuTime/1000000);
        System.out.println(Thread.currentThread().getId()+"   -----   "+(cpuTime/1000000)+" ----- "+(System.nanoTime())/1000000+" ------ "+(d));
    }

    public void run() {
        System.out.println(System.nanoTime());
//        System.out.println("------ Student "+ i +" is working... " + Thread.currentThread().getName()+"------");
        try {
            for(int i=0;i<10000000;i++) {
                for(int j=0;j<100000;j++) {

                }
            }
            Thread.sleep(courseTime);
//            System.out.println("*** Student "+i+" ended " + Thread.currentThread().getName() + " " +  process++ + " ***");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addFees();
        printCPUUsage();
        System.out.println(System.nanoTime());
//        System.out.println("Amount collected till now:" + totalCourseFee);
    }
}

class ThreadMain extends Thread{

    private int numberOfSystems;
    private int numberOfStudents;
    private int coursePrice;
    private int courseTime;

    public ThreadMain(int numberOfSystems, int numberOfStudents, int coursePrice, int courseTime) {
        this.numberOfSystems = numberOfSystems;
        this.numberOfStudents = numberOfStudents;
        this.coursePrice = coursePrice;
        this.courseTime = courseTime;
    }

    public void run() {
        int totalTime = 0;
        long startTime = System.nanoTime()/1000000;
        if(numberOfStudents<numberOfSystems) {
            numberOfSystems = numberOfStudents;
        }
        ExecutorService ex = Executors.newFixedThreadPool(numberOfSystems);
        for(int i=1;i<=numberOfStudents;i++) {
            Count c = new Count(i, courseTime, coursePrice);
            ex.execute(c);
            totalTime = totalTime + courseTime;
        }
        totalTime = totalTime / (numberOfStudents/numberOfSystems);
        ex.shutdown();
        while(!ex.isTerminated()) {}
//        System.out.println("Total Time : "+totalTime/6000.0+" minute(s)\n");
        long endTime = System.nanoTime()/1000000;
        double time = Count.d;
        time /= numberOfSystems;
        System.out.println();
        System.out.format("Average Thread Usage Time: %.2f\n", (time/((endTime-startTime)))*100);
    }
}


class MultiThreadingExercise {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread st = new ThreadMain(1, 50, 30,0);
        st.start();
//        System.out.println("Main thread end...");
    }
}