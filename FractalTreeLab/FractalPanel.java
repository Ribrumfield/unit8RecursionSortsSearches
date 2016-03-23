import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.util.Random;

public class FractalPanel extends JPanel
{
    private final int PANEL_WIDTH = 1000;
    private final int PANEL_HEIGHT = 700;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private int current;
    public FractalPanel (int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth)
    {
        if (depth == 0) 
        {
            return;
        }
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 15.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 11.0);
        int R = (int)(Math.random()*255);
        int G = (int)(Math.random()*255);
        int B = (int)(Math.random()*255);
        g.setColor(new Color(R,G,B));
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 40, depth - 1);
        drawTree(g, x2, y2, angle + 40, depth - 1);
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        g.setColor (Color.green);
        drawTree(g, 500, 500, -90, 10);
    }
}