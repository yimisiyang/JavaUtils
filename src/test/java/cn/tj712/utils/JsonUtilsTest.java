package cn.tj712.utils;

import cn.tj712.pojo.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/27
 * @Time: 21:08
 * @author: ThinkPad
 */
public class JsonUtilsTest {
    @Test
    public void testGetJson(){
        JsonUtils utils = new JsonUtils();
        Date date = new Date();
        String dateTime = utils.getJson(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTime);
    }
    @Test
    public void testGetTimeDelta(){
        String startTime = "2021-08-25 04:00:00";
        String endTime = "2021-08-25 12:00:00";
        JsonUtils utils = new JsonUtils();
        long timeDelta = utils.getTimeDelta(startTime, endTime);
        System.out.println(timeDelta);
    }

    @Test
    public void testJackson(){

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 4, "男");
        User user3 = new User("秦疆3号", 5, "男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        String json = JsonUtils.getJson(users);
        System.out.println("===================输出java对象=====================");
        System.out.println(users);
        System.out.println("===================通过jackson将java对象转换为json对象=====================");
        System.out.println(json);
    }

    @Test
    public void testFastJson(){
        ArrayList<User> userLists = new ArrayList<>();
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 4, "男");
        User user3 = new User("秦疆3号", 5, "男");
        userLists.add(user1);
        userLists.add(user2);
        userLists.add(user3);
        System.out.println("\n***********Json字符串转Java对象");
        String str1 = JSON.toJSONString(userLists);
        System.out.println("JSON.toJSONString(list)==>" + str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>" + str2);

        System.out.println("\n********JSON字符串转Java对象***********");
        User jp_user1 = JSON.parseObject(str2, User.class);
        System.out.println("JSON.parseObject(str2, User.class)==>" + jp_user1);

        System.out.println("\n************java对象转Json对象*****************");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>" + jsonObject1.getString("name"));

        System.out.println("\n**************JSON对象转Java对象****************");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)" + to_java_user);
    }
}
