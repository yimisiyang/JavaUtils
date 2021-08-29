import cn.tj712.utils.JsonUtils;
import cn.tj712.utils.Utils;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/27
 * @Time: 20:53
 * @author: ThinkPad
 */
public class Main {
    public static void main(String[] args) {
        String ipStr = "192.168.3.13";
        Utils utils = new Utils();
        long aLong = utils.ip2Long("192.168.3.13");
        System.out.println(aLong);
    }
}
