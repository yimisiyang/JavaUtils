package cn.tj712.date;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/10/10
 * @Time: 9:54
 * @author: ThinkPad
 */
public class DemoDate02 {
    public static void main(String[] args) {
        demo03();
    }
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
    }
}
