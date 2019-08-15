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


     static class CollectionPoemIterator implements Iterator {
        ArrayList<String> items;
        int position = 0;

        public CollectionPoemIterator(ArrayList<String> items) {
            this.items = items;
        }

        @Override
        public boolean hasNext() {
            if (items.size()>position&&items.get(position)!=null)return true;
            return false;
        }

        @Override
        public Object next() {
            String result =items.get(position);
            position++;
            return result;
        }
    }
}
