package Day4;

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
        
        String[] pairsOfElves = input.split("\n");
        ArrayList<String> useArrayList = new ArrayList<>();
        
        String used[] = new String[100000000];
        String use[] = new String[100000000];

        for (String str : pairsOfElves) {
            used = str.split("-");
            for (String string : used) {
                use = string.split(",");
                for (String boob : use) {
                    useArrayList.add(boob) ;
                }
            }
        }

       

        
        for(int i = 0; i < useArrayList.size(); i+=4){
            firstElfFirstJob = Integer.parseInt(useArrayList.get(i));
            firstElfLastJob = Integer.parseInt(useArrayList.get(i+1)) ;
            secondElfFirstJob = Integer.parseInt(useArrayList.get(i+2)) ;
            secondElfLastJob = Integer.parseInt(useArrayList.get(i+3)) ;
            if( firstElfFirstJob >= secondElfFirstJob && firstElfLastJob <= secondElfLastJob){
                total += 1 ;
            }
        }
        System.out.println(total);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
    * Standard format to read the input from file
    */
    void getInput() {
        
        String path = "C:\\Users\\03tho\\OneDrive\\Desktop\\College\\AdventOfCode\\Day4\\input.txt" ;
        
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

