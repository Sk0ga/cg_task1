package cs.vsu.ru.skogorev_m_a.gr12;

import javax.swing.*;
import java.awt.*;

public class PanelDraw extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.BLACK);
        drawLine(g2d);
        g2d.setColor(Color.RED);
        drawRectangle(g2d);
        g2d.setColor(Color.ORANGE);
        drawTriangle1(g2d);
        g2d.setColor(Color.YELLOW);
        drawTriangle2(g2d);
        g2d.setColor(Color.BLUE);
        drawEllipse(g2d);
    }

    public void drawLine(Graphics2D g2d){
        g2d.drawLine(550,300,550,200);
    }

    public void drawEllipse(Graphics2D g2d){
        g2d.fillOval(500,300,100,50);
    }

    public void drawTriangle1(Graphics2D g2d){
        g2d.fillPolygon(new int[]{500,550,600}, new int[]{300,250,300}, 3);
    }

    public void drawTriangle2(Graphics2D g2d){
        g2d.fillPolygon(new int[]{550,600,550}, new int[]{200,210,220}, 3);
    }

    public void drawRectangle(Graphics2D g2d){
        g2d.fillPolygon(new int[]{500,500,600,600}, new int[]{300,400,400,300}, 4);
    }
}
