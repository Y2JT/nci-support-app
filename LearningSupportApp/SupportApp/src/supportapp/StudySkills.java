/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  StudySkills.java
 *  18/04/2013
 * @author Joseph Tierney 12329666
 * @reference https://moodle.ncirl.ie/course/view.php?id=878/ArraysOfObjectsTriggerApplication.java
 */
public class StudySkills extends javax.swing.JFrame {

    private String feedbackText;
    private StudySkills qArray[];
    //declare count variable to keep track of how many objects are in array
    private int count;

    /**
     * Creates new form StudySkills
     */
    public StudySkills() {
        initComponents();
        feedbackText = new String();
       StudySkills[] a = new StudySkills[0];
        //initialise count to 0
        StudySkills a1;
        StudySkills a2;
        StudySkills a3;
        StudySkills a4;
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
        feedbackTf = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        homeJButton = new javax.swing.JButton();
        StudySkillsGUI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackTf.setBounds(10, 380, 300, 30);
        jLayeredPane1.add(feedbackTf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        submitJButton.setBounds(110, 420, 100, 30);
        jLayeredPane1.add(submitJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homeJButton.setText("Home");
        homeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJButtonActionPerformed(evt);
            }
        });
        homeJButton.setBounds(133, 73, 90, 30);
        jLayeredPane1.add(homeJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        StudySkillsGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Study Skills.jpg"))); // NOI18N
        StudySkillsGUI.setBounds(0, 0, 320, 490);
        jLayeredPane1.add(StudySkillsGUI, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // Get text from TextFields
        feedbackText = feedbackTf.getText();
        
        //create a new Question object
        
        
        //add contents of textfields to q
        
        
        //add q to array of Question objects
        
        //increase count to show that another object has been added to the array
        
        dispose();
        StudySkills DGUI = new StudySkills();
        DGUI.setVisible(true);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void homeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJButtonActionPerformed
        dispose();
        HomeScreen DGUI = new HomeScreen();
        DGUI.setVisible(true);
    }//GEN-LAST:event_homeJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudySkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudySkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudySkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudySkills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StudySkills().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudySkillsGUI;
    private javax.swing.JTextField feedbackTf;
    private javax.swing.JButton homeJButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables

    private void setFeedbackText(String feedbackText) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
