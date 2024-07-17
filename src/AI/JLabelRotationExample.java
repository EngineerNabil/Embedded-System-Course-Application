/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelRotationExample extends JFrame {

    public JLabelRotationExample() {
        super("JLabel Rotation Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JLabel label = new JLabel("Hello, World!");
        label.setFont(new Font("Serif", Font.BOLD, 30));
        label.setForeground(Color.RED);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);

        panel.add(label);

        add(panel);
    }

    public static void main(String[] args) {
        JLabelRotationExample example = new JLabelRotationExample();
        example.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Get the label's bounds and center point
        JLabel label = (JLabel) getContentPane().getComponent(0);
        int x = label.getX();
        int y = label.getY();
        int width = label.getWidth();
        int height = label.getHeight();
        int cx = x + width / 2;
        int cy = y + height / 2;

        // Set the rotation angle in degrees
        double angle = 45;

        // Create the transformation
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(angle), cx, cy);
        g2d.setTransform(transform);

        // Paint the label using the transformed graphics object
        getContentPane().getComponent(0).paint(g2d);
    }
}