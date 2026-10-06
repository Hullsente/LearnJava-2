package com.cxk06602.bugcrusher.homework.chapter23.homework02;

import java.io.File;
import java.lang.reflect.Constructor;

public class Main {
    static void main() throws Exception{
        Class<?> aClass = Class.forName("java.io.File");
        for(Constructor<?> constructor : aClass.getDeclaredConstructors()){
            System.out.print(constructor.getName());
            for(Class<?> classes : constructor.getParameterTypes()){
                System.out.print(" " + classes.getSimpleName());
            }
            System.out.println();
        }
        Object object = aClass.getConstructor(String.class).newInstance("D:\\mynew.txt");
        File file = (File) object;
        file.createNewFile();
    }
}
