package Day1;

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

ArrayList<Double> allelves = new ArrayList<>();
boolean boobs;
public void run(){

    String lines[] = input.split("\\r?\\n");

    double totalElfCalories = 0 ;


    for (String string : lines) {
        if(string.isBlank()){
            allelves.add(totalElfCalories);
            totalElfCalories = 0 ;
            continue ;
        }
        double elfCalories = Integer.parseInt(string) ;
        totalElfCalories = elfCalories + totalElfCalories ;
        
    }
    Collections.sort(allelves , Collections.reverseOrder());



    System.out.println( allelves.get(0) + allelves.get(1) + allelves.get(2));
   
    
}




    /**
     * Standard format to read the input from file
     */
    void getInput() {
        
        String path = "C:\\Users\\03tho\\OneDrive\\Desktop\\College\\AdventOfCode\\Day1\\input.txt" ;

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
