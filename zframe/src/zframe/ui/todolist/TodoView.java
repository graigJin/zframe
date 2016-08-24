package zframe.ui.todolist;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import zframe.Handler;

public class TodoView extends javax.swing.JPanel {

    private Handler handler;
    private Todo todo;
    private boolean extended = false;

    public TodoView() {
        initComponents();
    }

    public TodoView(Handler handler, Todo todo) {
        this.handler = handler;
        this.todo = todo;
        initComponents();
        
        lDesc.setVisible(false);
        scroller.setVisible(false);
        bDone.setVisible(false);
        bCancel.setVisible(false);
        fDesc.setVisible(false);
        
    }
    
    public void toggleSize() {
        if (extended) {
            minimize();
        } else {
            maximize();
        }
    }
    
    private void minimize() {
        
        extended = false;
        
        setMinimumSize(new Dimension(getWidth(), 50));
        setMaximumSize(new Dimension(getWidth(), 50));
        setPreferredSize(new Dimension(getWidth(), 50));
        
        lDesc.setVisible(false);
        scroller.setVisible(false);
        bDone.setVisible(false);
        bCancel.setVisible(false);
        fDesc.setVisible(false);
        
        updateUI();
    }
    
    private void maximize() {
        
        extended = true;
        
        setMinimumSize(new Dimension(getWidth(), 400));
        setMaximumSize(new Dimension(getWidth(), 400));
        setPreferredSize(new Dimension(getWidth(), 400));
        
        lDesc.setVisible(true);
        scroller.setVisible(true);
        bDone.setVisible(true);
        bCancel.setVisible(true);
        fDesc.setVisible(true);
        
        updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lReference = new javax.swing.JLabel();
        lPrio = new javax.swing.JLabel();
        lResort = new javax.swing.JLabel();
        lTask = new javax.swing.JLabel();
        lStart = new javax.swing.JLabel();
        lEnd = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 0), new java.awt.Dimension(80, 0), new java.awt.Dimension(80, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(80, 0), new java.awt.Dimension(80, 0), new java.awt.Dimension(80, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(160, 0), new java.awt.Dimension(160, 0), new java.awt.Dimension(160, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));
        fDesc = new javax.swing.Box.Filler(new java.awt.Dimension(0, 350), new java.awt.Dimension(0, 350), new java.awt.Dimension(32767, 350));
        lDesc = new javax.swing.JLabel();
        scroller = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        bDone = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 50));
        setMinimumSize(new java.awt.Dimension(604, 50));
        setPreferredSize(new java.awt.Dimension(400, 50));
        setLayout(new java.awt.GridBagLayout());

        lReference.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lReference, gridBagConstraints);

        lPrio.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lPrio, gridBagConstraints);

        lResort.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lResort, gridBagConstraints);

        lTask.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lTask, gridBagConstraints);

        lStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lStart.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lStart, gridBagConstraints);

        lEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEnd.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lEnd, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        add(filler5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(filler6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        add(fDesc, gridBagConstraints);

        lDesc.setText("Beschreibung:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lDesc, gridBagConstraints);

        taDesc.setColumns(20);
        taDesc.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        taDesc.setRows(5);
        taDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taDescKeyReleased(evt);
            }
        });
        scroller.setViewportView(taDesc);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(scroller, gridBagConstraints);

        bDone.setText("Erledigt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(bDone, gridBagConstraints);

        bCancel.setText("Löschen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(bCancel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void taDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taDescKeyReleased
        todo.updateDesciption(taDesc.getText());
    }//GEN-LAST:event_taDescKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDone;
    private javax.swing.Box.Filler fDesc;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel lDesc;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lPrio;
    private javax.swing.JLabel lReference;
    private javax.swing.JLabel lResort;
    private javax.swing.JLabel lStart;
    private javax.swing.JLabel lTask;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JTextArea taDesc;
    // End of variables declaration//GEN-END:variables

    public JLabel getlEnd() {
        return lEnd;
    }

    public JLabel getlPrio() {
        return lPrio;
    }

    public JLabel getlReference() {
        return lReference;
    }

    public JLabel getlResort() {
        return lResort;
    }

    public JLabel getlStart() {
        return lStart;
    }

    public JLabel getlTask() {
        return lTask;
    }

    public JTextArea getTaDesc() {
        return taDesc;
    }

}
