package zframe;

import zframe.display.Display;

public class MainApp {
    
    private String title;
    private int width, height;
    
    private Handler handler;
    private Display display;

    public MainApp(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    public void init() {
        initComponents();
        initDisplay();
    }
    
    private void initComponents() {
        handler = new Handler(this);
        display = new Display(handler, title, width, height);
    }
    
    private void initDisplay() {
        display.init();
    }

}
