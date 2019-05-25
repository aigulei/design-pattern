package com.ai.gof.creational.prototype.clone;

import com.ai.gof.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        Method method = hungrySingleton1.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton hungrySingleton2 = (HungrySingleton)method.invoke(hungrySingleton1);
        System.out.println(hungrySingleton1);
        System.out.println(hungrySingleton2);


        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
