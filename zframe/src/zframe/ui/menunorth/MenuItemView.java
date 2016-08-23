package zframe.ui.menunorth;

import javax.swing.JLabel;
import zframe.Handler;

public class MenuItemView extends javax.swing.JPanel {

    private Handler handler;

    public MenuItemView() {
        initComponents();
    }

    public MenuItemView(Handler handler) {
        this.handler = handler;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(160, 80));
        setMinimumSize(new java.awt.Dimension(160, 80));
        setPreferredSize(new java.awt.Dimension(160, 80));
        setLayout(new java.awt.CardLayout());

        lName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lName.setText("jLabel1");
        add(lName, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lName;
    // End of variables declaration//GEN-END:variables

    public JLabel getlName() {
        return lName;
    }

}
