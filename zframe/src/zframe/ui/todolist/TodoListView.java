package zframe.ui.todolist;

import javax.swing.JLabel;
import javax.swing.JPanel;
import zframe.Handler;

public class TodoListView extends javax.swing.JPanel {

    private Handler handler;
    private TodoList list;

    public TodoListView() {
        initComponents();
    }

    public TodoListView(Handler handler, TodoList list) {
        this.handler = handler;
        this.list = list;
        initComponents();
        pNewTodo.addMouseListener(new NewTodoMouseListener(handler, this));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pNewTodo = new javax.swing.JPanel();
        lName = new javax.swing.JLabel();
        scroller = new javax.swing.JScrollPane();
        pTodoList = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        pNewTodo.setBackground(new java.awt.Color(255, 255, 255));
        pNewTodo.setMaximumSize(new java.awt.Dimension(32767, 50));
        pNewTodo.setMinimumSize(new java.awt.Dimension(0, 50));
        pNewTodo.setPreferredSize(new java.awt.Dimension(400, 50));
        pNewTodo.setLayout(new java.awt.CardLayout());

        lName.setBackground(new java.awt.Color(255, 255, 255));
        lName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lName.setText("ADD NEW TO DO (+)");
        pNewTodo.add(lName, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(pNewTodo, gridBagConstraints);

        scroller.setBorder(null);

        pTodoList.setBackground(new java.awt.Color(255, 255, 255));
        pTodoList.setLayout(new javax.swing.BoxLayout(pTodoList, javax.swing.BoxLayout.PAGE_AXIS));
        scroller.setViewportView(pTodoList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(scroller, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lName;
    private javax.swing.JPanel pNewTodo;
    private javax.swing.JPanel pTodoList;
    private javax.swing.JScrollPane scroller;
    // End of variables declaration//GEN-END:variables

    public JLabel getlName() {
        return lName;
    }

    public JPanel getpNewTodo() {
        return pNewTodo;
    }

    public JPanel getpTodoList() {
        return pTodoList;
    }

    public TodoList getList() {
        return list;
    }

}
