package zframe;

import java.awt.EventQueue;

public class Launcher {
    
    public static void main (String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainApp("ZFRAME", 1200, 800).init();
            }
        });
        
    }

}
