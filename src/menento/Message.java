package menento;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Message {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void restoreMemento(Memento memento){
        this.name=memento.getName();
    }
    public Memento createMemento(){
        return new Memento(this.getName());
    }
}
