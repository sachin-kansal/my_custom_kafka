
// /*
//  * incomplete with issues
//  */

// package com.sachin;

// import java.io.ByteArrayInputStream;
// import java.io.InputStream;
// import java.nio.file.Files;
// import java.nio.file.Paths;

// import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.databind.ObjectMapper;

// class json_obj{
//     private String PogId;
//     private String Supc;
//     private String Brand;
//     private String description;
//     private String Size;
//     private String Category;
//     private String SubCategory;
//     private String Price; 
//     private String Quantity; 
//     private String Country;
//     private String SellerCode; 
//     private String creationtime;
//     private String stock;

//     public json_obj(){
//     }

//     public json_obj (String PogId, String Supc, String Brand, String description, String Size, String Category, String SubCategory, String Price, String Quantity,  String Country, String SellerCode,  String creationtime, String stock){
//         this.SellerCode = SellerCode;
//         this.PogId = PogId;
//         this.Supc = Supc;
//         this.Brand = Brand;
//         this.description = description;
//         this.Size = Size;
//         this.Category = Category;
//         this.SubCategory = SubCategory;
//         this.Price = Price;
//         this.Quantity = Quantity;
//         this.Country = Country;
//         this.creationtime = creationtime;
//         this.stock = stock;
//     }
//     public String getSupc(){
//         return Supc;
//     }
//     public void setSupc(String Supc){
//         this.Supc = Supc;
//     }
//     public String getdescription(){
//         return description;
//     }
//     public void setdescription(String description){
//         this.description = description;
//     }
//     public String getSize(){
//         return Size;
//     }
//     public String getCategory(){
//         return Category;
//     }
//     public String getSellerCode(){
//         return SellerCode;
//     }
//     public String getPogID(){
//         return PogId;
//     }
//     public String getcreationtime(){
//         return creationtime;
//     }
//     public String getstock(){
//         return stock;
//     }
//     public String getCountry(){
//         return Country;
//     }
//     public String getQuantity(){
//         return Quantity;
//     }
//     public String getPrice(){
//         return Price;
//     }
//     public String getSubCategory(){
//         return SubCategory;
//     }
//      public String getBrand(){
//         return Brand;
//     }
// }

// public class JsonReader2 {
//     public static void main(String[] args){

//         String filepath = ".\\edureka-project\\src\\main\\resources\\products.json";
//         try{
//         byte[] jsonData = Files.readAllBytes(Paths.get(filepath));
//         InputStream inputStream = new ByteArrayInputStream(jsonData);
//         ObjectMapper objectMapper = new ObjectMapper();
//         json_obj[] products = objectMapper.readValue(inputStream, json_obj[].class);

//         for (int i=0 ; i<=10; i++){
//             System.out.println(products[i]);
//         }
        
//     }catch(Exception e){
//             System.out.println(e);
//         }
// }
// }
