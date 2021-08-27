package cn.tj712.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/27
 * @Time: 20:50
 * @author: ThinkPad
 */
public class JsonUtils {

    /**
     * 将时间按照指定的格式输出
     * @param object
     * @param dataFormat
     * @return
     */
    public String getJson(Object object,String dataFormat){
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        SimpleDateFormat sdf = new SimpleDateFormat(dataFormat);

        objectMapper.setDateFormat(sdf);
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取到两个标准格式（yyyy-MM-dd HH:mm:ss）时间戳差值
     * @param startTime
     * @param endTime
     * @return
     * @throws ParseException
     */
    public long getTimeDelta(String startTime,String endTime){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            long start = dateFormat.parse(startTime).getTime();
            long end = dateFormat.parse(endTime).getTime();
            long delta = end - start;
            return delta;
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return 0;
    }

}
