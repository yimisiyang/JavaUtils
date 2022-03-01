package cn.tj712.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/2/23
 * @Time: 16:39
 * @author: ThinkPad
 */
public class TestState{
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////");
        });

        //观察线程状态
        Thread.State state = thread.getState();
        System.out.println(state);

        // 观察启动后状态
        thread.start(); //启动线程
        System.out.println(thread.getState());

        while(state != Thread.State.TERMINATED){
            try {
                Thread.sleep(100);
                state = thread.getState();
                System.out.println(state);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
