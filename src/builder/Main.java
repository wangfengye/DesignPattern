package builder;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Main {
    public static void main(String[] args){
       Person person = new Person.Builder()
               .setName("maple")
               .setAge("16")
               .setSex("man")
               .create();
        System.out.print(person.toString());

    }
}
