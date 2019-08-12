package template;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/3.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons=new ArrayList<>();
        persons.add(new Person("a",3));
        persons.add(new Person("b",4));
        persons.add(new Person("c",2));
        Sort.sort(persons);
        System.out.print(persons);

    }
}
