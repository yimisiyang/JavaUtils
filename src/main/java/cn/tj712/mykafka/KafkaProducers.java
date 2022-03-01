package cn.tj712.mykafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/12/25
 * @Time: 10:44
 * @author: ThinkPad
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaProducers {
    private Properties props = new Properties();
    public void myProducer(){
       props.put("bootstrap.servers", "192.169.1.102:9092, 192.169.1.102:9092");
       props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
       props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
       KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
       
    }

}
