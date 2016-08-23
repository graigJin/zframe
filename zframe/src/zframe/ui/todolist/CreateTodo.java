package zframe.ui.todolist;

import java.awt.Dimension;
import javax.swing.JFrame;
import zframe.Handler;

public class CreateTodo {
    
    private Handler handler;
    private TodoList list;
    
    private String title;
    private int width, height;
    private JFrame frame;
    private CreateToDoView view;
    
    public CreateTodo(Handler handler, String title, int width, int height, TodoList list) {
        this.handler = handler;
        this.title = title;
        this.width = width;
        this.height = height;
        this.list = list;
        initComponents();
    }
    
    public void init() {
        createDisplay();
        populateDisplay();
    }
    
    private void initComponents() {
        frame = new JFrame(title);
        view = new CreateToDoView(handler, frame, list);
    }
    
    private void createDisplay() {
        frame.setSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void populateDisplay() {
        frame.add(view);
    }

}
