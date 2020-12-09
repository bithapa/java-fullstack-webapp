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

// entity class family
// this is used to extend the Racket class
public class Family {
    
    public String brandName;    // name of the brannd
    public String familyName;   // family name within the brand
    public String familyDesc;   // description of the family rackets

    public Family(String brandName, String familyName, String familyDesc) {
        this.brandName = brandName;
        this.familyName = familyName;
        this.familyDesc = familyDesc;
    }
    
    
    /**
     * Get the value of brandName
     *
     * @return the value of brandName
     */
    public String getBrandName() {
        return brandName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getRacketDesc() {
        return familyDesc;
    }
        
    /**
     * Set the value of brandName
     *
     * @param brandName new value of brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setRacketDesc(String familyDesc) {
        this.familyDesc = familyDesc;
    }
 
}