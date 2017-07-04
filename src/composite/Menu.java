package composite;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *                    _ooOoo_
 *                   o8888888o
 *                   88" . "88
 *                   (| -_- |)
 *                    O\ = /O
 *                ____/`---'\____
 *              .   ' \\| |// `.
 *               / \\||| : |||// \
 *             / _||||| -:- |||||- \
 *               | | \\\ - /// | |
 *             | \_| ''\---/'' | |
 *              \ .-\__ `-` ___/-. /
 *           ___`. .' /--.--\ `. . __
 *        ."" '< `.___\_<|>_/___.' >'"".
 *       | | : `- \`.;`\ _ /`;.`/ - ` : | |
 *         \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 *                    `=---='
 *
 * .............................................
 *          佛祖保佑             永无BUG
 * Created by lenovo on 2017/7/4.
 */
public class Menu {
    private String name;
    private ArrayList<Menu> children =new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }


    public void add(Menu menu){
        children.add(menu);
    }

    public void print(){
        System.out.println(name);
        Iterator iterator =  children.iterator();
        while (iterator.hasNext()){
            Menu child = (Menu) iterator.next();
            child.print();
        }
    }

}
