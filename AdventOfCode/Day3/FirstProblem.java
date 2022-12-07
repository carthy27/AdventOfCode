package Day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class FirstProblem {
    
    String input ;
    
    public FirstProblem(){
        
        getInput() ;
    }
    
    
    
    void run(){
        //coding here hehhe
        
        
        String lines[]= input.split("\n");
        ArrayList<String> rucksacks = new ArrayList<>();
        int total = 0 ;
        String str1 = "";
        String str2 = "";
        String str3 = "" ;
        
        //a string of all the items in each rucksack
        for (String string : lines) {
            
            rucksacks.add(string);
        }
        for (int m = 0 ; rucksacks.size() - 2 > m; m += 3) {
            str2 =  rucksacks.get(m);
            str1 = rucksacks.get(m + 1) ;
            str3 = rucksacks.get(m + 2);
            
            
            StringBuilder temp = new StringBuilder();
            for(char ch1 : str2.toCharArray()){
                if(temp.indexOf(ch1 + "") == -1) {
                    if(str1.indexOf(ch1) != -1 && str3.indexOf(ch1) != -1){
                        temp.append(ch1);
                        System.out.println(ch1);
                        
                        if(Character.isLowerCase(ch1)){
                            total += ch1 - ('a' -1);
                        } else {
                            total += ch1 - ('A' -27);
                        } break ;
                        
                    }
                }
            }
            
        }
        System.out.println(total);
    }
    
    
    
    
    
    
    
    
    
    
    /**
    * Standard format to read the input from file
    */
    void getInput() {
        
        String path = "C:\\Users\\03tho\\OneDrive\\Desktop\\College\\AdventOfCode\\Day3\\input.txt" ;
        
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


// //a string of all characters in the compartments
// for (String comp : rucksacks) {
    //     int lengthOfString = comp.length() ;
    //     compartments = comp.split(string,lengthOfString/2) ;
    //     compartmentsArrayList.add(comp) ;
    //     boolean endOfInput = false;
    //     do {
        //         for (int i = 0 ; i <= compartmentsArrayList.size() ; i++ ){
            //         String toBeCompared = compartmentsArrayList.get(i) ;
            //         for (int b = 0 ; b < compartmentsArrayList.get(b).length(); b++ )
            //         {
                //         Character c = 
                //         toBeCompared.indexOf(c)
                //         toBeCompared.contains(s) ;
                //         }}
                //     } while(!endOfInput);
                
                // }