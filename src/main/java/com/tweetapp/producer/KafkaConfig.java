package com.tweetapp.producer;

//@Configuration
public class KafkaConfig {

//    @Value(value="${kafka.bootstrapAddress}")
//    private String bootstrapAddress;
//
//    @Value(value = "${kafka.jaas}")
//    private String jaas;
//
//    @Bean
//    public ProducerFactory<String, Integer> producerFactory() {
//        Map<String, Object> properties = new HashMap<>();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
//
//        //Set these if using SASL authentication or Confluent Cloud
////        properties.put("security.protocol", "SASL_SSL");
////        properties.put("sasl.mechanism", "PLAIN");
////        properties.put("sasl.jaas.config", jaas);
////        properties.put("acks", "all");
//        return new DefaultKafkaProducerFactory<>(properties);
//    }
//
//    @Bean
//    public KafkaTemplate<String, Integer> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }
}
