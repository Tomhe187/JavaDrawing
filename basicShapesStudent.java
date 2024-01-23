import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
public class basicShapesStudent extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(30,30,30,30);
        g.drawRect(15,60,60,40);

        g.setColor(Color.BLACK);
        g.fillRect(160,30,80,80);
        g.setColor(Color.WHITE);
        g.fillRect(160,30,20,20);
        g.fillRect(220,30,20,20);
        g.fillRect(160,90,20,20);
        g.fillRect(220,90,20,20);
        g.fillOval(160,30,40,40);
        g.fillOval(200,30,40,40);
        g.fillOval(160,70,40,40);
        g.fillOval(200,70,40,40);

        g.setColor(Color.BLACK);
        g.drawOval(30,120,50,50);
        g.fillOval(35,125,40,40);
        g.setColor(Color.WHITE);
        Font f1=new Font(Font.SANS_SERIF,Font.BOLD,25);
        g.setFont(f1);
        g.drawString("J",50,150);

        g.setColor(Color.BLACK);
        g.fillRect(160,120,40,40);
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[]{160,180,160}, new int[]{120,120,140},3);
        g.fillPolygon(new int[]{180,200,200}, new int[]{120,120,140},3);
        g.fillPolygon(new int[]{160,180,160}, new int[]{140,160,160},3);
        g.fillPolygon(new int[]{180,200,200}, new int[]{160,160,140},3);

    }
    public static void main(String[] args){
        JFrame window = new JFrame("Graphics Demo");
        window.setBounds(300, 300, 600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stops the window when you close it

        //creates a basicShapes object
        basicShapesStudent panel = new basicShapesStudent();
        panel.setBackground(Color.WHITE);  // background color; the default color is light gray
        Container c = window.getContentPane(); //gets the Window
        c.add(panel); //adds the panel to the window

        window.setVisible(true); //display the window
    }
}
