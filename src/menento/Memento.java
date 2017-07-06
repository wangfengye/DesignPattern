package menento;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Memento {
    private String name;

    public Memento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
