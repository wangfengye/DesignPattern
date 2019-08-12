package template;


import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/3.
 * 定义好排序的算法,具体比较大小的算法由类自己实现
 */
public class Sort {

    public static final <T extends Comparable<? super T>> void sort(ArrayList<T> persons) {

        mergeSort(0, persons.size(), persons);
        System.out.println("---sort end---");
    }

    private static <T extends Comparable<? super T>> void mergeSort(int low, int high, ArrayList<T> persons) {

        for (int i = low; i < high; i++) {
            for (int j = i; j > low && (persons.get(j - 1).compareTo(persons.get(j)) > 0); j--) {
                swap(j - 1, j, persons);
            }
        }

    }

    private static <T extends Comparable<? super T>> void swap(int i, int j, ArrayList<T> persons) {
        T temp = persons.get(i);
        persons.set(i, persons.get(j));
        persons.set(j, temp);
    }


}
