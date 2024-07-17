/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradientColorExample extends JFrame implements ActionListener{
    private JButton button;
    

    public void ButtonAnimationDemo() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Animate Me!");
        button.addActionListener(this);
        add(button);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        Thread animationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = button.getX();
                int y = button.getY();
                for (int i = 0; i < 50; i++) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    button.setLocation(x, y + i);
                }
            }
        });
        animationThread.start();
    }

    public static void main(String[] args) {
        new GradientColorExample();
    }
}
