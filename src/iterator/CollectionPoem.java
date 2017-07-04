package iterator;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/4.
 */
public class CollectionPoem {
    ArrayList<String> items;

    public CollectionPoem() {
        items =new ArrayList<>();
        addItem("惊晓漏,护春眠.");
        addItem("格外娇慵只自怜.");
        addItem("寄语酿花风日好,绿窗来与上琴弦");
    }
    public Iterator createIterator(){
        return new CollectionPoemIterator(items);
    }
    public void addItem(String line){
        items.add(line);
    }

}
