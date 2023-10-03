package com.sachin;

import java.io.File;
import java.util.Scanner;

/*
 * the following piece of code read the json file created from csv file
 * and return the json objects from json array
 */

public class JSonreader {
    public static void main(String[] args)
    {
        // file reading
        File j_file = new File(".\\edureka-project\\src\\main\\resources\\products.json");
        try {
            Scanner j_file_reader = new Scanner(j_file);
            while (j_file_reader.hasNextLine()){
            String s_arr =  j_file_reader.nextLine();
                // cleaning the json object while getting out of json array
                if (s_arr.endsWith("]")) s_arr=s_arr.substring(0,s_arr.length()-1);
                if (s_arr.endsWith("},"))s_arr=s_arr.substring(0,s_arr.length()-1);
                if (s_arr.startsWith("["))s_arr=s_arr.replaceFirst("\\[", "");
                
            System.out.println(s_arr);
            }
            j_file_reader.close();
        }
        catch (Exception e)
        {
         e.printStackTrace();   
        }

    }
}
