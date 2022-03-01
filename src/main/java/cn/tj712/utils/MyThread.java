package cn.tj712.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/2/8
 * @Time: 14:22
 * @author: ThinkPad
 */
public class MyThread extends Thread{
    volatile boolean stop = false;

    @Override
    public void run(){
        while (!stop){
            System.out.println(getName() + " is running");
            try {
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println("week up from block");
                stop = true;
            }
        }

        System.out.println(getName() + " is exiting");
    }
}
