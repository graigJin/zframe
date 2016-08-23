package zframe.ui.logger;

import java.awt.Dimension;
import javax.swing.JTextArea;
import zframe.Handler;

public class LoggerView extends javax.swing.JPanel {

    private Handler handler;

    public LoggerView() {
        initComponents();
    }

    public LoggerView(Handler handler) {
        this.handler = handler;
        initComponents();
        scroller.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        scroller.getVerticalScrollBar().setUnitIncrement(8);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroller = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setLayout(new java.awt.CardLayout());

        scroller.setBorder(null);

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        textArea.setRows(5);
        textArea.setEnabled(false);
        scroller.setViewportView(textArea);

        add(scroller, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scroller;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    public JTextArea getTextArea() {
        return textArea;
    }

}
