package zframe;

import zframe.content.ContentManager;

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

}
