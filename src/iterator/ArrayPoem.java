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
}
