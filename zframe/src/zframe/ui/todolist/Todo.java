package zframe.ui.todolist;

import zframe.Handler;

public class Todo {
    
    private Handler handler;
    private int reference, prio;
    private String resort, task, start, end, description;
    private TodoView view;
    private TodoList list;

    public Todo(Handler handler, TodoList list, int reference, int prio, String resort, String task, String start, String end, String description) {
        this.handler = handler;
        this.list = list;
        this.reference = reference;
        this.prio = prio;
        this.resort = resort;
        this.task = task;
        this.start = start;
        this.end = end;
        this.description = description;
    }
    
    public void initView() {
        view = new TodoView(handler, this);
        view.addMouseListener(new TodoMouseListener(handler, this));
        
        view.getlReference().setText(String.valueOf(reference));
        view.getlPrio().setText(String.valueOf(prio));
        view.getlResort().setText(resort);
        view.getlTask().setText(task);
        view.getlStart().setText(start);
        view.getlEnd().setText(end);
        view.getTaDesc().setText(description);
    }
    
    public void updateDesciption(String text) {
        description = text;
    }

    public TodoView getView() {
        return view;
    }

    public int getReference() {
        return reference;
    }

    public int getPrio() {
        return prio;
    }

    public String getResort() {
        return resort;
    }

    public String getTask() {
        return task;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public TodoList getList() {
        return list;
    }

    public String getDescription() {
        return description;
    }
    
}
