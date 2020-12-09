/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author bthapa01
 */

// this is a Racket class entity that extends from the Family class
public class Racket extends Family {
    public String versionName;
    public String id;           // id is combination of brand name , family name, and version name
    public String versionDesc;
    
    public double price;        // $$
    public int headSize;        // head size - sq. inch
    public double weight;       // lbs.
    
    public String stringPattern;// main vs crosses
    public String image;        // .jpg

    // constructor that initializes the properties 
    // and also creates the id
    public Racket(String versionName, 
            String versionDesc, 
            double price, 
            int headSize, 
            double weight, 
            String stringPattern, 
            String image, 
            String brandName, 
            String familyName, 
            String familyDesc) 
    {
        super(brandName, familyName, familyDesc);
        this.versionName = versionName;
        this.id = createID();
        this.versionDesc = versionDesc;
        this.price = price;
        this.headSize = headSize;
        this.weight = weight;
        this.stringPattern = stringPattern;
        this.image = image;
    }

    // setters for each properties
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStringPattern(String stringPattern) {
        this.stringPattern = stringPattern;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // getters for each properties
    public String getVersionName() {
        return versionName;
    }

    public String getId() {
        return id;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public double getPrice() {
        return price;
    }

    public int getHeadSize() {
        return headSize;
    }

    public double getWeight() {
        return weight;
    }

    public String getStringPattern() {
        return stringPattern;
    }

    public String getImage() {
        return image;
    }  
    // a function to create id
    public String createID(){
        return this.brandName + " " + this.familyName + " " + this.versionName;
    }
    
    
}