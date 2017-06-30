package Observer;
/**
 * Created by lenovo on 2017/6/30.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
