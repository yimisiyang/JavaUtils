package cn.tj712.date;

import lombok.val;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/10/12
 * @Time: 19:41
 * @author: ThinkPad
 */
public class Demo01Collections {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(3);
        hashMap.put("古力娜扎",30);
        hashMap.put("迪丽热巴",28);
        hashMap.put("物理哈扎",31);
        hashMap.put("嘁哩啪啦",34);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            Integer value = next.getValue();
            String key = next.getKey();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
