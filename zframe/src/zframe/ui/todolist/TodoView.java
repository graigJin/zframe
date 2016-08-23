package zframe.ui.todolist;

import javax.swing.JLabel;
import zframe.Handler;

public class TodoView extends javax.swing.JPanel {

    private Handler handler;

    public TodoView() {
        initComponents();
    }

    public TodoView(Handler handler) {
        this.handler = handler;
        initComponents();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 50));
        setMinimumSize(new java.awt.Dimension(604, 50));
        setPreferredSize(new java.awt.Dimension(400, 50));
        setLayout(new java.awt.GridBagLayout());

        lReference.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lReference, gridBagConstraints);

        lPrio.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lPrio, gridBagConstraints);

        lResort.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lResort, gridBagConstraints);

        lTask.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lTask, gridBagConstraints);

        lStart.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lStart, gridBagConstraints);

        lEnd.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(lEnd, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(filler5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lPrio;
    private javax.swing.JLabel lReference;
    private javax.swing.JLabel lResort;
    private javax.swing.JLabel lStart;
    private javax.swing.JLabel lTask;
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

}
