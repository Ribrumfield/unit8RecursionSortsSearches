import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;

public class FractalPanel extends JPanel
{
   private final int PANEL_WIDTH = 700;
   private final int PANEL_HEIGHT = 700;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;

   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public FractalPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal ( int x1, int y1, int x2, int y2,
                            Graphics g)
   {
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(new Line2D.Double(x1,y1,x2,y2));
        //       int deltaX, deltaY, x2, y2, x3, y3, x4, y4;
        // 
        //       if (order == 1)
        //          page.drawLine (x1, y1, x5, y5);
        //       else
        //       {
        //          deltaX = x5 - x1;  // distance between end points
        //          deltaY = y5 - y1;
        // 
        //          x2 = x1 + deltaX / 3;  // one third
        //          y2 = y1 + deltaY / 3;
        // 
        //          x3 = (int) ((x1+x5)/2 + SQ * (y1-y5));  // tip of projection
        //          y3 = (int) ((y1+y5)/2 + SQ * (x5-x1));
        // 
        //          x4 = x1 + deltaX * 2/3;  // two thirds
        //          y4 = y1 + deltaY * 2/3;
        // 
        //          drawFractal (order-1, x1, y1, x2, y2, page);
        //          drawFractal (order-1, x2, y2, x3, y3, page);
        //          drawFractal (order-1, x3, y3, x4, y4, page);
        //          drawFractal (order-1, x4, y4, x5, y5, page);
        //       }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics g)
   {
      super.paintComponent (g);

      g.setColor (Color.green);
      drawFractal( 10,10,40,40,g);
        //       drawFractal (current, TOPX, TOPY, LEFTX, LEFTY, page);
        //       drawFractal (current, LEFTX, LEFTY, RIGHTX, RIGHTY, page);
        //       drawFractal (current, RIGHTX, RIGHTY, TOPX, TOPY, page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
