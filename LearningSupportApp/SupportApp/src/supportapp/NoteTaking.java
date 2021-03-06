/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  NoteTaking.java
 *  18/04/2013
 * @author Joseph Tierney 12329666
 * @reference https://moodle.ncirl.ie/course/view.php?id=878/ArraysOfObjectsTriggerApplication.java
 */

public class NoteTaking extends javax.swing.JFrame {

    private String feedbackText;
    private NoteTaking qArray[];
    //declare count variable to keep track of how many objects are in array
    private int count;

    /**
     * Creates new form NoteTaking
     */
    public NoteTaking() {
        initComponents();
        feedbackText = new String();
       NoteTaking[] a = new NoteTaking[0];
        //initialise count to 0
        NoteTaking a1;
        NoteTaking a2;
        NoteTaking a3;
        NoteTaking a4;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        homeJButton = new javax.swing.JButton();
        feedbackTf = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        NoteTakingGUI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeJButton.setText("Home");
        homeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJButtonActionPerformed(evt);
            }
        });
        homeJButton.setBounds(130, 80, 90, 30);
        jLayeredPane1.add(homeJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        feedbackTf.setBounds(10, 390, 300, 30);
        jLayeredPane1.add(feedbackTf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        submitJButton.setBounds(110, 430, 90, 30);
        jLayeredPane1.add(submitJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NoteTakingGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Note Taking.jpg"))); // NOI18N
        NoteTakingGUI.setBounds(0, 0, 320, 490);
        jLayeredPane1.add(NoteTakingGUI, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJButtonActionPerformed
        dispose();
        HomeScreen DGUI = new HomeScreen();
        DGUI.setVisible(true);
    }//GEN-LAST:event_homeJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
       // Get text from TextFields
        feedbackText = feedbackTf.getText();
        
        //create a new Question object
        
        
        //add contents of textfields to q
        
        
        //add q to array of Question objects
        
        //increase count to show that another object has been added to the array
        
        dispose();
        NoteTaking DGUI = new NoteTaking();
        DGUI.setVisible(true);
    }//GEN-LAST:event_submitJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NoteTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoteTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoteTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoteTaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NoteTaking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoteTakingGUI;
    private javax.swing.JTextField feedbackTf;
    private javax.swing.JButton homeJButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables

    private void setFeedbackText(String feedbackText) {
    }
}
