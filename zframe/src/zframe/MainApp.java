package zframe;

import zframe.content.ContentManager;
import zframe.display.Display;

public class MainApp {
    
    private String title;
    private int width, height;
    
    private Handler handler;
    private Display display;
    private ContentManager content;

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
        content = new ContentManager(handler);
    }
    
    private void initDisplay() {
        display.init();
    }

    public Display getDisplay() {
        return display;
    }

    public ContentManager getContent() {
        return content;
    }

}
