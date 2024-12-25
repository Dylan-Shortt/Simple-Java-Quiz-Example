/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//**************************************************************************************//
package Project_2_Online_Quiz_System;
//*************************************************//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author dylan
 */
//*************************************************//
public class QuizTwoAdmin extends javax.swing.JFrame {
    //*************************************************//
    /**
     * Creates new form QuizTwoAdmin
     */
    //*************************************************//
    
    //*************************************************//
    public QuizTwoAdmin() {
        initComponents();
        saveQuestionsToTextArea(txaQuestions);
        saveAnswersToTextArea(txaAnswers);
    }
    //*************************************************//
    
    //*************************************************//
    // Method to save questions to txaQuestions
    public void saveQuestionsToTextArea(JTextArea txaQuestions) 
    {
        try {
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Quiz 2.txt");
            //*************************************************//
        
            //*************************************************//
            // Pass the File object to the Scanner
            Scanner scan = new Scanner(file);
            //*************************************************//
        
            //*************************************************//
            // Read the contents of the file and append questions to txaQuestions
            while (scan.hasNextLine()) 
            {
                //*************************************************//
                String line = scan.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                //*************************************************//

                //*************************************************//
                String question = scLine.next();
                String answer_1 = scLine.next();
                String answer_2 = scLine.next();
                String answer_3 = scLine.next();
                //*************************************************//
                
                //*************************************************//
                // Append the question to txaQuestions
                txaQuestions.append(question + "\n" + answer_1 + "\n" + answer_2 + "\n" + answer_3 + "\n\n");
                //*************************************************//

                //*************************************************//
                scLine.close();
                //*************************************************//
            }
            //*************************************************//
        
            //*************************************************//
            // Close the scanner
            scan.close();
            //*************************************************//
        
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    //*************************************************//
    
    //*************************************************//
    // Method to save questions to txaQuestions
    public void saveAnswersToTextArea(JTextArea txaAnswers) 
    {
        try {
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Quiz 2 correct answers.txt");
            //*************************************************//
        
            //*************************************************//
            // Pass the File object to the Scanner
            Scanner scan = new Scanner(file);
            int count = 1;
            //*************************************************//
        
            //*************************************************//
            // Read the contents of the file and append questions to txaQuestions
            while (scan.hasNextLine()) 
            {
                //*************************************************//
                String line = scan.nextLine();
                //*************************************************//
           
                //*************************************************//
                // Append the question to txaQuestions
                txaAnswers.append("Answer " + count + ": " + line + "\n\n");
                count++;
                //*************************************************//
            }
            //*************************************************//
        
            //*************************************************//
            // Close the scanner
            scan.close();
            //*************************************************//
        
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    //*************************************************//


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaQuestions = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaAnswers = new javax.swing.JTextArea();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("This Admin Window Show's both every question and every answer in order");

        txaQuestions.setEditable(false);
        txaQuestions.setColumns(20);
        txaQuestions.setRows(5);
        jScrollPane1.setViewportView(txaQuestions);

        txaAnswers.setEditable(false);
        txaAnswers.setColumns(20);
        txaAnswers.setRows(5);
        jScrollPane2.setViewportView(txaAnswers);

        btnReturn.setText("Return to Admin Window");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        //*************************************************//
        //return to admin window
        adminWindow admin = new adminWindow();
        admin.setVisible(true);
        dispose();
        //*************************************************//
    }//GEN-LAST:event_btnReturnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaAnswers;
    private javax.swing.JTextArea txaQuestions;
    // End of variables declaration//GEN-END:variables
}
//***********************************END OF FILE****************************************//