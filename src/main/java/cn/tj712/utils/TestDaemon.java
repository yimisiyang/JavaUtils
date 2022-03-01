package cn.tj712.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/3/1
 * @Time: 9:15
 * @author: ThinkPad
 */
public class TestDaemon {
    public static void main(String[] args) {
        Gad gad = new Gad();
        Me me = new Me();

        Thread thread = new Thread(gad);
        // 设置为守护线程
        thread.setDaemon(true);
        thread.start();

        // 启动用户线程
        new Thread(me).start();
    }


}

class Gad implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("=======上帝保佑着你========");
        }
    }
}

class Me implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 35600; i++) {
            System.out.println("=========你一直开心的活着===========");
        }
        System.out.println("============GoodBye===========");
    }
}