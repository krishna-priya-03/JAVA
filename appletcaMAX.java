import java.awt.*;
import java.awt.event.*;

public class appletcaMAX extends Frame implements ActionListener
{
    Frame f1 = new Frame();

    Label l4 = new Label("Calculator");
    Label l1 = new Label("Enter first number");
    Label l2 = new Label("Enter second number");
    Label l3 = new Label("Enter third number");
    Label l5 = new Label("Maximum");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField(); // result field

    Button b1 = new Button("MAX");
    Button b5 = new Button("Cancel");

    appletcaMAX()
    {
        l4.setBounds(150, 50, 200, 20);
        l1.setBounds(50, 100, 150, 20);
        l2.setBounds(50, 130, 150, 20);
        l3.setBounds(50, 160, 150, 20);
        l5.setBounds(50, 190, 150, 20);

        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 130, 100, 20);
        t3.setBounds(200, 160, 100, 20);
        t4.setBounds(200, 190, 100, 20);

        b1.setBounds(50, 250, 60, 30);
        b5.setBounds(280, 250, 60, 30);

        f1.add(l4);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l5);

        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);

        f1.add(b1);
        f1.add(b5);

        b1.addActionListener(this);
        b5.addActionListener(this);

        f1.setLayout(null);
        f1.setSize(500, 500);
        f1.setVisible(true);

        b1.setBackground(Color.MAGENTA);
        b5.setBackground(Color.ORANGE);
        f1.setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            try
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());

                int max = a;

                if (b > max)
                    max = b;
                if (c > max)
                    max = c;

                t4.setText(String.valueOf(max));
            }
            catch (Exception ex)
            {
                t4.setText("Invalid Input");
            }
        }

        if (e.getSource() == b5)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
    }

    public static void main(String args[])
    {
        new appletcaMAX();
    }
}