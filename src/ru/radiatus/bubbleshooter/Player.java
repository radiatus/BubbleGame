package ru.radiatus.bubbleshooter;

import java.awt.*;

public class Player {

    //Fields
    private double x;
    private double y;
    private int r;

    private int speed;

    private Color color1;
    private Color color2;

    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;

    //Constructor
    public Player(){
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;
        r = 5;
        speed = 5;

        color1 = Color.WHITE;

        up = false;
        down = false;
        left = false;
        right = false;
    }

    //Functions
    public void update(){
        // Здесь реализована система управления
        if(up && y > r) y -= speed;
        if(down && y < GamePanel.HEIGHT - r) y += speed;
        if(left && x > r) x -= speed;
        if(right && x < GamePanel.WIDTH - r) x += speed;
    }

    public void draw(Graphics2D g){
        g.setColor(color1);
        g.fillOval((int)(x - r), (int)(y - r), 2 * r, 2 * r);
        g.setStroke(new BasicStroke(3)); // увеличиваем толщину линий
        g.setColor(color1.darker()); // Делаем цвет потемнее
        g.drawOval((int)(x - r), (int)(y - r), 2 * r, 2 * r);
        g.setStroke(new BasicStroke(1));
    }
}
