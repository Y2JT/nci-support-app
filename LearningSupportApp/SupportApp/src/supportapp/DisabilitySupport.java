/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  DisabilitySupport.java
 *  18/04/2013
 * @author Joseph Tierney 12329666
 *
 */

public class DisabilitySupport extends javax.swing.JFrame {

    /**
     * Creates new form DisabilitySupport
     */
    public DisabilitySupport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisabilitySupportGUI = new javax.swing.JLayeredPane();
        workshopJButton = new javax.swing.JButton();
        DisabilityGUI = new javax.swing.JLabel();
        homeJButton = new javax.swing.JButton();
        mathsJButton = new javax.swing.JButton();
        computingJButton = new javax.swing.JButton();
        learningJButton = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        workshopJButton.setText("Workshop");
        workshopJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workshopJButtonActionPerformed(evt);
            }
        });
        workshopJButton.setBounds(130, 70, 100, 30);
        DisabilitySupportGUI.add(workshopJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        DisabilityGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Disability-Support-Home.jpg"))); // NOI18N
        DisabilityGUI.setBounds(0, 0, 330, 480);
        DisabilitySupportGUI.add(DisabilityGUI, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homeJButton.setText("Home");
        homeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJButtonActionPerformed(evt);
            }
        });
        homeJButton.setBounds(30, 380, 59, 23);
        DisabilitySupportGUI.add(homeJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mathsJButton.setText("Maths");
        mathsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsJButtonActionPerformed(evt);
            }
        });
        mathsJButton.setBounds(213, 380, 80, 23);
        DisabilitySupportGUI.add(mathsJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        computingJButton.setText("Compute");
        computingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computingJButtonActionPerformed(evt);
            }
        });
        computingJButton.setBounds(23, 420, 80, 30);
        DisabilitySupportGUI.add(computingJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        learningJButton.setText("Learning");
        learningJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learningJButtonActionPerformed(evt);
            }
        });
        learningJButton.setBounds(213, 420, 80, 30);
        DisabilitySupportGUI.add(learningJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jInternalFrame1.setBounds(180, 220, 22, 61);
        DisabilitySupportGUI.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisabilitySupportGUI, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisabilitySupportGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJButtonActionPerformed
        dispose();
        HomeScreen DGUI = new HomeScreen();
        DGUI.setVisible(true);
    }//GEN-LAST:event_homeJButtonActionPerformed

    private void mathsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsJButtonActionPerformed
        dispose();
        MathsSupport DGUI = new MathsSupport();
        DGUI.setVisible(true);
    }//GEN-LAST:event_mathsJButtonActionPerformed

    private void computingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computingJButtonActionPerformed
        dispose();
        ComputingSupport DGUI = new ComputingSupport();
        DGUI.setVisible(true);
    }//GEN-LAST:event_computingJButtonActionPerformed

    private void learningJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learningJButtonActionPerformed
        dispose();
        LearningSupport DGUI = new LearningSupport();
        DGUI.setVisible(true);
    }//GEN-LAST:event_learningJButtonActionPerformed

    private void workshopJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workshopJButtonActionPerformed
        dispose();
        DisabilityWorkshop DGUI = new DisabilityWorkshop();
        DGUI.setVisible(true);
    }//GEN-LAST:event_workshopJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisabilitySupport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DisabilitySupport().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisabilityGUI;
    private javax.swing.JLayeredPane DisabilitySupportGUI;
    private javax.swing.JButton computingJButton;
    private javax.swing.JButton homeJButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton learningJButton;
    private javax.swing.JButton mathsJButton;
    private javax.swing.JButton workshopJButton;
    // End of variables declaration//GEN-END:variables
}
