package cn.tj712.date;

/**
 * Created with IntelliJ IDEA.
 * 可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
 * 1.一个方法的参数列表，只能有一个可变参数；
 * 2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾。
 *
 * @Date: 2021/10/12
 * @Time: 19:24
 * @author: ThinkPad
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        final int add = add(10, 20, 30,40,50,60);
        System.out.println(add);
    }
    /**
     *  定义一个方法，计算0~n个整数的和
     * @param arr
     */
    public static int add(int...arr){
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        return sum;
    }
}
