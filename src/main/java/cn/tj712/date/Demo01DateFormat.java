package cn.tj712.date;

import lombok.val;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/10/10
 * @Time: 10:03
 * @author: ThinkPad
 */
public class Demo01DateFormat{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        System.out.println("==============================");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (Integer list:arrayList) {
            System.out.println(list);
        }
        int i = arrayList.hashCode();
        System.out.println(i);
    }
}
