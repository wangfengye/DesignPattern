package adapter;

/**
 * Created by lenovo on 2017/7/3.
 */
public class WildTurkey implements Turkey{
    private final static String TAG =WildTurkey.class.getSimpleName();
    @Override
    public void gobble() {
        System.out.println(TAG+" 骊山语罢情宵半,泪雨零铃终不怨");
    }

    @Override
    public void hop() {
        System.out.println(TAG+" 何如薄幸锦衣郎,比翼连枝当日愿");
    }
}
