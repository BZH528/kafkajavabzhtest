package com.bzh.bigdata.quickstart;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * 示例
 */
public class ProducerFastStart {

    public static final String brokerList = "192.168.1.221:9092";
    public static final String topic = "topic-demo";

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        // 配置生产者客户端参数并创建KafkaProducer实例
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        // 构建所需要发送的消息
        ProducerRecord<String, String> record = new ProducerRecord<>(topic, "hello,Kafka!20201014 16:07");
        // 发送消息
        try {
            producer.send(record);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // 关闭生产者客户端示例
        producer.close();
    }

}
