package org.springboot.sample.entity;

/**
 * Created by lin.yang on 2017-09-11.
 */
public class Student {
    private int id;
    private int age;
    private String name;
    private String sumScore;
    private String avgScore;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSumScore() {
        return sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }
}
