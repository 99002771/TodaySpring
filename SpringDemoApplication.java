package com.example;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.foodWiring.FoodPanda;

 

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

 

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
@Autowired
ApplicationContext context,t;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        //Employee employee=context.getBean(Employee.class);
        //System.out.println(employee);
        //Student s=t.getBean(Student.class);
        //System.out.println(s);
    	//ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
    	//shapeFactory.printArea(10, 20);
    	FoodPanda foodPanda=context.getBean(FoodPanda.class);
    	 foodPanda.showMenu("chinese");
    }

 

}
