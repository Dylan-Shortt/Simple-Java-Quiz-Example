/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_2_Online_Quiz_System;

/**
 *
 * @author dylan
 */
public class quizSelectionWindow extends javax.swing.JFrame {

    /**
     * Creates new form adminWindow
     */
    public quizSelectionWindow() {
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
        btnStartQuiz = new javax.swing.JButton();
        cmbQuizSelection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("admin Navigation Window");

        lblTitile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitile.setText("Navigation window, please select your desired quiz");

        btnStartQuiz.setText("Start Quiz");
        btnStartQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartQuizActionPerformed(evt);
            }
        });

        cmbQuizSelection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbQuizSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quiz 1", "Quiz 2", "Quiz 3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbQuizSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStartQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStartQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(cmbQuizSelection))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartQuizActionPerformed
        // TODO add your handling code here:
        
        //*************************************************//
        //determine which quiz was selected and begin the quiz operation.
        int quiz_number = cmbQuizSelection.getSelectedIndex();
        //*************************************************//
        
        //*************************************************//
        //create mainClass instance 
        mainClass instance = new mainClass();
        //*************************************************//
        
        //*************************************************//
        //run the selected quiz
        switch (quiz_number)
        {
            case 0:
                //*************************************************//
                //quiz 1
                instance.runFirstQuiz();
                //*************************************************//
                break;
            case 1:
                //*************************************************//
                //quiz 2
                instance.runSecondQuiz();
                //*************************************************//
                break;
            case 2:
                //*************************************************//
                //quiz 3
                instance.runThirdQuiz();
                //*************************************************//
                break;
        }
        //*************************************************//
    }//GEN-LAST:event_btnStartQuizActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartQuiz;
    private javax.swing.JComboBox<String> cmbQuizSelection;
    private javax.swing.JLabel lblTitile;
    // End of variables declaration//GEN-END:variables
}