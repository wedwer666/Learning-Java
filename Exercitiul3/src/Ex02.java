/**
 * Created by Maria on 06.06.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex02 extends JFrame implements KeyListener {
    double scale = 1;

    public static void main(String[] args) {
        new Ex02().repaint();
    }

    Ex02() {
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawRectangle(g);
    }
    void drawRectangle(Graphics g) {
        int x = this.getWidth() / 2;
        int y = this.getHeight() / 2;
        int width = new Double(185 * scale).intValue();
        int height = new Double(105 * scale).intValue();
        System.out.println(width + " " + height);
//        g.setColor(Color.BLACK);
//        g.drawRect(x, y, 185, 105);

//        g.setColor(Color.BLUE);
        g.drawRect(x, y, width, height);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        scale = 1.5;
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        scale = 1.5;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        scale = 1.5;
    }
}