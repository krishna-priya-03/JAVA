import java.awt.*;
import java.awt.event.*;

class PercentageFace extends Frame implements ActionListener {

    Label l1 = new Label("Subject 1:");
    Label l2 = new Label("Subject 2:");
    Label l3 = new Label("Subject 3:");
    Label l4 = new Label("Subject 4:");
    Label l5 = new Label("Subject 5:");
    Label result = new Label("Percentage:");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();
    TextField t6 = new TextField();

    Button b1 = new Button("Calculate");

    int percentage = 0;

    PercentageFace() {
        setLayout(null);

        l1.setBounds(50,50,100,20);   t1.setBounds(160,50,100,20);
        l2.setBounds(50,80,100,20);   t2.setBounds(160,80,100,20);
        l3.setBounds(50,110,100,20);  t3.setBounds(160,110,100,20);
        l4.setBounds(50,140,100,20);  t4.setBounds(160,140,100,20);
        l5.setBounds(50,170,100,20);  t5.setBounds(160,170,100,20);

        result.setBounds(50,210,100,20);
        t6.setBounds(160,210,100,20);
        t6.setEditable(false);

        b1.setBounds(100,250,100,30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(result); add(t6);
        add(b1);

        b1.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int m1 = Integer.parseInt(t1.getText());
        int m2 = Integer.parseInt(t2.getText());
        int m3 = Integer.parseInt(t3.getText());
        int m4 = Integer.parseInt(t4.getText());
        int m5 = Integer.parseInt(t5.getText());

        int total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5;

        t6.setText(String.valueOf(percentage));

        repaint(); // redraw face
    }

    public void paint(Graphics g) {
        // Draw face
        g.drawOval(100, 280, 150, 150); // face

        g.fillOval(130, 320, 15, 15); // left eye
        g.fillOval(190, 320, 15, 15); // right eye

        if (percentage > 50) {
            // 😊 Happy face
            g.drawArc(130, 350, 80, 40, 180, 180);
        } else {
            // ☹ Sad face
            g.drawArc(130, 380, 80, 40, 0, 180);
        }
    }

    public static void main(String[] args) {
        new PercentageFace();
    }
}