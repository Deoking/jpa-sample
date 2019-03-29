package com.iamdeok.jpa;

import com.iamdeok.jpa.dto.Fruit;
import com.iamdeok.jpa.dto.Plant;
import com.iamdeok.jpa.dto.Tree;
import com.iamdeok.jpa.dto.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    @Autowired
    PlantRepository plantRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{

        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setSeed("4");

        Tree tree = new Tree();
        tree.setName("Pine");
        tree.setAge(50);

        Vegetable vegetable = new Vegetable();
        vegetable.setName("Spinach");
        vegetable.setNutrient("Vitamin");

        System.out.println(plantRepository.save(fruit));
        System.out.println(plantRepository.save(tree));
        System.out.println(plantRepository.save(vegetable));

        List<Plant> all = plantRepository.findAll();

        for (Plant plant : all){
            System.out.println(plant.getClass());
        }

        plantRepository.deleteAll();
    }

}
