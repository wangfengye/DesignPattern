package builder;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Person {
    private String name;
    private String age;
    private String sex;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
    public static class Builder{
        private String name;
        private String age;
        private String sex;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(String age) {
            this.age = age;
            return this;
        }
        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public Person create(){
            return new Person(this);
        }

    }
}
