package Music_b;

import java.awt.event.*;
import javax.swing.*;

public class Pad extends JFrame implements ActionListener, KeyListener, MouseListener
{
    private JPanel mainPanel;
    private JPanel JPanel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton userButton;
    private JButton defaultButton1;
    private JButton defaultButton2;
    private JSlider slider1;
    private int temp = 0;

    public Pad()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        defaultButton1.addActionListener(this);
        defaultButton2.addActionListener(this);
        userButton.addActionListener(this);

        userButton.addMouseListener(this);

        button1.addKeyListener(this);
        button2.addKeyListener(this);
        button3.addKeyListener(this);
        button4.addKeyListener(this);
        button5.addKeyListener(this);
        button6.addKeyListener(this);
        button7.addKeyListener(this);
        button8.addKeyListener(this);
        button9.addKeyListener(this);
        button10.addKeyListener(this);
        button11.addKeyListener(this);
        button12.addKeyListener(this);
        button13.addKeyListener(this);
        button14.addKeyListener(this);
        button15.addKeyListener(this);
        button16.addKeyListener(this);
        defaultButton1.addKeyListener(this);
        defaultButton2.addKeyListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1) { SoundFiles.defaultFile(temp, 1); }
        else if(e.getSource() == button2) { SoundFiles.defaultFile(temp, 2); }
        else if(e.getSource() == button3) { SoundFiles.defaultFile(temp, 3); }
        else if(e.getSource() == button4) { SoundFiles.defaultFile(temp, 4); }
        else if(e.getSource() == button5) { SoundFiles.defaultFile(temp, 5); }
        else if(e.getSource() == button6) { SoundFiles.defaultFile(temp, 6); }
        else if(e.getSource() == button7) { SoundFiles.defaultFile(temp, 7); }
        else if(e.getSource() == button8) { SoundFiles.defaultFile(temp, 8); }
        else if(e.getSource() == button9) { SoundFiles.defaultFile(temp, 9); }
        else if(e.getSource() == button10) { SoundFiles.defaultFile(temp, 10); }
        else if(e.getSource() == button11) { SoundFiles.defaultFile(temp, 11); }
        else if(e.getSource() == button12) { SoundFiles.defaultFile(temp, 12); }
        else if(e.getSource() == button13) { SoundFiles.defaultFile(temp, 13); }
        else if(e.getSource() == button14) { SoundFiles.defaultFile(temp, 14); }
        else if(e.getSource() == button15) { SoundFiles.defaultFile(temp, 15); }
        else if(e.getSource() == button16) { SoundFiles.defaultFile(temp, 16); }
        else if(e.getSource() == defaultButton1) { temp = 0; }
        else if(e.getSource() == defaultButton2) { temp = 1; }
        else if(e.getSource() == userButton) { temp = 3; }
        else if(e.getSource() == slider1) {  }
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_1) { SoundFiles.defaultFile(temp, 1); }
        else if(e.getKeyCode() == KeyEvent.VK_2) { SoundFiles.defaultFile(temp, 2); }
        else if(e.getKeyCode() == KeyEvent.VK_3) { SoundFiles.defaultFile(temp, 3); }
        else if(e.getKeyCode() == KeyEvent.VK_4) { SoundFiles.defaultFile(temp, 4); }
        else if(e.getKeyCode() == KeyEvent.VK_Q) { SoundFiles.defaultFile(temp, 5); }
        else if(e.getKeyCode() == KeyEvent.VK_W) { SoundFiles.defaultFile(temp, 6); }
        else if(e.getKeyCode() == KeyEvent.VK_E) { SoundFiles.defaultFile(temp, 7); }
        else if(e.getKeyCode() == KeyEvent.VK_R) { SoundFiles.defaultFile(temp, 8); }
        else if(e.getKeyCode() == KeyEvent.VK_A) { SoundFiles.defaultFile(temp, 9); }
        else if(e.getKeyCode() == KeyEvent.VK_S) { SoundFiles.defaultFile(temp, 10); }
        else if(e.getKeyCode() == KeyEvent.VK_D) { SoundFiles.defaultFile(temp, 11); }
        else if(e.getKeyCode() == KeyEvent.VK_F) { SoundFiles.defaultFile(temp, 12); }
        else if(e.getKeyCode() == KeyEvent.VK_Z) { SoundFiles.defaultFile(temp, 13); }
        else if(e.getKeyCode() == KeyEvent.VK_X) { SoundFiles.defaultFile(temp, 14); }
        else if(e.getKeyCode() == KeyEvent.VK_C) { SoundFiles.defaultFile(temp, 15); }
        else if(e.getKeyCode() == KeyEvent.VK_V) { SoundFiles.defaultFile(temp, 16); }
        else if(e.getKeyCode() == KeyEvent.VK_O) { temp = 0; }
        else if(e.getKeyCode() == KeyEvent.VK_P) { temp = 1; }
    }

    public void keyReleased(KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void mouseClicked(MouseEvent e)
    {

    }

    public void mousePressed(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Pad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Pad().mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Music_Box");
        frame.setResizable(false);
    }

}