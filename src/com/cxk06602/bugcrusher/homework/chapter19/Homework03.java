package com.cxk06602.bugcrusher.homework.chapter19;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    static void main() throws IOException, ClassNotFoundException {
        String path = "src\\dog.properties";
        Properties properties = new Properties();
        properties.put("name", "tom");
        properties.put("age", "5");
        properties.put("color", "red");
        properties.store(new FileWriter(path), null);

        properties = new Properties();
        properties.load(new FileReader(path));
        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        System.out.println(dog);

        String path2 = "src\\dog.dat";
        FileOutputStream fileOutputStream = new FileOutputStream(path2);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path2));
        Dog dog2 = (Dog)objectInputStream.readObject();
        System.out.println(dog2);
    }
}
class Dog implements Serializable {
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