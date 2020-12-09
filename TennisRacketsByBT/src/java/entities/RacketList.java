/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.ArrayList;

// provides utilities to interact with sql database  (derby)
import java.sql.*;

/**
 *
 * @author bthapa01
 */

// entity class RacketList with an ArrayList as its properties 
// to hold the list of rackets
public class RacketList {
    // an empty arrylist of rackets
    public ArrayList<Racket> rackets;

    // constructor that creates an empty list
    public RacketList() {
        this( new ArrayList<Racket>() );
    }
    
    public RacketList(ArrayList<Racket> rackets) {
        this.rackets = rackets;
    }

    // getter - racket list
    public ArrayList<Racket> getRackets() {
        return rackets;
    }
    
    // setter - racket list
    public void setRackets(ArrayList<Racket> rackets) {
        this.rackets = rackets;
    }
    
    // method - add racket to the list
    public void addRacket(Racket racket) {
        this.rackets.add(racket);
    }
    
    public void addRacket(String version,String versionDesc,String price,String size,String weight,String pattern,String dummyracket,String brand,String family,String familyDesc){
        Double racketPrice = Double.parseDouble(price);
        int racketSize = Integer.parseInt(size);
        Double racketWeight = Double.parseDouble(weight);
        Racket racket = new Racket ( version,versionDesc,racketPrice,racketSize,racketWeight,pattern,dummyracket,brand,family,familyDesc);
        this.rackets.add(racket);
    }
    
    // the fucntion to find the racket from rackets list using its id
    public Racket findRacket(String id) {
        for (int i=0; i < this.rackets.size(); i++){
            if ( (id).equals(this.rackets.get(i).id) )
                return this.rackets.get(i);
        }
        return null; 
    }
    
    // returns the size of the racket list
    public int getNumber(){
        return this.rackets.size();
    }
    
    public void drop(String id){
        Racket r = findRacket(id);
        this.rackets.remove(r);
    }
    
    public Double getTotalPrice(){
        Double totalPrice = 0.0;
        for (int i =0; i<rackets.size(); i++) {
            totalPrice += rackets.get(i).price;
        }
        return totalPrice;
    }

    
    public static String createID(String brandName, String familyName, String versionName){
        return brandName + " " + familyName + " " + versionName;
    }
    /*
    *   following methods make use of derby database
    */
    
    // get the data from the sql database and add them to array list
    public void loadRackets () {
        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        try {
            // load the database driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            // Use driver to connect to database 
            // use the database url, username, and password
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/RacketData", "app", "app");
        }
        catch (SQLException ex) {
            System.out.println("Connection failed!");
        }
        catch (Exception ex) {
            System.out.println("No driver!");
        }
        
        try {
            // create statement to query the database
            // and store the data to the resultSet object results
            statement = connection.createStatement();
            results = statement.executeQuery("select * from Racket"); // Racket is the table name
            
            // loop through the record until the end of table database
            while (results.next()) {
                // Get each field from the table
                    
                String id = results.getString("id");
                
                String brand = results.getString("brand");
                String family = results.getString("family");
                String version = results.getString("version");
                Double price = results.getDouble("price");
                int size = results.getInt("size");
                Double weight = results.getDouble("weight");
                String pattern = results.getString("pattern");
                String description = results.getString("description");
                String image = "images/dummyracket.jpg"; // this is not stored in the database so will be same for all the rackets
                // Construct a new racket object from that data, and add to list
                Racket r = new Racket( version, description, price, size, weight, pattern, image, brand, family, description);
                rackets.add(r);
            }
        }        
        catch (SQLException ex) {
            System.out.println("Query failed!");
        }
    }      
    
    // save new racket to the database
     public void saveRacket(String version, String price, String size, String weight, 
             String pattern, String brand, String family, String description ) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;
        try {
            // Load the appropriate database driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            // Connect to the database through that driver, using the 
            // database url and the username and password
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/RacketData", "app", "app");
            }
        catch (SQLException ex) {
            System.out.println("Connection failed!");
        }
        catch (Exception ex) {
            System.out.println("No driver!");
        }
        
        try {
            // create racket id from brand family and version
            // this will be primary key
            String id = createID(brand, family, version);
            // Create a "template" for the SQL insert statement, with ?
            // in place of the values we will actually insert
            String template = "insert into Racket "
                    + "(id, brand, family, version, price, size, weight, pattern, description) "
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Pass this template to the database server via the connection
            statement = connection.prepareStatement(template);
            
            // Replace the question marks with the actual values
            statement.setString(1, id);
            statement.setString(2, brand);
            statement.setString(3, family);
            statement.setString(4, version);
            statement.setDouble(5, Double.parseDouble(price));
            statement.setInt(6, Integer.parseInt(size));
            statement.setDouble(7, Double.parseDouble(weight));
            statement.setString(8, pattern);
            statement.setString(9, description);
            
            // Exectue the final SQL statement on the database.
            statement.executeUpdate();
        }      
        catch (SQLException ex) {
            System.out.println("Query failed!");
        }
        
    }
}


