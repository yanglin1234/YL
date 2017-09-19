package cn.com.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lin.yang on 2017-09-12.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InterruptedException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // Class cls = Class.forName(clas);
        Class c = Person.class;
        Constructor constructor = c.getConstructor();
        constructor.setAccessible(true);
        Person person = (Person) constructor.newInstance();
        System.out.println(person.toString());
        Person person1 = new Person();

        System.out.println("person1:" + person1.toString());
        //    Field[] field = c.getDeclaredFields();

        Thread thread = new Thread(new PersonThread(person1));
        thread.start();
        thread.wait();

        thread.join();


    }
}
