import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

    /*<applet code="HouseApplet.class" width=400 height=400>
    </applet>*/ 

public class HouseApplet extends Applet implements MouseListener {

    Color doorColor = Color.BLUE; // initial color

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        // House base
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRect(100, 150, 200, 150);

        // Roof
        int x[] = {100, 200, 300};
        int y[] = {150, 80, 150};
        g2.setColor(Color.DARK_GRAY);
        g2.fillPolygon(x, y, 3);

        // Door
        g2.setColor(doorColor);
        g2.fillRect(180, 220, 40, 80);

        // Windows
        g2.setColor(Color.WHITE);
        g2.fillRect(120, 180, 40, 40);
        g2.fillRect(240, 180, 40, 40);

        // Window borders
        g2.setColor(Color.BLACK);
        g2.drawRect(120, 180, 40, 40);
        g2.drawRect(240, 180, 40, 40);

        // Door border
        g2.drawRect(180, 220, 40, 80);
    }

    // Mouse click event
    public void mouseClicked(MouseEvent e) {
        doorColor = Color.RED; // change color
        repaint(); // redraw
    }

    // Unused methods (must be implemented)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
