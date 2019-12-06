import java.awt.*;
import javax.swing.JFrame;

public class Frame extends JFrame
{
    protected static int width = 1200; // параметры окна: высота, длина и цвет
    protected static int height = 700;
    protected static Color backgroundColor = Color.GRAY;
    private Convex convex;

    public Frame(Convex convex) // Отображение окна
    {
        super("CONVEX"); // название
        this.setSize(width, height); // размеры окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // операция закрытия программы вместе с окном
        this.setVisible(true); // задает видимость
        this.convex=convex; // инициализация конвекс
    }

    public void paint(Graphics g)
    {
        Rectangle s = this.getBounds(); // использование размеров окна динамически
        g.setColor(backgroundColor);
        g.translate(s.width/2, s.height/2);//Charge coord to center
        g.fillRect(-s.width/2, -s.height/2, s.width, s.height);// фон
        g.setColor(Color.WHITE);
        g.drawLine(-s.width /2, 0, s.width/2, 0);// оси
        g.drawLine(0, -s.height/2, 0, s.height/2);
        g.setColor(Color.BLACK); // смена цвета
        convex.draw(g);// прорисовка точек всех (использование Дро)
    }
}
