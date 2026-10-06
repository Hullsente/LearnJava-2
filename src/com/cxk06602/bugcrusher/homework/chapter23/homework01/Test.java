package com.cxk06602.bugcrusher.homework.chapter23.homework01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    static void main() throws Throwable {
        Class<?> aClass = Class.forName("com.cxk06602.bugcrusher.homework.chapter23.homework01.PrivateTest");
        Object object = aClass.getDeclaredConstructor().newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(object, "My name");
        Method getName = aClass.getDeclaredMethod("getName");
        Object invoke = getName.invoke(object);
        System.out.println(invoke);
    }
}
