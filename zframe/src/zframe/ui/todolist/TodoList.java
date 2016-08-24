package zframe.ui.todolist;

import java.util.ArrayList;
import java.util.HashMap;
import zframe.Handler;
import zframe.states.TodoState;
import zframe.utils.FileManager;

public class TodoList {
    
    private Handler handler;
    private TodoListView view;
    private int todoCount;
    private FileManager fm;
    private TodoState state;
    
    private HashMap<Integer, Todo> todoMap;

    public TodoList(Handler handler, TodoState state) {
        this.handler = handler;
        this.state = state;
        initComponents();
        initView();
    }
    
    private void initComponents() {
        todoMap = new HashMap<>();
        view = new TodoListView(handler, this);
        fm = new FileManager(handler, this);
    }
    
    private void initView() {
        fm.readMapFromFile("data/todo/todomap.tdm", ";", todoMap);
        todoCount = getCurrentCount();
        
        for (Todo t : todoMap.values()) {
            t.initView();
            view.getpTodoList().add(t.getView());
        }
    }
    
    private int getCurrentCount() {
        todoCount = 0;
        for (Todo t : todoMap.values()) {
            if (t.getReference() > todoCount) {
                todoCount = t.getReference();
            }
        }
        return todoCount;
    }
    
    public void addTodo(int prio, String[] data) {
        Todo t = new Todo(handler, this, ++todoCount, prio, data[0], data[1], data[2], data[3], data[4]);
        t.initView();
        todoMap.put(todoCount, t);
        view.getpTodoList().add(t.getView());
        view.getpTodoList().updateUI();
        fm.writeMapToFile("data/todo/todomap.tdm", todoMap);
        state.getMenuWest().updateCategories(getResorts());
    }
    
    public void removeTodo(Todo t) {
        todoMap.values().remove(t);
        view.getpTodoList().remove(t.getView());
        view.getpTodoList().updateUI();
        fm.writeMapToFile("data/todo/todomap.tdm", todoMap);
        state.getMenuWest().updateCategories(getResorts());
    }
    
    private String[] getResorts() {
        ArrayList<String> temp = new ArrayList<>();
        for (Todo t : todoMap.values()) {
            if (!temp.contains(t.getResort())) {
                temp.add(t.getResort());
            }
        }
        String[] resorts = temp.stream().toArray(String[]::new);
        return resorts;
    }

    public TodoListView getView() {
        return view;
    }

    public HashMap<Integer, Todo> getTodoMap() {
        return todoMap;
    }

    public FileManager getFm() {
        return fm;
    }
    
}
