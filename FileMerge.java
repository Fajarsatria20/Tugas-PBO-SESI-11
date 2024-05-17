import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author komputer 18
 */
public class FileMerge {
    public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\komputer 18\\Downloads\\Latihan\\students.csv",
            "C:\\Users\\komputer 18\\Downloads\\Latihan\\new_students.csv"
        };
        String mergedFile = "C:\\Users\\komputer 18\\Downloads\\Latihan\\merge_students.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (java.io.IOException e){
                    e.printStackTrace();
                }
            }
        } catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
}

