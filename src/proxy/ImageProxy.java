package proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by lenovo on 2017/7/5.
 */
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving =false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon!=null)return imageIcon.getIconWidth();
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon!=null)return imageIcon.getIconHeight();
        return 800;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon!=null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("loading",x,y);
            if (!retrieving){
                retrieving=true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                      try {
                          imageIcon =new ImageIcon(imageUrl,"CD Cover");
                          c.repaint();
                      }catch (Exception e){
                          e.printStackTrace();
                      }
                    }
                });
                retrievalThread.start();
            }
        }

    }


}
