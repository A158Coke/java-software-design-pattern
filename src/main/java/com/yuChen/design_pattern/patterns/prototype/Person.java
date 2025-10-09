package com.yuChen.design_pattern.patterns.prototype;

import lombok.Data;
import lombok.val;

@Data
public class Person implements Cloneable {
    private String name;
    private int age;
    private String sex;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        val person = new Person();
        person.setName("YuChen");
        person.setAge(18);
        val clone = person.clone();

        System.out.println(clone); // Person(name=YuChen, age=18, sex=null)
    }
}
