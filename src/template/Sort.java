package template;



import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/3.
 * 定义好排序的算法,具体比较大小的算法由类自己实现
 */
public class Sort {
    private static ArrayList<Person> staticPrsons;
    public static ArrayList<Person> sort(ArrayList<Person> persons){
        staticPrsons=persons;
        mergeSort(0,persons.size(),0);
        return staticPrsons;
    }

    private static void mergeSort(int low, int high, int i1) {
        for (int i=low;i<high;i++){
            for (int j=i;j>low && (staticPrsons.get(j-1).compareTo(staticPrsons.get(j))>0);j--){
                swap(j-1 ,j);
            }
        }
    }

    private static void swap( int i, int j) {
        Person temp =staticPrsons.get(i);
        staticPrsons.set(i,staticPrsons.get(j));
        staticPrsons.set(j,temp);
    }
}
