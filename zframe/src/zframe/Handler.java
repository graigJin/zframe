package zframe;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import zframe.content.ContentManager;
import zframe.display.Display;

public class Handler {
    
    private MainApp main;

    public Handler(MainApp main) {
        this.main = main;
    }

    public MainApp getMain() {
        return main;
    }
    
    public ContentManager getContent() {
        return main.getContent();
    }
    
    public Display getDisplay() {
        return main.getDisplay();
    }
    
    public void addLog(String text) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        getContent().getLogger().getView().getTextArea().append(sdf.format(cal.getTime()) + ": " + text +"\n");
    }

}
