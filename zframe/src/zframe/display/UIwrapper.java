package zframe.display;

import zframe.Handler;

public class UIwrapper extends javax.swing.JPanel {

    private Handler handler;

    public UIwrapper() {
        initComponents();
    }

    public UIwrapper(Handler handler) {
        this.handler = handler;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        North = new javax.swing.JPanel();
        South = new javax.swing.JPanel();
        West = new javax.swing.JPanel();
        East = new javax.swing.JPanel();
        Center = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        North.setBackground(new java.awt.Color(255, 255, 255));
        North.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        North.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        North.setMinimumSize(new java.awt.Dimension(4, 80));
        North.setPreferredSize(new java.awt.Dimension(400, 80));
        North.setLayout(new java.awt.CardLayout());
        add(North, java.awt.BorderLayout.PAGE_START);

        South.setBackground(new java.awt.Color(255, 255, 255));
        South.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        South.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        South.setMinimumSize(new java.awt.Dimension(4, 80));
        South.setPreferredSize(new java.awt.Dimension(400, 80));
        South.setLayout(new java.awt.CardLayout());
        add(South, java.awt.BorderLayout.PAGE_END);

        West.setBackground(new java.awt.Color(255, 255, 255));
        West.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        West.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        West.setMinimumSize(new java.awt.Dimension(300, 4));
        West.setPreferredSize(new java.awt.Dimension(300, 100));
        West.setLayout(new java.awt.CardLayout());
        add(West, java.awt.BorderLayout.LINE_START);

        East.setBackground(new java.awt.Color(255, 255, 255));
        East.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        East.setMaximumSize(new java.awt.Dimension(300, 2147483647));
        East.setMinimumSize(new java.awt.Dimension(300, 4));
        East.setPreferredSize(new java.awt.Dimension(300, 100));
        East.setLayout(new java.awt.CardLayout());
        add(East, java.awt.BorderLayout.LINE_END);

        Center.setBackground(new java.awt.Color(255, 255, 255));
        Center.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Center.setLayout(new java.awt.CardLayout());
        add(Center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Center;
    private javax.swing.JPanel East;
    private javax.swing.JPanel North;
    private javax.swing.JPanel South;
    private javax.swing.JPanel West;
    // End of variables declaration//GEN-END:variables

}
