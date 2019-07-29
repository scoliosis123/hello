import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;
public class Blammo extends JPanel
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.setSize(800,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Blammo panel = new Blammo();
    frame.add(panel);
    frame.setVisible(true);
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Color mango = new Color(230, 199, 64);
    g.setColor(mango);
    g.fillOval(100,100,55,100);
    /*Color oh = new Color(255, 236, 153);
    g.setColor(oh);
    g.fillOval(x1Click,y1Click,80,80);*/
    Color tiff = new Color(169, 252, 251);
    g.setColor(tiff);
    g.fillRect(123,200,10,150);
  }
}