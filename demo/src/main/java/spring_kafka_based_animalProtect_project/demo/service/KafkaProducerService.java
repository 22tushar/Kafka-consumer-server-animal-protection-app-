package spring_kafka_based_animalProtect_project.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import spring_kafka_based_animalProtect_project.demo.model.Animal;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {

      private final static String TOPIC_NAME = "topic_1";

      @Autowired
      private KafkaTemplate<String, Animal> kafkaTemplate;

      public String sendMessage(Animal animal) {
            CompletableFuture<SendResult<String, Animal>> future = kafkaTemplate.send("javatechie-demo2", animal);
            future.whenComplete((result, ex) -> {
                  if (ex == null) {
                        System.out.println("Sent message=[" + animal +
                                "] with offset=[" + result.getRecordMetadata().offset() + "]");
                  } else {
                        System.out.println("Unable to send message=[" +
                                animal + "] due to : " + ex.getMessage());
                  }
            });
            return "Msg sent successfully!";
      }

      }


