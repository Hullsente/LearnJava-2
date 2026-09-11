package com.cxk06602.bugcrusher.homework.chapter19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Homework03 {
    static void main() throws IOException {
        String path = "src\\dog.properties";
        Properties properties = new Properties();
        properties.put("name", "tom");
        properties.put("age", "5");
        properties.put("color", "red");
        properties.store(new FileWriter(path), null);

        properties = new Properties();
        properties.load(new FileReader(path));
        System.out.println(new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color")));
    }
}
class Dog{
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}