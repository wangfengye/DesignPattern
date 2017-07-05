package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/7/5.
 * 浅拷贝 ,拷贝基本类型,对于引用类型,只拷贝其引用;效率高;不能完全做到保护性拷贝
 */
public class Person implements Cloneable{

    private String name;
    private int age;
    private List numbers;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.numbers =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addNumber(int n){
        numbers.add(n);
    }

    public Person clone(){
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numbers=" + numbers +
                '}';
    }
}
