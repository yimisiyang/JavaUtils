package cn.tj712.utils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/29
 * @Time: 16:34
 * @author: ThinkPad
 */
public class Utils {
    /**
     * 将一个字符串型IP地址转化为long型数据
     * @param ipStr
     * @return
     */
    public long ip2Long(String ipStr){
        String[] ips = ipStr.split("\\.");
        long ipNum = 0;
        for (int i = 0; i < ips.length; i++) {
            ipNum += (Long.valueOf(ips[i]) << 8*(3 - i));
        }
        return ipNum;
    }
}
