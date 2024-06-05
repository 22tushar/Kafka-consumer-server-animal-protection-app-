package spring_kafka_based_animalProtect_project.demo.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Animal {
    private String name;
    private String color;
    private String animalType;

    public Animal(String name, String color, String animalType)
    {
        this.name = name;
        this.color = color;
        this.animalType = animalType;
    }

    @Override
    public String toString()
    {
        return "Animal [name=" + name + ", color=" + color + ", animalType=" + animalType + "]";
    }
}
