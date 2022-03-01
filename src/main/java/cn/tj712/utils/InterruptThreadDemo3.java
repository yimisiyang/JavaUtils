package cn.tj712.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/2/8
 * @Time: 14:31
 * @author: ThinkPad
 */
public class InterruptThreadDemo3 {
    public static void main(String[] args) throws InterruptedException{
        MyThread m1 = new MyThread();
        System.out.println("Starting thread");
        m1.start();
        Thread.sleep(3000);
        System.out.println("Interrupt thread...: " + m1.getName());
        m1.stop = true;
        m1.interrupt();
        Thread.sleep(3000);
        System.out.println("Stopping application...");
    }
}
