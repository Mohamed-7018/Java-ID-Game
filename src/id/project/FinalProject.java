/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.project;

import java.awt.Toolkit;

/**
 *
 * @author Mostafa
 */
public class FinalProject extends javax.swing.JFrame {

    /**
     * Creates new form FinalProject
     */
    public FinalProject() {
        initComponents();
        iconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Stopwatch = new javax.swing.JButton();
        calculateDates = new javax.swing.JButton();
        atThatDay = new javax.swing.JButton();
        id = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("pixels project");
        setBackground(new java.awt.Color(0, 0, 153));
        setForeground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(850, 584));
        setPreferredSize(new java.awt.Dimension(840, 560));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id/project/icon2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 358);

        Stopwatch.setBackground(new java.awt.Color(0, 0, 102));
        Stopwatch.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Stopwatch.setForeground(new java.awt.Color(255, 255, 255));
        Stopwatch.setText("StopWatch");
        Stopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopwatchActionPerformed(evt);
            }
        });
        getContentPane().add(Stopwatch);
        Stopwatch.setBounds(430, 364, 400, 84);

        calculateDates.setBackground(new java.awt.Color(0, 0, 102));
        calculateDates.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        calculateDates.setForeground(new java.awt.Color(255, 255, 255));
        calculateDates.setText("Calculate dates");
        calculateDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateDatesActionPerformed(evt);
            }
        });
        getContentPane().add(calculateDates);
        calculateDates.setBounds(0, 454, 424, 92);

        atThatDay.setBackground(new java.awt.Color(0, 0, 102));
        atThatDay.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        atThatDay.setForeground(new java.awt.Color(255, 255, 255));
        atThatDay.setText("At that day");
        atThatDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atThatDayActionPerformed(evt);
            }
        });
        getContentPane().add(atThatDay);
        atThatDay.setBounds(430, 454, 400, 92);

        id.setBackground(new java.awt.Color(0, 0, 102));
        id.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID program");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(0, 364, 424, 84);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
   ID a = new ID();
     a.setVisible(true);
    }//GEN-LAST:event_idActionPerformed

    private void calculateDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateDatesActionPerformed
        calculateDates b = new calculateDates();
        b.setVisible(true);
    }//GEN-LAST:event_calculateDatesActionPerformed

    private void StopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopwatchActionPerformed
       stopWatch d = new stopWatch();
        d.setVisible(true);
    }//GEN-LAST:event_StopwatchActionPerformed

    private void atThatDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atThatDayActionPerformed
    atThatDay c = new atThatDay();
        c.setVisible(true);
    }//GEN-LAST:event_atThatDayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Stopwatch;
    private javax.swing.JButton atThatDay;
    private javax.swing.JButton calculateDates;
    private javax.swing.JButton id;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void iconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpg")));
    }
}
