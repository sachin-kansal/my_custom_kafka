package com.sachin;

import java.io.File;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * the following piece of code read the json file created from csv file
 * and return the json objects from json array
 */
@JsonIgnoreProperties(ignoreUnknown = true)
 class json_obj{
    
    @JsonProperty("PogId")
    private String pogid;
    @JsonProperty("Supc")
    private String supc;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("Description")
    private String description ;
    @JsonProperty("Size")
    private String size;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("SubCategory")
    private String subcategory;
    @JsonProperty("Price")
    private String price; 
    @JsonProperty("Quantity")
    private String quantity;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("SellerCode")
    private String sellercode; 
    private String creationtime;
    private String stock;

    public json_obj(){
    }

    public json_obj (String pogid, String supc, String brand, String description, String size, String category, String subcategory, String price, String quantity,  String country, String sellercode,  String creationtime, String stock)
    {
        this.sellercode = sellercode;
        this.pogid = pogid;
        this.supc = supc;
        this.brand = brand;
        this.description = description;
        this.size = size;
        this.category = category;
        this.subcategory = subcategory;
        this.price = price;
        this.quantity = quantity;
        this.country = country;
        this.creationtime = creationtime;
        this.stock = stock;
    }
    public String getsupc(){
        return supc;
    }
    public String getdescription(){
        return description;
    }
    public String getsize(){
        return size;
    }
    public String getcategory(){
        return category;
    }
    public String getsellercode(){
        return sellercode;
    }
    public String getpogid(){
        return pogid;
    }
    public String getcreationtime(){
        return creationtime;
    }
    public String getstock(){
        return stock;
    }
    public String getcountry(){
        return country;
    }
    public String getquantity(){
        return quantity;
    }
    public String getprice(){
        return price;
    }
    public String getsubcategory(){
        return subcategory;
    }
    public String getbrand(){
        return brand;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public void setsupc(String supc) {
        this.supc = supc;
    }
    public void setsize(String size){
        this.size = size;
    }   
    public void setcategory(String category){
        this.category = category;
    }
    public void setsellercode(String sellercode){
        this.sellercode = sellercode;
    }
    public void setpogid(String pogid){
        this.pogid = pogid;
    }
    public void setcreationtime(String creationtime){
        this.creationtime = creationtime;
    }
    public void setstock(String stock){
        this.stock = stock;
    }
    public void setcountry(String country){
        this.country = country;
    }
    public void setquantity(String quantity){
        this.quantity = quantity;
    }
    public void setprice(String price){
        this.price = price;
    }
    public void setsubcategory(String subcategory){
        this.subcategory = subcategory;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
}

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
                
            
                ObjectMapper objectMapper = new ObjectMapper();
                try{
                    json_obj product = objectMapper.readValue(s_arr, json_obj.class);
                
                }catch(JsonMappingException e){
                        System.out.print(e);
                        break;
                }catch(JsonProcessingException e){
                        System.out.println(e);
                        break;
                }
            }
            j_file_reader.close();
        }
        catch (Exception e)
        {
         e.printStackTrace();   
        }

    }
}
