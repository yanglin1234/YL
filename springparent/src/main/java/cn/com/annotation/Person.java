package cn.com.annotation;

/**
 * Created by lin.yang on 2017-09-12.
 */
@Targets
public class Person {
    private static String m="5";

    public static String getM() {
        return m;
    }

    public static void setM(String m) {
        Person.m = m;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        switch (name) {
            default:
                this.name = "22";
                break;
            case "33":
                this.name = "33";
                break;
        }
        this.name = name;
    }

    public Person() {
        System.out.println("初始化");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
