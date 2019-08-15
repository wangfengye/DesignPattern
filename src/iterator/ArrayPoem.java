package iterator;

/**
 * Created by lenovo on 2017/7/4.
 */
public class ArrayPoem {
    static final int MAX_ITEMS=6;
    int postion = 0;
    String[] items;

    public ArrayPoem() {
        items =new String[MAX_ITEMS];
        addItem("风淅淅,雨纤纤,难怪春愁细细添.");
        addItem("记不分明疑是梦,梦来还隔一重帘.");
    }
    public Iterator createIterator(){
        return new ArrayPoemIterator(items);
    }

    private void addItem(String s) {
        if (postion>=MAX_ITEMS){
            System.out.print("out of index");
        }else {
            items[postion]=s;
            postion++;
        }
    }

   static class ArrayPoemIterator implements Iterator{
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
}
