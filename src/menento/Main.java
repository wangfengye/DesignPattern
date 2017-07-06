package menento;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        Message message = new Message();
        message.setName("a");
        Caretaker caretaker =new Caretaker();
        caretaker.setMemento(message.createMemento());
        message.setName("b");
        message.setName("c");
        System.out.println(message.getName());
        message.restoreMemento(caretaker.getMemento());
        System.out.println(message.getName());
    }

}
