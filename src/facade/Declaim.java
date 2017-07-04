package facade;

/**
 * Created by lenovo on 2017/7/3.
 */
public class Declaim {
    private UpSection upSection;
    private DownSection downSection;

    public Declaim(UpSection upSection, DownSection downSection) {
        this.upSection = upSection;
        this.downSection = downSection;
    }

    public void declaim(){
        upSection.declaim();
        downSection.declaim();
    }

}
