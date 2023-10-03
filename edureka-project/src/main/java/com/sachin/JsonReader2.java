package com.sachin;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

class json_obj{
    private int PogId;
    private String Supc;
    private String Brand;
    private String Description;
    private String Size;
    private String Category;
    private String SubCategory;
    private String Price; 
    private String Quantity; 
    private String Country;
    private String SellerCode; 
    private String creationtime;
    private String stock;


    public json_obj (int PogId, String Supc,
    String Brand,
    String Description,
    String Size,
    String Category,
    String SubCategory,
    String Price,
    String Quantity, 
    String Country,
    String SellerCode, 
    String creationtime,
    String stock){
        this.SellerCode = SellerCode;
    }

    public String getSellerCode(){
        return SellerCode;
    }
}

public class JsonReader2 {
    public static void main(String[] args){

        byte[] jsonData = Files.readAllBytes(Paths.get(".\\edureka-project\\src\\main\\resources\\products.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            json_obj[] products = objectMapper.readValue(jsonData, 0, 0, json_obj[].class);
}
}
