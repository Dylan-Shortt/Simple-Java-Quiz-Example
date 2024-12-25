/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_2_Online_Quiz_System;

/**
 *
 * @author dylan
 */
public class adminWindow extends javax.swing.JFrame {

    /**
     * Creates new form adminWindow
     */
    public adminWindow() {
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

        lblTitile = new javax.swing.JLabel();
        btnQuizPage = new javax.swing.JButton();
        btnQuizOne = new javax.swing.JButton();
        btnQuizThree = new javax.swing.JButton();
        btnQuizTwo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("admin Navigation Window");

        lblTitile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitile.setText("Admin Navigation Window, select the appropriate action.");

        btnQuizPage.setText("Open Quiz Page");
        btnQuizPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizPageActionPerformed(evt);
            }
        });

        btnQuizOne.setText("Open Quiz One");
        btnQuizOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizOneActionPerformed(evt);
            }
        });

        btnQuizThree.setText("Open Quiz Three");
        btnQuizThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizThreeActionPerformed(evt);
            }
        });

        btnQuizTwo.setText("Open Quiz Two");
        btnQuizTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuizPage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuizOne, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuizTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuizThree, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuizPage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuizOne, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuizTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuizThree, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuizPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizPageActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //open quiz page from normal user perspective 
        quizSelectionWindow quizWindow = new quizSelectionWindow();
        quizWindow.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnQuizPageActionPerformed

//**************************************************************************************//
    //create main class instance
    mainClass instance = new mainClass();
//**************************************************************************************//
    
    private void btnQuizOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizOneActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //run first quiz from admin view
        QuizOneAdmin firstQuiz = new QuizOneAdmin();
        firstQuiz.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnQuizOneActionPerformed

    private void btnQuizTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizTwoActionPerformed
        // TODO add your handling code here:
        //*************************************************//
        //run second quiz from admin view
        QuizTwoAdmin secondQuiz = new QuizTwoAdmin();
        secondQuiz.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnQuizTwoActionPerformed

    private void btnQuizThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizThreeActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //run second quiz from admin view
        QuizThreeAdmin thirdQuiz = new QuizThreeAdmin();
        thirdQuiz.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnQuizThreeActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuizOne;
    private javax.swing.JButton btnQuizPage;
    private javax.swing.JButton btnQuizThree;
    private javax.swing.JButton btnQuizTwo;
    private javax.swing.JLabel lblTitile;
    // End of variables declaration//GEN-END:variables
}
