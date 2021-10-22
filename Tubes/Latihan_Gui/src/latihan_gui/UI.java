package latihan_gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class UI {
    
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    
    
    public UI(GameManager gm){
        this.gm = gm;
        createMainField();
        createBackGround();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        
        
        messageText = new JTextArea("Hello World!");
        messageText.setBounds(50, 410, 700, 120);
        messageText.setBackground(Color.white);
        messageText.setForeground(Color.black);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antique", Font.PLAIN, 26));
        window.add(messageText);
        
        
    }
    
    public void createBackGround(){
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(50, 50, 640, 427);
        bgPanel[1].setBackground(Color.yellow);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);
        
        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0, 0, 700, 350);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("source/forest-5903010_640.jpg"));
        bgLabel[1].setIcon(bgIcon);
        
        
        bgPanel[1].add(bgLabel[1]);
        
        
    }
    
}
