package iterator;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/4.
 */
public class CollectionPoemIterator implements Iterator {
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
