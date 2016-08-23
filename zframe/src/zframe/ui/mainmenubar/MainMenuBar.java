package zframe.ui.mainmenubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import zframe.Handler;

public class MainMenuBar extends JMenuBar {
    
    private Handler handler;
    
    private JMenu mDatei;
    private JMenuItem miBeenden;

    public MainMenuBar(Handler handler) {
        this.handler = handler;
        initComponents();
        arrangeComponents();
    }
    
    private void initComponents() {
        mDatei = new JMenu("Datei");
        
        miBeenden = new JMenuItem("Beenden");
        miBeenden.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    
    private void arrangeComponents() {
        mDatei.add(miBeenden);
        
        add(mDatei);
    }

}
