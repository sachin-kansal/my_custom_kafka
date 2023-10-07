
/*
 * incomplete with issues
 */

package com.sachin;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader2 {
    public static void main(String[] args){

        String filepath = ".\\edureka-project\\src\\main\\resources\\products.json";
        try{
        byte[] jsonData = Files.readAllBytes(Paths.get(filepath));
        InputStream inputStream = new ByteArrayInputStream(jsonData);
        ObjectMapper objectMapper = new ObjectMapper();
        json_obj[] products = objectMapper.readValue(inputStream, json_obj[].class);

        for (int i=0 ; i<=10; i++){
            System.out.println(products[i]);
        }
        
    }catch(Exception e){
            System.out.println(e);
        }
}
}
