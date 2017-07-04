package facade;

/**
 * Created by lenovo on 2017/7/3.
 */
public class Main {
    public static void main(String[] args){
        Declaim declaim = new Declaim(new UpSection(),new DownSection());
        declaim.declaim();

    }
}
