package cn.tj712.date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/10/10
 * @Time: 9:41
 * @author: ThinkPad
 */
public class DemoDate {
    private static long VALUE = 86400000;
    public static void main(String[] args) {
        // 获取当前时间的毫秒值
        long l = System.currentTimeMillis();
        // 毫秒值转换为日期
        // 换算关系： 1天=24*60*60*1000 = 86400000毫秒
        long l1 = l / VALUE;
        System.out.println(l1);
    }
}
