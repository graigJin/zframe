package zframe.ui.menunorth;

import javax.swing.JPanel;
import zframe.Handler;

public class MenuNorthView extends javax.swing.JPanel {

    private Handler handler;

    public MenuNorthView() {
        initComponents();
    }

    public MenuNorthView(Handler handler) {
        this.handler = handler;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroller = new javax.swing.JScrollPane();
        Content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        scroller.setBorder(null);
        scroller.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Content.setBackground(new java.awt.Color(255, 255, 255));
        Content.setLayout(new javax.swing.BoxLayout(Content, javax.swing.BoxLayout.LINE_AXIS));
        scroller.setViewportView(Content);

        add(scroller, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JScrollPane scroller;
    // End of variables declaration//GEN-END:variables

    public JPanel getContent() {
        return Content;
    }

}
