/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supportapp;

/*
 *  Tutorial2.java
 *  18/04/2013
 * @author Paul Cuffe 11378541
 * @reference https://moodle.ncirl.ie/course/view.php?id=878/ArraysOfObjectsTriggerApplication.java
 */

public class Tutorial2 extends javax.swing.JFrame {
    
    private String feedbackText;
    private Tutorial2 qArray[];
    //declare count variable to keep track of how many objects are in array
    private int count;
    
    public Tutorial2() {
        initComponents();
        feedbackText = new String();
       Tutorial2[] a = new Tutorial2[0];
        //initialise count to 0
        Tutorial2 a1;
        Tutorial2 a2;
        Tutorial2 a3;
        Tutorial2 a4;
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
        tutorialvideo2JLabel = new javax.swing.JLabel();
        tutorialJLabel = new javax.swing.JLabel();
        tutorial2JButton = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeJButton.setText("Home");
        homeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeJButtonActionPerformed(evt);
            }
        });
        homeJButton.setBounds(140, 70, 90, 30);
        jLayeredPane1.add(homeJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        feedbackTf.setBounds(10, 390, 300, 20);
        jLayeredPane1.add(feedbackTf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        submitJButton.setBounds(110, 420, 90, 30);
        jLayeredPane1.add(submitJButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tutorialvideo2JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Tutorial2Video.png"))); // NOI18N
        tutorialvideo2JLabel.setText("jLabel1");
        tutorialvideo2JLabel.setBounds(0, 160, 320, 160);
        jLayeredPane1.add(tutorialvideo2JLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tutorialJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supportapp/Computing Tutorial 2.jpg"))); // NOI18N
        tutorialJLabel.setBounds(0, 0, 320, 490);
        jLayeredPane1.add(tutorialJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tutorial2JButton.setText("VIDEO");
        tutorial2JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorial2JButtonActionPerformed(evt);
            }
        });
        tutorial2JButton.setBounds(0, 160, 320, 170);
        jLayeredPane1.add(tutorial2JButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jInternalFrame1.setBounds(20, 100, 22, 41);
        jLayeredPane1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeJButtonActionPerformed
        dispose();
        HomeScreen DGUI = new HomeScreen();
        DGUI.setVisible(true);
    }//GEN-LAST:event_homeJButtonActionPerformed

    private void tutorial2JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorial2JButtonActionPerformed
        try{
            String URL ="http://www.youtube.com/watch?v=0xw06loTm1k";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_tutorial2JButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // Get text from TextFields
        feedbackText = feedbackTf.getText();
        
        //create a new Question object
        
        
        //add contents of textfields to q
        
        
        //add q to array of Question objects
        
        //increase count to show that another object has been added to the array
        
        dispose();
        Tutorial2 DGUI = new Tutorial2();
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
            java.util.logging.Logger.getLogger(Tutorial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutorial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutorial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutorial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tutorial2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField feedbackTf;
    private javax.swing.JButton homeJButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton tutorial2JButton;
    private javax.swing.JLabel tutorialJLabel;
    private javax.swing.JLabel tutorialvideo2JLabel;
    // End of variables declaration//GEN-END:variables
}
