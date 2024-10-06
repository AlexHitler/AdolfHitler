package org.example;

import s1.Perexodnik;

import javax.swing.*;  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static javax.swing.text.StyleConstants.setBackground;

public class Main{

    public static void main(String[] args) {
        Perexodnik per = new Perexodnik();
    }

    
public class Perexodnik extends JFrame implements ActionListener, MouseListener {


    BufferedImage icon;
    BufferedImage icon11;
    BufferedImage icon12;


    public Perexodnik() {

        setLayout(null);
        setSize(970, 500);
        setBackground(Color.BLACK);

        JLabel l = new JLabel("Some Good Applications");
        l.setBounds(387, 30, 300, 50);
        l.setBackground(Color.WHITE);
        add(l);

        ImageIcon icon1 = null;
        ImageIcon icon2 = null;
        ImageIcon icon3 = null;

        try {
            icon = ImageIO.read(getClass().getResource("/icons8-96.png"));
            icon1 = new ImageIcon(icon);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            icon11 = ImageIO.read(getClass().getResource("/rigba.png"));
            icon2 = new ImageIcon(icon11);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            icon12 = ImageIO.read(getClass().getResource("/paint.png"));
            icon3 = new ImageIcon(icon12);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        JButton a = new JButton(icon1);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc calc = new Calc();
            }
        });
        JButton b = new JButton(icon2);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game game = new Game();
            }
        });
        JButton c = new JButton(icon3);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paint paint = new Paint();
            }
        });
        setVisible(true);

        a.setLocation(230, 150);
        a.setSize(150, 150);
        a.setBackground(Color.BLACK);
        add(a);

        b.setLocation(380, 150);
        b.setSize(150, 150);
        b.setBackground(Color.BLACK);
        add(b);

        c.setLocation(530, 150);
        c.setSize(150, 150);
        c.setBackground(Color.BLACK);
        add(c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Ball {

    private int x,y, xStep, yStep;


    private int rad = 20;

    private Color color;

    private int width, height;

    public Ball(int x, int y, int xStep, int yStep, Color color, int width, int height) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
        this.color = color;
        this.width = width;
        this.height = height;
        new Move().start();
    }
    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxStep() {
        return xStep;
    }

    public void setxStep(int xStep) {
        this.xStep = xStep;
    }

    public int getyStep() {
        return yStep;
    }

    public void setyStep(int yStep) {
        this.yStep = yStep;
    }



    public class Move extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    x += xStep;
                    y += yStep;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


public class Paint extends JFrame {



    int y = 50;

    boolean red = false;
    boolean blue = false;
    boolean yellow = false;
    boolean green = false;
    boolean black = false;
    boolean gray = false;
    boolean magenta = false;
    boolean pink = false;

    boolean lastik = false;

    int x = 0;


    Color color = Color.BLACK;

    public Paint(){

        setLayout(null);
        setSize(700, 600);
        setBackground(Color.WHITE);

        JButton button = new JButton("LASTIK");
        button.setBounds(30,30,100,50);
        button.setBackground(Color.WHITE);
        add(button);
        JButton button2 = new JButton();
        button2.setBounds(640,30,30,30);
        button2.setBackground(Color.RED);
        add(button2);
        JButton button3 = new JButton();
        button3.setBounds(640,60,30,30);
        button3.setBackground(Color.GREEN);
        add(button3);
        JButton button4 = new JButton();
        button4.setBounds(610,30,30,30);
        button4.setBackground(Color.YELLOW);
        add(button4);
        JButton button5 = new JButton();
        button5.setBounds(610,60,30,30);
        button5.setBackground(Color.BLUE);
        add(button5);
        JButton button6 = new JButton();
        button6.setBounds(640,90,30,30);
        button6.setBackground(Color.BLACK);
        add(button6);
        JButton button7 = new JButton();
        button7.setBounds(640,120,30,30);
        button7.setBackground(Color.GRAY);
        add(button7);
        JButton button8 = new JButton();
        button8.setBounds(610,90,30,30);
        button8.setBackground(Color.MAGENTA);
        add(button8);
        JButton button9 = new JButton();
        button9.setBounds(610,120,30,30);
        button9.setBackground(Color.PINK);
        add(button9);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lastik){
                    lastik = false;
                }else{
                    lastik = true;
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (red){
                    red = false;
                }else{
                    red = true;
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (green){
                    green = false;
                }else{
                    green = true;
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (yellow){
                    yellow = false;
                }else{
                    yellow = true;
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (blue){
                    blue = false;
                }else{
                    blue = true;
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (black){
                    black = false;
                }else{
                    black = true;
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (gray){
                    gray = false;
                }else{
                    gray = true;
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (magenta){
                    magenta = false;
                }else{
                    magenta = true;
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (pink){
                    pink = false;
                }else{
                    pink = true;
                }
            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.BLACK);
                if(lastik){
                    g.setColor(Color.WHITE);
                    g.fillRect(e.getX(), e.getY(),50,50);
                    return;
                }

                Graphics s = getGraphics();
                s.setColor(Color.BLACK);
                if(red){
                    s.setColor(Color.RED);
                    s.fillOval(e.getX(), e.getY(), 5,30);
                    return;
                }

                Graphics b = getGraphics();
                b.setColor(Color.BLACK);
                if(green){
                    b.setColor(Color.GREEN);
                    b.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics j = getGraphics();
                j.setColor(Color.BLACK);
                if(yellow){
                    j.setColor(Color.YELLOW);
                    j.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics f = getGraphics();
                f.setColor(Color.BLACK);
                if(blue){
                    f.setColor(Color.BLUE);
                    f.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics h = getGraphics();
                h.setColor(Color.BLACK);
                if(black){
                    h.setColor(Color.BLACK);
                    h.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics i = getGraphics();
                i.setColor(Color.BLACK);
                if(gray){
                    i.setColor(Color.GRAY);
                    i.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics c = getGraphics();
                c.setColor(Color.BLACK);
                if(magenta){
                    c.setColor(Color.MAGENTA);
                    c.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                Graphics p = getGraphics();
                p.setColor(Color.BLACK);
                if(pink){
                    p.setColor(Color.PINK);
                    p.fillOval(e.getX(), e.getY(), 2,30);
                    return;
                }

                if(x==0 && y==0){
                    x = e.getX();
                    y = e.getY();
                    return;
                }

                g.drawLine(x,y, e.getX(), e.getY());
                x = e.getX();
                y = e.getY();

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                x = 0;
                y = 0;
            }


        });

        setVisible(true);
    }
}


public class Game extends JFrame implements MouseListener {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Game() {
        setTitle("Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        addMouseListener(this);
        new GameThread().start();

    }


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        wall();
        collizion();
        balls.forEach(ball -> ball.draw(g));

    }

    private void collizion() {
        for (int i = 0; i < balls.size(); i++) {
            for (int j = i+1; j < balls.size(); j++) {
                int a = Math.abs(balls.get(i).getX() - balls.get(j).getX());
                int b = Math.abs(balls.get(i).getY() - balls.get(j).getY());
                int c = (int) Math.sqrt(a*a + b*b);
                if (c <= balls.get(i).getRad()+balls.get(j).getRad()){
                    balls.get(i).setxStep(-balls.get(i).getxStep());
                    balls.get(i).setyStep(-balls.get(i).getyStep());
                    balls.get(j).setxStep(-balls.get(j).getxStep());
                    balls.get(j).setyStep(-balls.get(j).getyStep());
                }
            }
        }
    }

    private void wall() {
        int x = 0, y = 0, width = getWidth(), height = getHeight();
        balls.forEach(ball -> {
            if (ball.getX() < x && ball.getX() > width - 20 && ball.getY() < y || ball.getY() > height - 20) {
                ball.setxStep(-ball.getxStep());
                ball.setyStep(-ball.getyStep());
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Random random = new Random();
        int xStep = random.nextInt(20) - 10;
        int yStep = random.nextInt(20) - 10;
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int width = random.nextInt(10) + 35;
        int height = random.nextInt(10) + 35;
        Ball ball = new Ball(x, y, xStep, yStep, color, width, height);
        balls.add(ball);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    class GameThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}


public class Calc extends JFrame implements ActionListener, MouseListener {

    private String sign = "";
    private String text1 = "";

    public Calc(){
        setLayout(null);
        setSize(300, 400);
        setBackground(Color.BLACK);

        JTextField TxtField = new JTextField();
        TxtField.setEditable(false);
        TxtField.setSize(300, 30);
        TxtField.setLocation(0, 10);
        add(TxtField);

        JButton a = new JButton("1");
        a.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "1");
            }
        });

        JButton jButtonClear = new JButton("Del");
        jButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText("");
                text1 = "";
                sign = "";
            }
        });

        JButton b = new JButton("2");
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "2");
            }
        });

        JButton c = new JButton("3");
        c.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "3");
            }
        });

        JButton d = new JButton("4");
        d.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "4");
            }
        });

        JButton M = new JButton("5");
        M.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "5");
            }
        });

        JButton f = new JButton("6");
        f.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "6");
            }
        });

        JButton g = new JButton("7");
        g.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "7");
            }
        });

        JButton h = new JButton("8");
        h.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "8");
            }
        });

        JButton i = new JButton("9");
        i.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "9");
            }
        });

        JButton j = new JButton("*");
        j.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = TxtField.getText();
                sign = "*";
                TxtField.setText("");
            }
        });

        JButton k = new JButton("0");
        k.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtField.setText(TxtField.getText() + "0");
            }
        });


        JButton m = new JButton("-");
        m.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = TxtField.getText();
                sign = "-";
                TxtField.setText("");
            }
        });

        JButton n = new JButton("+");
        n.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = TxtField.getText();
                sign = "+";
                TxtField.setText("");
            }
        });

        JButton o = new JButton("/");
        o.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = TxtField.getText();
                sign = "/";
                TxtField.setText("");
            }
        });

        JButton l = new JButton("=");
        l.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (sign) {
                    case "+":
                        TxtField.setText(String.valueOf(Integer.parseInt(text1) + Integer.parseInt(TxtField.getText())));
                        break;
                    case "-":
                        TxtField.setText(String.valueOf(Integer.parseInt(text1) - Integer.parseInt(TxtField.getText())));
                        break;
                    case "*":
                        TxtField.setText(String.valueOf(Integer.parseInt(text1) * Integer.parseInt(TxtField.getText())));
                        break;
                    case "/":
                        TxtField.setText(String.valueOf(Integer.parseInt(text1) / Integer.parseInt(TxtField.getText())));
                        break;
                    default:
                        System.out.println("Error! Enter correct please!");
                        break;
                }
            }
        });
        setVisible(true);


        a.setLocation(0, 70);
        a.setBackground(new Color(Color.ORANGE.getRGB()));
        a.setSize(70, 70);
        add(a);

        b.setLocation(70, 70);
        b.setBackground(new Color(Color.ORANGE.getRGB()));
        b.setSize(70, 70);
        add(b);

        c.setLocation(140, 70);
        c.setBackground(new Color(Color.ORANGE.getRGB()));
        c.setSize(70, 70);
        add(c);

        d.setLocation(210, 70);
        d.setBackground(new Color(Color.ORANGE.getRGB()));
        d.setSize(70, 70);
        add(d);

        M.setLocation(0, 140);
        M.setBackground(new Color(Color.ORANGE.getRGB()));
        M.setSize(70, 70);
        add(M);

        f.setLocation(70, 140);
        f.setBackground(new Color(Color.ORANGE.getRGB()));
        f.setSize(70, 70);
        add(f);

        g.setLocation(140, 140);
        g.setBackground(new Color(Color.ORANGE.getRGB()));
        g.setSize(70, 70);
        add(g);

        h.setLocation(210, 140);
        h.setBackground(new Color(Color.ORANGE.getRGB()));
        h.setSize(70, 70);
        add(h);

        i.setLocation(0, 210);
        i.setBackground(new Color(Color.ORANGE.getRGB()));
        i.setSize(70, 70);
        add(i);

        k.setLocation(70, 210);
        k.setBackground(new Color(Color.ORANGE.getRGB()));
        k.setSize(70, 70);
        add(k);

        j.setLocation(140, 210);
        j.setBackground(new Color(Color.ORANGE.getRGB()));
        j.setSize(70, 70);
        add(j);

        jButtonClear.setBackground(new Color(Color.ORANGE.getRGB()));
        jButtonClear.setSize(70, 70);
        jButtonClear.setLocation(210, 210);
        add(jButtonClear);

        m.setLocation(0, 280);
        m.setBackground(new Color(Color.GRAY.getRGB()));
        m.setSize(70, 70);
        add(m);

        n.setLocation(70, 280);
        n.setBackground(new Color(Color.ORANGE.getRGB()));
        n.setSize(70, 70);
        add(n);

        o.setLocation(140, 280);
        o.setBackground(new Color(Color.ORANGE.getRGB()));
        o.setSize(70, 70);
        add(o);

        l.setLocation(210, 280);
        l.setBackground(new Color(Color.GRAY.getRGB()));
        l.setSize(70, 70);
        add(l);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

}
