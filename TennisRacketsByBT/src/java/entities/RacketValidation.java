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
public class RacketValidation {
   // list all static methods to validate all the user inputs
    
    // validate brand name
    public static boolean validateBrand(String brand, RacketErrorList errors) {
        // check if brand name is given
        if ( "select".equals(brand.trim()) || brand == null ) {
            errors.setBrandMissing(true);
            return false;
        }
        else
            return true;
    }
    
    // validate family name
    public static boolean validateFamily(String family, RacketErrorList errors) {
        // check if family name is given
        if ( "".equals(family.trim()) || family == null) {
            errors.setFamilyMissing(true);
            return false;
        }
        else
            return true;
    }
    
    // validate version
    public static boolean validateVersion(String version, RacketErrorList errors){
        // check if any version name is given
        if( "".equals(version.trim()) ){
            errors.setVersionMissing(true);
            return false;
        }
        else
            return true;
    }
    
    /*
    *   validate price
    *       should be numeric
    *       not zero
    *       non negative
    */
    public static boolean validatePrice(String price, RacketErrorList errors) {
        // first check if any price is given
        if( "".equals(price.trim())) {
            errors.setPriceMissing(true);
            return false;
        }
        else {
            try {
                // then parse the input
                Double racketPrice = Double.parseDouble(price.trim());
                
                // check if price is negative
                if ( racketPrice < 0 ){
                    errors.setPriceNegative(true);
                    return false;
                }
                
                // check if price is zero
                if ( racketPrice == 0 ){
                    errors.setPriceZero(true);
                    return false;
                }
            }
            // if a number format exception (nonnumeric input) occurs
            // then create error
            catch (NumberFormatException ex) {
                errors.setPriceNotNumeric(true);
                return false;
            }
        }
        return true;
    }
    
    /*
    * validate racket size
    */
    public static boolean validateSize(String size, RacketErrorList errors) {
        // check if size is selected
        if ("select".equals(size)){
            errors.setSizeMissing(true);
            return false;
        }
        return true;
    }
    
    /*
    *   Validate weight
    */
    public static boolean validateWeight(String weight, RacketErrorList errors) {
        // check if any input is given
        if ( "select".equals(weight) ) {
            errors.setWeightMissing(true);
            return true;
        }
        return true;
    }
    
    /*
    *   Validate racket string pattern
    *   must match the format
    *       using regular expression
            18x20
            16x19
            16x18
            16x20
    
    *       ((16)x(18|19|20))|((18)x(16|17|20))
    */
    public static boolean validatePattern(String pattern, RacketErrorList errors) {
        // check if the user selected any pattern
        if ( "".equals(pattern.trim()) || pattern == null) {
            errors.setPatternMissing(true);
            return false;
        }
        else{
            pattern = pattern.trim();
            String patternRegEx = "((16)x(18|19|20))|((18)x(16|17|20))";
            
            if( !pattern.matches(patternRegEx) ) {
                errors.setPatternWrongFormat(true);
                return false;
            }
        }
            return true;
    }
    
    // validate description
    // must be provided
    public static boolean validateDescription (String desc, RacketErrorList errors) {
        if ( "".equals(desc.trim())) {
            errors.setDescriptionMissing(true);
            return false;
        }
        return true;
    }
        
}
