package zframe;

public class MainApp {
    
    private String title;
    private int width, height;
    
    private Handler handler;

    public MainApp(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    public void init() {
        initComponents();
    }
    
    private void initComponents() {
        handler = new Handler(this);
    }

}
