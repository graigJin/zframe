package zframe.ui.menusouth;

import javax.swing.JPanel;
import zframe.Handler;

public class MenuSouthView extends javax.swing.JPanel {

    private Handler handler;

    public MenuSouthView() {
        initComponents();
    }

    public MenuSouthView(Handler handler) {
        this.handler = handler;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Left = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Right = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        Left.setMaximumSize(new java.awt.Dimension(298, 32767));
        Left.setMinimumSize(new java.awt.Dimension(298, 0));
        Left.setPreferredSize(new java.awt.Dimension(298, 0));
        Left.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(Left, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(filler1, gridBagConstraints);

        Right.setMaximumSize(new java.awt.Dimension(298, 32767));
        Right.setMinimumSize(new java.awt.Dimension(298, 0));
        Right.setPreferredSize(new java.awt.Dimension(298, 0));
        Right.setLayout(new java.awt.CardLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(Right, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.Box.Filler filler1;
    // End of variables declaration//GEN-END:variables

    public JPanel getLeft() {
        return Left;
    }

    public JPanel getRight() {
        return Right;
    }

}
