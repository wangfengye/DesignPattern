package iterator;

/**
 * Created by lenovo on 2017/7/4.
 */
public class ArrayPoemIterator implements Iterator{
    String[] items;
    int postion =0;

    public ArrayPoemIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (items.length>postion&&items[postion]!=null)return true;
        return false;
    }

    @Override
    public Object next() {
        String result =items[postion];
        postion++;
        return result;
    }
}
