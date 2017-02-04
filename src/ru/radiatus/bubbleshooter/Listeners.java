package ru.radiatus.bubbleshooter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listeners implements KeyListener{

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W) Player.up = true;
        if(key == KeyEvent.VK_S) Player.down = true;
        if(key == KeyEvent.VK_A) Player.left = true;
        if(key == KeyEvent.VK_D) Player.right = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_W) Player.up = false;
        if(key == KeyEvent.VK_S) Player.down = false;
        if(key == KeyEvent.VK_A) Player.left = false;
        if(key == KeyEvent.VK_D) Player.right = false;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
