/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Project_2_Online_Quiz_System;
//*************************************************//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//*************************************************//

//*************************************************//
public class mainClass 
{    
    //*************************************************//
    //main method for the online quiz
    public static void main(String[] args) 
    {
        //*************************************************//
        //create a main instance of the class
        mainClass instance = new mainClass();
        //*************************************************//
        
        //*************************************************//
        //create and display login page
        loginPage login = new loginPage();
        login.setVisible(true);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //code to run the first quiz
    public void runFirstQuiz()
    {
        JOptionPane.showMessageDialog(null, "Starting first quiz now", "Starting Quiz", JOptionPane.INFORMATION_MESSAGE);
        
        //*************************************************//
        //run first quiz through the console
        try {
            //*************************************************//
            // Create an ArrayList to store the correct answers
            ArrayList<Integer> correctAnswers = new ArrayList<>();
            //*************************************************//
        
            //**************************************************************************************//
            //fetch and set the correct answers to check against
            BufferedReader reader = new BufferedReader(new FileReader("Quiz 1 correct answers.txt"));
            String lineAnswers;
            //*************************************************//
            
            //*************************************************//
            // Read the file line by line
            while ((lineAnswers = reader.readLine()) != null) 
            {
                //*************************************************//
                // Remove any leading/trailing whitespace
                lineAnswers = lineAnswers.trim(); 
                //*************************************************//
                
                //*************************************************//
                //change for int values
                switch (lineAnswers) {
                    case "A":
                        correctAnswers.add(0);
                        break;
                    case "B":
                        correctAnswers.add(1);
                        break;
                    case "C":
                        correctAnswers.add(2);
                        break;
                    default:
                        System.out.println("Invalid answer found: " + lineAnswers);
                }
                //*************************************************//
            }
            //*************************************************//
            reader.close();
            //*************************************************//

            //*************************************************//
            // Convert the ArrayList to an array 
            int[] correctAnswersArray = correctAnswers.stream().mapToInt(Integer::intValue).toArray();
            //**************************************************************************************//
            
            //*************************************************//
            //array list to store answers from the questions
            int[] answers = new int[10];
            int count = 0;
            //*************************************************//
        
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Quiz 1.txt");
            //*************************************************//
            
            //*************************************************//
            // Pass the File object to the Scanner
            Scanner scan = new Scanner(file);
            //*************************************************//
            
            //*************************************************//
            // Read the contents of the file
            while (count<10)
            {
                //*************************************************//
                //line string that stores the question and answers
                String line = scan.nextLine();
                //*************************************************//
                
                //*************************************************//
                //scan to break the question and answers apart
                Scanner scLine = new Scanner(line).useDelimiter("#");
                //*************************************************//
                
                //*************************************************//
                //create question and answers
                String question = scLine.next();
                String answer_1 = scLine.next();
                String answer_2 = scLine.next();
                String answer_3 = scLine.next();
                //*************************************************//
                
                //*************************************************//
                // Create JOptionPane that displays the question and saves the answer
                String[] options = {"A", "B", "C"};
                
                //*************************************************//
                String message = question + "\n" +
                    answer_1 + "\n" +
                    answer_2 + "\n" +
                    answer_3;
                //*************************************************//

                //*************************************************//
                //save response
                answers[count] = JOptionPane.showOptionDialog(null, 
                        message, 
                        "Question", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        options, 
                        options[0]);
                count++;
                //*************************************************//
                
                //*************************************************//
                // Close the scanner
                scLine.close();
                //*************************************************//
                
            }
            //*************************************************//

            //*************************************************//
            // Close the scanner
            scan.close();
            //*************************************************//
            
            //*************************************************//
            //find how many correct answers are listed
            int score = 0;
            for (int i = 0; i < correctAnswersArray.length; i++) 
            {
                if (correctAnswersArray[i] == answers[i]) 
                {
                    // Add 10 points for each correct answer
                    score += 10;  
                }
            }
            //*************************************************//
            
            //*************************************************//
            //quiz complete
            JOptionPane.showMessageDialog(null, "Quiz complete, calculating score", "Complete Quiz", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//
        
            //*************************************************//
            // Display the result
            JOptionPane.showMessageDialog(null, "The final result is: " + score + "%", "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException ex) { 
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //*************************************************//
        
    }
    //*************************************************//
    
    //*************************************************//
    //code to run the second quiz
    public void runSecondQuiz()
    {
        JOptionPane.showMessageDialog(null, "Starting second quiz now", "Starting Quiz", JOptionPane.INFORMATION_MESSAGE);
        
        //*************************************************//
        //run second quiz through the console
        try {
            //*************************************************//
            // Create an ArrayList to store the correct answers
            ArrayList<Integer> correctAnswers = new ArrayList<>();
            //*************************************************//
        
            //**************************************************************************************//
            //fetch and set the correct answers to check against
            BufferedReader reader = new BufferedReader(new FileReader("Quiz 2 correct answers.txt"));
            String lineAnswers;
            //*************************************************//
            
            //*************************************************//
            // Read the file line by line
            while ((lineAnswers = reader.readLine()) != null) 
            {
                //*************************************************//
                // Remove any leading/trailing whitespace
                lineAnswers = lineAnswers.trim(); 
                //*************************************************//
                
                //*************************************************//
                //change for int values
                switch (lineAnswers) {
                    case "A":
                        correctAnswers.add(0);
                        break;
                    case "B":
                        correctAnswers.add(1);
                        break;
                    case "C":
                        correctAnswers.add(2);
                        break;
                    default:
                        System.out.println("Invalid answer found: " + lineAnswers);
                }
                //*************************************************//
            }
            //*************************************************//
            reader.close();
            //*************************************************//

            //*************************************************//
            // Convert the ArrayList to an array 
            int[] correctAnswersArray = correctAnswers.stream().mapToInt(Integer::intValue).toArray();
            //**************************************************************************************//
            
            //*************************************************//
            //array list to store answers from the questions
            int[] answers = new int[10];
            int count = 0;
            //*************************************************//
        
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Quiz 2.txt");
            //*************************************************//
            
            //*************************************************//
            // Pass the File object to the Scanner
            Scanner scan = new Scanner(file);
            //*************************************************//
            
            //*************************************************//
            // Read the contents of the file
            while (count<10)
            {
                //*************************************************//
                //line string that stores the question and answers
                String line = scan.nextLine();
                //*************************************************//
                
                //*************************************************//
                //scan to break the question and answers apart
                Scanner scLine = new Scanner(line).useDelimiter("#");
                //*************************************************//
                
                //*************************************************//
                //create question and answers
                String question = scLine.next();
                String answer_1 = scLine.next();
                String answer_2 = scLine.next();
                String answer_3 = scLine.next();
                //*************************************************//
                
                //*************************************************//
                // Create JOptionPane that displays the question and saves the answer
                String[] options = {"A", "B", "C"};
                
                //*************************************************//
                String message = question + "\n" +
                    answer_1 + "\n" +
                    answer_2 + "\n" +
                    answer_3;
                //*************************************************//

                //*************************************************//
                //save response
                answers[count] = JOptionPane.showOptionDialog(null, 
                        message, 
                        "Question", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        options, 
                        options[0]);
                count++;
                //*************************************************//
                
                //*************************************************//
                // Close the scanner
                scLine.close();
                //*************************************************//
                
            }
            //*************************************************//

            //*************************************************//
            // Close the scanner
            scan.close();
            //*************************************************//
            
            //*************************************************//
            //find how many correct answers are listed
            int score = 0;
            for (int i = 0; i < correctAnswersArray.length; i++) 
            {
                if (correctAnswersArray[i] == answers[i]) 
                {
                    // Add 10 points for each correct answer
                    score += 10;  
                }
            }
            //*************************************************//
            
            //*************************************************//
            //quiz complete
            JOptionPane.showMessageDialog(null, "Quiz complete, calculating score", "Complete Quiz", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//
        
            //*************************************************//
            // Display the result
            JOptionPane.showMessageDialog(null, "The final result is: " + score + "%", "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException ex) { 
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //*************************************************//
        
    }
    //*************************************************//
    
    //*************************************************//
    //code to run the third quiz
    public void runThirdQuiz()
    {
        JOptionPane.showMessageDialog(null, "Starting third quiz now", "Starting Quiz", JOptionPane.INFORMATION_MESSAGE);
        
        //*************************************************//
        //run third quiz through the console
        try {
            //*************************************************//
            // Create an ArrayList to store the correct answers
            ArrayList<Integer> correctAnswers = new ArrayList<>();
            //*************************************************//
        
            //**************************************************************************************//
            //fetch and set the correct answers to check against
            BufferedReader reader = new BufferedReader(new FileReader("Quiz 3 correct answers.txt"));
            String lineAnswers;
            //*************************************************//
            
            //*************************************************//
            // Read the file line by line
            while ((lineAnswers = reader.readLine()) != null) 
            {
                //*************************************************//
                // Remove any leading/trailing whitespace
                lineAnswers = lineAnswers.trim(); 
                //*************************************************//
                
                //*************************************************//
                //change for int values
                switch (lineAnswers) {
                    case "A":
                        correctAnswers.add(0);
                        break;
                    case "B":
                        correctAnswers.add(1);
                        break;
                    case "C":
                        correctAnswers.add(2);
                        break;
                    default:
                        System.out.println("Invalid answer found: " + lineAnswers);
                }
                //*************************************************//
            }
            //*************************************************//
            reader.close();
            //*************************************************//

            //*************************************************//
            // Convert the ArrayList to an array 
            int[] correctAnswersArray = correctAnswers.stream().mapToInt(Integer::intValue).toArray();
            //**************************************************************************************//
            
            //*************************************************//
            //array list to store answers from the questions
            int[] answers = new int[10];
            int count = 0;
            //*************************************************//
        
            //*************************************************//
            // Create a File object for the text file
            File file = new File("Quiz 3.txt");
            //*************************************************//
            
            //*************************************************//
            // Pass the File object to the Scanner
            Scanner scan = new Scanner(file);
            //*************************************************//
            
            //*************************************************//
            // Read the contents of the file
            while (count<10)
            {
                //*************************************************//
                //line string that stores the question and answers
                String line = scan.nextLine();
                //*************************************************//
                
                //*************************************************//
                //scan to break the question and answers apart
                Scanner scLine = new Scanner(line).useDelimiter("#");
                //*************************************************//
                
                //*************************************************//
                //create question and answers
                String question = scLine.next();
                String answer_1 = scLine.next();
                String answer_2 = scLine.next();
                String answer_3 = scLine.next();
                //*************************************************//
                
                //*************************************************//
                // Create JOptionPane that displays the question and saves the answer
                String[] options = {"A", "B", "C"};
                
                //*************************************************//
                String message = question + "\n" +
                    answer_1 + "\n" +
                    answer_2 + "\n" +
                    answer_3;
                //*************************************************//

                //*************************************************//
                //save response
                answers[count] = JOptionPane.showOptionDialog(null, 
                        message, 
                        "Question", 
                        JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.PLAIN_MESSAGE, 
                        null, 
                        options, 
                        options[0]);
                count++;
                //*************************************************//
                
                //*************************************************//
                // Close the scanner
                scLine.close();
                //*************************************************//
                
            }
            //*************************************************//

            //*************************************************//
            // Close the scanner
            scan.close();
            //*************************************************//
            
            //*************************************************//
            //find how many correct answers are listed
            int score = 0;
            for (int i = 0; i < correctAnswersArray.length; i++) 
            {
                if (correctAnswersArray[i] == answers[i]) 
                {
                    // Add 10 points for each correct answer
                    score += 10;  
                }
            }
            //*************************************************//
            
            //*************************************************//
            //quiz complete
            JOptionPane.showMessageDialog(null, "Quiz complete, calculating score", "Complete Quiz", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//
        
            //*************************************************//
            // Display the result
            JOptionPane.showMessageDialog(null, "The final result is: " + score + "%", "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
            //*************************************************//

            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException ex) { 
            Logger.getLogger(mainClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //*************************************************//
        
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//