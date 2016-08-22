package zframe.ui.logger;

import zframe.Handler;

public class Logger {
    
    private Handler handler;
    private LoggerView view;

    public Logger(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        view = new LoggerView(handler);
    }

    public LoggerView getView() {
        return view;
    }

}
