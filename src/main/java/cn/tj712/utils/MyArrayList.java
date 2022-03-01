package cn.tj712.utils;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/2/8
 * @Time: 9:57
 * @author: ThinkPad
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(4);
        Object[] arrays = arrayList.toArray();
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        

    }
}
