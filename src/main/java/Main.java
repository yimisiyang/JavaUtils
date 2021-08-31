import cn.tj712.pojo.User;
import cn.tj712.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/27
 * @Time: 20:53
 * @author: ThinkPad
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 4, "男");
        User user3 = new User("秦疆3号", 5, "男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        String json = JsonUtils.getJson(users);
        System.out.println(json);
    }
}
