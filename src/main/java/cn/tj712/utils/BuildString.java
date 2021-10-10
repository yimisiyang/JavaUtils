package cn.tj712.utils;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/9/7
 * @Time: 11:02
 * @author: ThinkPad
 */
@Data
public class BuildString {
    public static void toBuildString(){
        String a = "hello";
        String b = "java";
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append(b);
        String completedString = builder.toString();
        System.out.println(completedString);
    }

    public static void main(String[] args) {
        BuildString.toBuildString();
        Date date = new Date();
        String dateString = date.toString();
        System.out.println(date);
        System.out.println(dateString);
        long time = date.getTime();
        System.out.println(time);


    }
}
