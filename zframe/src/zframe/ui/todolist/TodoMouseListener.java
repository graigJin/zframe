package zframe.ui.todolist;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import zframe.Handler;

public class TodoMouseListener implements MouseListener {
    
    private Handler handler;
    private Todo todo;

    public TodoMouseListener(Handler handler, Todo todo) {
        this.handler = handler;
        this.todo = todo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //todo.getList().removeTodo(todo);
        todo.getView().toggleSize();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // IGNORE
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // IGNORE
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        todo.getView().setBackground(new Color(204,204,255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        todo.getView().setBackground(new Color(255,255,255));
    }

}
