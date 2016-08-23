package zframe.states; 

import zframe.Handler; 
import zframe.ui.menuwest.MenuWest;
import zframe.ui.todolist.TodoList;
import zframe.ui.todolist.TodoListView;

public class TodoState extends State {
    
    private String[] categories = { "TO DO 1" , "TO DO 2" };
    
    private Handler handler;
    private MenuWest menuWest;
    private TodoList list;

    public TodoState(Handler handler) {
        super(handler);
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        menuWest = new MenuWest(handler, categories);
        list = new TodoList(handler);
    }

    public MenuWest getMenuWest() {
        return menuWest;
    }

    public TodoListView getContentView() {
        return list.getView();
    }

    public TodoList getList() {
        return list;
    }

} 


