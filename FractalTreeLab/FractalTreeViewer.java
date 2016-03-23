
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FractalTreeViewer 
{
    private final int WIDTH = 700;
    private final int HEIGHT = 700;

    private final int MIN = 1, MAX = 20;

    private JButton increase, decrease;
    private JLabel titleLabel, orderLabel;
    private FractalPanel drawing;
    private JPanel panel, tools;
    private JFrame frame;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
         FractalTreeViewer viewer = new  FractalTreeViewer();
    }

    public FractalTreeViewer()
    {
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.yellow);
        tools.setOpaque (true);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (Box.createHorizontalStrut (20));

        drawing = new FractalPanel (1);

        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
}