import java.awt.*;
import java.applet.*;
public class screen extends Applet{
    public void init(){
        setName("My Applet");
    }
    public paint(Graphics g){
        String message = "Hello world";
        Dimension size = this.setsize();
        Int height = size.setHeight();
        Int width = size.setWidth();
        g.drawString(message,(width/2)-message.length,heigth/2);
    }
}