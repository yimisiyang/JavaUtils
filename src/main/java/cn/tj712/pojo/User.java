package cn.tj712.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/31
 * @Time: 14:46
 * @author: ThinkPad
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String name;
    int age;
    String sex;
}
