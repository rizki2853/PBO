package latihan_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

class UI {
    
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];
    
    
    public UI(GameManager gm){
        this.gm = gm;
        createMainField();
        
        generateScreeen();
        
        window.setVisible(true);
    }
    
    public void createMainField(){
        
        window = new JFrame();
        window.setSize(800,700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        
        
        messageText = new JTextArea("Hello World!");
        messageText.setBounds(70, 480, 640, 120);
        messageText.setBackground(Color.white);
        messageText.setForeground(Color.black);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antique", Font.PLAIN, 26));
        window.add(messageText);
        
        
    }
    
    public void createBackGround(int Xbg, int Ybg, int bgwide, int bghigh, String bgImage, int Xlabel, int Ylabel, int labelwide, int labelhigh){
        bgPanel[1] = new JPanel();
        //bgPanel[1].setBounds(70, 50, 640, 427);
        bgPanel[1].setBounds(Xbg, Ybg, bgwide, bghigh);
        bgPanel[1].setBackground(Color.yellow);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);
        
        bgLabel[1] = new JLabel();
        //bgLabel[1].setBounds(0, 0,  640, 427);
        bgLabel[1].setBounds(Xlabel, Ylabel,  labelwide, labelhigh);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgImage));
        bgLabel[1].setIcon(bgIcon);

    }
    
    public void createObject(int X, int Y, int objectWide, int objectHigh, String objectImage, String action1, String action2, String action3){
        
        JPopupMenu popMenu = new JPopupMenu();
        
        JMenuItem menuItem[] = new JMenuItem[3];
        
        menuItem[1] = new JMenuItem(action1);
        popMenu.add(menuItem[1]);
        
        menuItem[1] = new JMenuItem(action2);
        popMenu.add(menuItem[1]);
        
        menuItem[1] = new JMenuItem(action3);
        popMenu.add(menuItem[1]);
        
        JLabel objectLabel = new JLabel();
        //objectLabel.setBounds(450, 250, 128, 128);
        objectLabel.setBounds(X, Y, objectWide, objectHigh);
        
        ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objectImage));
        objectLabel.setIcon(objectIcon);
        
        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
                if(SwingUtilities.isRightMouseButton(me)){
                    popMenu.show(objectLabel, me.getX(), me.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
            }
        });
        
        bgPanel[1].add(objectLabel);
        bgPanel[1].add(bgLabel[1]);
    }
    
    public void generateScreeen(){
        
        createBackGround(70, 50, 640, 427, "src/forest-5903010_640.jpg", 0, 0,  640, 427);
        createObject(450, 250, 128, 128, "src/house .png", "in", "Talk", "Look");
        createObject(350, 310, 67, 67, "src/chest.png", "in", "Open", "Look");
    }
}
