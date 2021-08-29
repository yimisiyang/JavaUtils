package cn.tj712.utils;

import org.junit.Test;

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
}
