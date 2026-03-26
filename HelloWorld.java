import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
/*
<applet code="HelloWorld.java" width=500 height=500>
</applet>
*/
public class HelloWorld extends Applet {
    @Override public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(100,50,200,200);
        g.setColor(Color.black);
        g.fillOval(150,100,20,20);
        g.setColor(Color.black);
        g.fillOval(230,100,20,20);
        g.setColor(Color.red);
        g.drawArc(160, 140, 80, 50, 180, 180);
        
        g.drawOval(70,110,30,40);
        g.drawOval(300,110,30,40);

        g.drawLine(200, 120, 200, 160);
        
       
        

    }
}