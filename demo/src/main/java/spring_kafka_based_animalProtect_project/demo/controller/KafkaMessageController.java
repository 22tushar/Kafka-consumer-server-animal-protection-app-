package spring_kafka_based_animalProtect_project.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring_kafka_based_animalProtect_project.demo.model.Animal;
import spring_kafka_based_animalProtect_project.demo.service.KafkaProducerService;

@RestController
public class KafkaMessageController {

    @Autowired
    KafkaProducerService kafkaProducerService;


    @GetMapping("/publish")
    public String PublishMessage() {

       Animal animal = new Animal("sher","yellow", "bada");
       System.out.println(animal);
       return kafkaProducerService.sendMessage(animal);
    }

}
