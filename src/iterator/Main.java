package iterator;

/**
 * Created by lenovo on 2017/7/4.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(" 捣练子");
        declaim(new CollectionPoem().createIterator());
        System.out.println("\n 又");
        declaim(new ArrayPoem().createIterator());

    }

    /**
     *  朗诵诗篇
     * @param iterator
     */
    private static void declaim(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
