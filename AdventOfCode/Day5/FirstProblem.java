package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstProblem {
    
    String input ;
    
    
    public FirstProblem(){
        
        getInput() ;
    }
    
    
    
    void run(){
        int firstElfFirstJob = 0 ;
        int firstElfLastJob = 0 ;
        int secondElfFirstJob = 0;
        int secondElfLastJob = 0 ;
        int total = 0 ;
        String use[] = new String[100000000];
        String used[] = new String[10000000];
        
        String[] pairsOfElves = input.split("\n");
        
        ArrayList<String>togetherElves = new ArrayList<>();
        ArrayList<String> useArrayList = new ArrayList<>();
        
        for (String string : pairsOfElves) {
            togetherElves.add(string);
            
        }

        for (String string : togetherElves) {
            use = string.split("-");
        }
        for (String string2 : use) {
            used = string2.split(",");
        }

        for (int z = 0; z <used.toString().length() ; z++) {

            useArrayList.add(used[z]);    
            }
        
        for(int i = 0; i <= useArrayList.size(); i+=4){
            firstElfFirstJob = Integer.parseInt(useArrayList.get(i));
            firstElfLastJob = Integer.parseInt(useArrayList.get(i + 1)) ;
            secondElfFirstJob = Integer.parseInt(useArrayList.get(i + 2)) ;
            secondElfLastJob = Integer.parseInt(useArrayList.get(i + 3)) ;
            if( firstElfFirstJob >= secondElfFirstJob && firstElfLastJob <= secondElfLastJob){
                total += 1 ;
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
    * Standard format to read the input from file
    */
    void getInput() {
        
        String path = "C:\\Users\\03tho\\OneDrive\\Desktop\\College\\AdventOfCode\\Day5\\input.txt" ;
        
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

