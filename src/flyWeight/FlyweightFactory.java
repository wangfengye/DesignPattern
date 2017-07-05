package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/5.
 */
public class FlyweightFactory {
    private Map<Character,Flyweight> files=new HashMap<>();
    public Flyweight factory(Character character){
        Flyweight fly=files.get(character);
        if (fly==null){
            fly=new ConcreteFlyweight(character);
        }
        files.put(character,fly);
        return fly;
    }
}
