import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class CanvastTest implements Runnable {
    private static int rectX = 10;
    private static int rectY = 10;
    private static int getPosition (int orig){
        int pos = -10000;
        while (pos + orig < 0 || pos + orig > 1000) {
            double r = Math.random();
            boolean dir = Math.round(r * 100) % 2 == 0;
            pos = (int) (50 * r * (dir ? 1 : -1));
        }
        return pos;
    }
    public void run () {
        while (true) {
            rectY = getPosition(rectY);
            rectX = getPosition(rectX);
            System.out.println(rectX);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final String title = "Test Window";
        final int width = 1200;
        final int height = width / 16 * 9;
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        Canvas canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setBackground(Color.BLACK);
        canvas.setVisible(true);
        canvas.setFocusable(false);
        frame.add(canvas);
        canvas.createBufferStrategy(3);
        boolean running = true;
        BufferStrategy bufferStrategy;
        Graphics graphics;
        new Thread(new CanvastTest()).start();
        while (running) {
            bufferStrategy = canvas.getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            graphics.clearRect(0, 0, width, height);
            graphics.setColor(Color.GREEN);
            graphics.drawString("This is some text placed in the top left corner.", 5, 15);
            graphics.drawRect(rectX,rectY,200,100);
            bufferStrategy.show();
            graphics.dispose();
        }
    }
}
