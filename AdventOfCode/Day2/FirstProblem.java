package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FirstProblem {

    String input ;

    public FirstProblem(){
    
        getInput() ;
    }
    


    void run(){
        //coding here hehe
        
        String lines[]= input.split("\n");

        //ax 
        //ay
        //az
        //bx
        //by
        //bz
        //cx
        //cy
        //cz
        
        //o if lost, 3 if draw, 6 if win
        // x lose, y draw, z win
        // a x rock 1, b y paper 2, c z scissors 3
        int totalScore = 0; 
        for (String strings : lines ) {
            
        
         if ( strings.equals("A X")) {
            totalScore += 3 ;
 
         }
         if (strings.equals("A Y")){ 
            totalScore += 4 ;
         }
         if (strings.equals("A Z")){ 
            totalScore += 8 ;
         }

         
         if ( strings.equals("B X")) {
            totalScore += 1 ;
 
         }
         if (strings.equals("B Y")){ 
            totalScore += 5 ;
         }
         if (strings.equals("B Z")){ 
            totalScore += 9 ;
         }

         
         if ( strings.equals("C X")) {
            totalScore += 2 ;
 
         }
         if (strings.equals("C Y")){ 
            totalScore += 6 ;
         }
         if (strings.equals("C Z")){ 
            totalScore += 7 ;
         }

         
        }
        System.out.println(totalScore);
 
    }


    
    /**
     * Standard format to read the input from file
     */
    void getInput() {
        
        String path = "C:\\Users\\03tho\\OneDrive\\Desktop\\College\\AdventOfCode\\Day2\\input.txt" ;

        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String sCurrentLine;
            while ((sCurrentLine = reader.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.input = contentBuilder.toString();
    }



}
