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
public class RacketErrorList {
    // list all the error scenarios that can be encountered in Add Racket Form

    // racket already exists
    private boolean racketDuplicate = false;
    // Brand
    private boolean brandMissing = false;
    // Family
    private boolean familyMissing = false;
    // Version
    private boolean versionMissing = false;
    // Price
    private boolean priceMissing = false;
    private boolean priceNotNumeric = false;
    private boolean priceNegative = false;
    private boolean priceZero = false;
    // Head Size
    private boolean sizeMissing = false;
    // Weight
    private boolean weightMissing = false;
    // String Pattern
    private boolean patternMissing = false;
    private boolean patternWrongFormat = false;
    // Description
    private boolean descriptionMissing = false;

    // setter for all the fields

    public void setRacketDuplicate(boolean racketDuplicate) {
        this.racketDuplicate = racketDuplicate;
    }
        
    public void setBrandMissing(boolean brandMissing) {
        this.brandMissing = brandMissing;
    }

    public void setFamilyMissing(boolean familyMissing) {
        this.familyMissing = familyMissing;
    }

    public void setVersionMissing(boolean versionMissing) {
        this.versionMissing = versionMissing;
    }

    public void setPriceMissing(boolean priceMissing) {
        this.priceMissing = priceMissing;
    }

    public void setPriceNotNumeric(boolean priceNotNumeric) {
        this.priceNotNumeric = priceNotNumeric;
    }

    public void setPriceNegative(boolean priceNegative) {
        this.priceNegative = priceNegative;
    }

    public void setPriceZero(boolean priceZero) {
        this.priceZero = priceZero;
    }

    public void setSizeMissing(boolean sizeMissing) {
        this.sizeMissing = sizeMissing;
    }

    public void setWeightMissing(boolean weightMissing) {
        this.weightMissing = weightMissing;
    }

    public void setPatternMissing(boolean patternMissing) {
        this.patternMissing = patternMissing;
    }

    public void setPatternWrongFormat(boolean patternWrongFormat) {
        this.patternWrongFormat = patternWrongFormat;
    }

    public void setDescriptionMissing(boolean descriptionMissing) {
        this.descriptionMissing = descriptionMissing;
    }
    
    /*
    //
    // getters for all the ields
    //
    */

    public boolean isRacketDuplicate() {
        return racketDuplicate;
    }
        
    public boolean isBrandMissing() {
        return brandMissing;
    }

    public boolean isFamilyMissing() {
        return familyMissing;
    }

    public boolean isVersionMissing() {
        return versionMissing;
    }

    public boolean isPriceMissing() {
        return priceMissing;
    }

    public boolean isPriceNotNumeric() {
        return priceNotNumeric;
    }

    public boolean isPriceNegative() {
        return priceNegative;
    }

    public boolean isPriceZero() {
        return priceZero;
    }

    public boolean isSizeMissing() {
        return sizeMissing;
    }


    public boolean isWeightMissing() {
        return weightMissing;
    }

    public boolean isPatternMissing() {
        return patternMissing;
    }
 
    public boolean isPatternWrongFormat() {
        return patternWrongFormat;
    }   

    public boolean isDescriptionMissing() {
        return descriptionMissing;
    }
}
