package builder;

/**
 * Created by lenovo on 2017/6/28.
 */
public class PersonBuilder {
    Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public void setName(String name){
        person.setName(name);
    }
    public void setAge(String age){
        person.setAge(age);
    }
    public void setSex(String sex){
        person.setSex(sex);
    }
}
