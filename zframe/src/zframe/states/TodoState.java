package zframe.states; 

import java.util.ArrayList;
import zframe.Handler; 
import zframe.ui.menuwest.MenuWest;
import zframe.ui.todolist.Todo;
import zframe.ui.todolist.TodoList;
import zframe.ui.todolist.TodoListView;

public class TodoState extends State {
    
    private Handler handler;
    private MenuWest menuWest;
    private TodoList list;
    private ArrayList<String> categories;
    private String[] cat;

    public TodoState(Handler handler) {
        super(handler);
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        categories = new ArrayList<String>();
        list = new TodoList(handler, this);
        menuWest = new MenuWest(handler, createResorts());
    }
    
    private String[] createResorts() {
        for (Todo t : list.getTodoMap().values()) {
            if (!categories.contains(t.getResort())) {
                categories.add(t.getResort());
            }
        }
        cat = categories.stream().toArray(String[]::new);
        return cat;
    }

    @Override
    public MenuWest getMenuWest() {
        return menuWest;
    }

    @Override
    public TodoListView getContentView() {
        return list.getView();
    }

    public TodoList getList() {
        return list;
    }

} 


