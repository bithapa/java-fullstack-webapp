# server-side

Server-Side Web Programming Notes

## TOC
- [x] 1. Introduction
- [x] 2. Background
    - - [x] JavaServer Pages
    - - [x] Intro to JSP
    - - [x] The Request Object
- [x] 3.Advanced Request Handling
    - - [x] Servlets and Redirection
    - - [x] Introduction to Servlets
    - - [x] Servlets and Redirection
- [ ] 4. Web Configuration
- [x] 5. Entity Classes and JSTL
    - - [x] Entity Classes
    - - [x] EL - Expression Language
    - - [x] JSTL - JSP Tag Languge
- [ ] 6. Session Handling
    - - [ ] Intro to Session Handling
    - - [ ] Sessions and Entity Objects
    - - [ ] Sessions and Security

- [ ] 7. User Interface Design
    - - [ ] Modular and Uniform User Interface Design

- [ ] 8. Entity Class Design and Shopping Carts
    - - [ ] Displaying list of Entity objects
    - - [ ] Preloading Entity Objects
    - - [ ] Selecting from Lists
    - - [ ] Dynamic Lists and Shopping Carts
    - - [ ] Displaying Shopping Carts

- [ ] 9. Inout Validation and Error Pages
  - - [ ] Validation Concepts
  - - [ ] Validation and the MVC Architecture
  - - [ ] Displaying Error Messages
  - - [ ] Validating Required Fields
  - - [ ] Validating Numeric Fields
  - - [ ] Validation Using Regular Expression
  - - [ ] Echoing Fields Values

- [ ] 10. Database Manipulation
  - - [ ] Intro to server-side database
  - - [ ] Database Servers
  - - [ ] Intro to JDBC
  - - [ ] JDBC Queries
  - - [ ] Parameterized SQL and Prepared Statements


## Lesson 2: Background

### Web Containers:
  - Software to generate request and responses
- Listening and responding
  - Receives request via a url
  - parse URL
  - Retrieve response page
  - Run code within the response page to dynamically generate html version of response
  - Send response to client
- WCS runs on a web server listening for web URL via particular port

#### IDE
- Tools for editing/compiling code, running/debugging
- Integrated database
- NB includes Glassfish/Tomcat
- Can run both client and server
- Run the page in IDE
- IDE starts the browser, loading the page
- Request sent to the port in the computer using localhost
- Run web containers
- IDE sends response to browser
- client/server development

#### NetBeans/JDK
- JAVA EE contains Tomcat and Glassfish
- JDK 8.2/NetBeans 8.2







### Model View Control Paradigm:

Model View Control (MVC)
Architecture use to design most large scale websites
A request is sent to a component that acts as a control, which then determines what types of views/web-pages to generate.
Oftentimes, control and views interact with another component called Model, which in turn sometimes incorporate database
This generates the final response
Used by most frameworks eg. Grails

#### Control:
Implementing control logic to determine what happens next,
Categorizing the request information
Databases, legal/illegal
Once the control categorizes the request, it determines which views to send
Control is written with java servlets
View
Represents the user interface
One view for each page
Dynamically generated
Implemented as Java server pages
Model
Implement as Business logics
Supports the organizational logic
Use separate software classes to store and manipulate the data or the information
Often Interacts with the database
Used by control to determine which views to respond
Implementation in Java based System
Loan Calculator


Loan Calculator Example
- Requirements
- Enter info
- Validation
- Use info to compute payment
- display

What are the views, model components of the Loan Calculator example?


#### HTML FORM TAGS


#### The form tag:
Defines values for element, url, and method

```HTML
<form action =”” method=””>
…
</form>
```
#### GET vs. POST methods:
- GET:
  - Default method
  - Appends form data at the end of URL
  - Faster
  - No limit to the form data passed
  - Allows bookmarking of pages
- POST:
  - Must specify in FORM
  - Form data is not visible
  - Isn’t the fastest method
  - Data passed is limited to 4K
  - Prevents bookmarking

#### Input Tags
```HTML
<input type=”” name=”” value=””/>
```

- type
  - text
- checkbox (default not checked)
  - checked = “true”
- radio
  - value = what is sent to server
  - selected = “true”
```HTML
<input type=”radio” name=”courseprefix” value=”CSIS” checked=”true” />CSIS
<input type=”radio” name=”courseprefix” value=”CSCI”/>CSCI
<input type=”radio” name=”courseprefix” value=”INFO”/>INFO
```

- Select/Option Tag
  - Use to create the dropdown menu
```HTML
<Select name=”coursehours”>
	<option value=”1”>1</option>
	<option value=”2” selected=”true>2</option>	   //default selected
</select>
```
- Submit Button
  - Value attribute displays the label displayed in the button
```HTML
<input type=”submit” value=”SUBMIT” />
```

- Form Submission
  - Values of all the element in the form are submitted in the format of *[element name = element value]*. This can be checked on link when using the GET method

- FORM elements and Requests
  - Data is appended at the end of URL in GET method
- Submitted values by Element
  - txt: value entered by the user; NULL if nothing is entered
  - radio: value of the element selected by the user
  - select/option: name of the select option and value of the option is used
	- Eg. coursehours=4

- checkbox:
	- “on” if checked/nothing if not checked

## Lesson 3. JAVA Server Pages


### Intro to Java Server Pages:

- JSP Syntax:
```JAVA
  <% … %>
	<%= some Java expression%>
```

- Example:
	Two plus two is ```<%= 2+2%>```.

#### Scriplets:
	- ```<%   -----  %>```
  - Executes Java code without generating html
  - Extract values of form elements
  - store/access values in databases
```HTML
<html>
<body>
  <% int sum = 2+2;%>
<p>
Two plus two is <%= sum%>.
</p>
</body>
</html>
```

- Dynamica Example:
```html
<%
Date now = new Date();
String nowString = now.toString();
%>

<p>The current date and time is <%=nowString%>.</p>
```

#### Importing Classes:
```JAVA
<%@
Page import=”java.util.Date”
%>
```

- Documentation:
  - Comments:
    - JSP:
      ```
		    // comment
		    /* comment */
      ```
    - HTML:
      ```
        <!-- comment -->
      ```
#### The Request Object:

#### Advanced Request Handling:

### Lesson 3. JAVA Server Pages

- Introduction to Servlets

- Servlet Class Structure
	- Key Methods:
    - void doGet(, )


## Lesson 4. Entity Classes and JSTL

### Entity Classes
**Java Classes or Java Beans**
- NetBeans - Create Class (include in the package)
With properties or attributes or member variables that can be gettable/settable
These properties should not be named after SQL reserved words if using the SQL database
Each member should have getter and setter method

```Java
public double getPrinciple () {
  return principle;
}

public double setPrinciple (double apr) {
  this.apr = apr
}
```
#### Constructors
can be automatically inserted using ```alt+insert```.


#### Servlet example (Loan.java)
```JAVA
// get parameters values and covert to numbers
double amount = Double.parseDouble(request.getParameter("principal"));
double rate = Double.parseDouble(request.getParameter("apr"));
int months = Integer.parseInteger(request.getParameter("months"));

// construct the new loan object from the paramters and add to Request
Loan loan = new Loan(amount, rate, months);
request.setAttribute("loan", loan);

// Forward to next page
getServletContext().
    getRequestDispatcher(nextPage).
        forward(request, response);
```

### Expression Language - EL
- **A way of manipulating entity objects within server pages**
  - separate user interface design from Coding
    - **Server Pages (.jsp)** - User Interface: `getAttribute(attributename)`
    - **Servlets/Model Classes (.java)** - Model-based Domain `${attributename}`
- Provides direct access to attribute in JSP without having to use get method
- Syntax:
    - `${attributename}`
    - `${objectname.variablename}`
      - must have a getter method `getVariablename` in the Entity class
      - and a model object `objectname` constructed by the Servlet added to the request *see example below:*
      - Servlet:
          ```java
          double amount = Double.parseDouble(request.getParameter("principal"));
          double rate = Double.parseDouble(request.getParameter("apr"));
          int months = Integer.parseInteger(request.getParameter("months"));

          // construct the new loan object from the paramters and add to Request
          Loan loan = new Loan(amount, rate, months);
          request.setAttribute("loan", loan);
          ```
      - Server Page:
          ```HTML
          <table boarder="1">
            <tr>
              <td>Loan Amount</td>
              <td>${loan.principal}</td> <!-- invokes loan.getPrincipal() -->
            </tr>
            <tr>
              <td>Annual Percentage Rate</td>
              <td>${loan.apr}</td>
            </tr>
          ```
- EL is mostly used to display the values computed in the Entity class



### JSTL -  JSP Tag Library
    - Simplifying Coding in JSPs
    - JSTL conditional TAGS
      - EL Conditions
      - Simple if statements
      - multiple options conditional statements
    - JSTL iteration tags  

- Goal - replace complex java servlets code with tags
- Mostly used for conditions and iteration
- Syntax:
  `<c:tagname attributes ...`
- Must be imported at the start of JSP:
    ```java
    <%@ taglib prefix="c"
      uri="http://java.sun.com/jsp/jstl/core" %>
    ```
#### EL Conditions
- JSTL conditional statements are based on *relational operations*
- Format: `${condition}`
  - Conditions usually involves EL attributes
  - Relational Operators have both Java and letter syntax *****
  -  to check an empty string for var `x`:`empty x`

#### Conditional Tags
- simple if:
  ```html
  You will pay $ ${loan.payment} each month for ${loan.months} month<c:if test="${loan.months != 1}">s</c:if>.
  ```
- Multiple Selection:
  ```HTML
  <c:choose>
    <c:when test="${loan.months} == 1">
      month
    </c:when>
    <c:otherwise>
      months
    </c:otherwise>
  </c:choose>
  ```
- Iteration Tag:
  - Servlet:
    ```JAVA
    String[] stoogeArray = new String[] {"Larry", "Curley", "Moe", "Shemp"};
    request.setAttribute("stooges", stoogeArray);
    ```
  - Server Page:
    <!-- displays the stooges from the stoogeArray -->
    ```HTML
    <c:forEach var="stooge" items="${stooges}">
      ${stooge}<br/>
    </c:forEach>
    ```

---

## Lession 6. Session Handeling


### Intro to Session Handling


---

**Semester Project**

class Racket:
  String brandName
  String famName
  String famDescription
  Family [] Rackets
class Version extends Racket:
  String ID
  String version
  double price
  String description
  String headSize
  double weight
  double swingWeight
  double balance
  String stringPattern
  String picture
  double rating
  String[] players
  // constructor
  // getters
  // setters


```JAVA

```

---

## Lesson 7. User Interface Design

### Modular and Uniform User Interface Design

- the idea that the pages on same site should have "same look and feel"
-  can be achieved by using "template"
  - template defines the content universal to sections of pages
  - by using separate files for different section of the page that are shared across the site
  - such as Logo.html, Navbar.html, Footer.jsp, Header.jsp etc.
- These are called "Static elements" because they do not change over user session
- Syntax: `<%@ include file ="/relative file url" %>`

```html
  <header>
    <%@ include file="/Logo.html" %>
  </hader>

  <nav>
    <%@ include file="/Navbar.html">
  </nav>
```

- Sometime we have to incorporate dynamic values in these static elements
- Syntax: `<c: import url="relative url" />`

```html
  <!--File: Footer.jsp-->
  <c:choose>
    <c:when test="${empty username}">
      <form action='setName'>
        Name: <input type="text" name='username'>
        <input type="submit" value="GO"/>
      </form>
    </c:when>

    <c:otherwise>
      <c:out value="Hello ${username}"/>
    </c:otherwise>
  </c:choose>
```

```html
  <!-- code to include Footer.jsp-->
  <footer>
    <c:import url="/Footer.jsp" />
  </footer>
```

- Note that there is different syntax for static and dynamic resources
- Using `template.jsp` for all pages:

```html
<!-- FILE: template.jsp-->
  <html>
  <head>
    <link rel="stylesheet" type="text/css" href="template.css">
  </head>
  <body>
    <header>
        <%@ include file="/Logo.html" %>
    </header>
    <nav>
      <%@ include file="/Navbar.html"%>
    </nav>

    <article>
      INSERT PAGE CONTENT HERE!
    </article>

    <footer>
      <c:import url="/Footer.jsp" />
    </footer>
  </body>
  </html>
```

---

## Lesson 8. Entity Class Design and Shopping Carts

### Displaying list of Entity objects

- **Displaying a list of items**
- In MVC architecture
  - LIST as well should be an entity object
    - usually Array or an dynamic ArrayList
    - With getter that returns the list
  - the list then can be accessed in the server pages
    - can be looped using JSTL

  - take a look at the following two classes

  ```java
    public class Course {
      private String courseprefix = "";
      private String coursenumber = "";
      private String coursename = "";
      private int minhours = 0;
      private int maxhours = 0;
      private boolean project = false;

      public Course(String courseprefix, String coursenumber, String coursename, int minhours, int maxhours, boolean project) {
        this.courseprefix = courseprefix;
        this.coursenumber = coursenumber;
        this.coursename = coursename;
        ...
      }
    }

    public class CourseArray {
      Courses [] courses;

      public CourseArray () {
        courses = new Course[3];
        ... // put three made-up course objects in the array
      }

      public Course [] getCourses() {
        return courses;
      }
    }
  ```
- **Setting Up the ArrayList **
  - the ArrayList object is created and added to the session as attribute in the servlet
-
### Preloading Entity Objects
- how to automatically create session objects if they don't exist
- session objects are created in servlets, it's our job to make sure that this servlet is get called when the user first enters the site

```java
  HttpSession session = request.getSession();
  if (session.getAttribte("coursearray") == null) {
    CourseArray courses = new CourseArray();
    session.setAttribute("coursearray", courses)
  }
```

- user enters the site -- `index.html`
  - home page redirects to the servlet
  - checks the session to see if an object exists
  - if the object doesn't exist then an object is created in the session
  - user is redirected back to home page
  - note that this is all back-end process

- We can use the `redirect` JSTL tag for redirection
- This is best practiced in the conditional if tag to check if the object already exists in the session.
  ```html
  <c:if test="${empty coursearray}">
    <c:redirect url="GetCourseArrayServlet"/>
  </c:if>
  ```
- Here, we simply first check to see if `coursearray` object already exist, if not then we redirect to `GetCourseArrayServlet` servlet to create a new session object

### Selecting from Lists
- We use `type="hidden"` form element to pass form data that the user doesn't set directly, eg. passing data when selecting the button.
- `<input type="hidden" value="somevalue"/>`
  ```html
  <c:forEach var="courses" items="${coursearray.courses}">
    <tr>
      <td>${course.courseprefix} ${course.coursenumber}</td>
      <td>
        <form action="GetCourseServlet">
          <input type="submit" value="Details"/> <!--this can be seen in the table-->
          <input type="Hidden" name="prefix" value="${course.courseprefix}"/> <!--this can not be seen in the table-->
          <input type="hidden" name="number" value="$course.coursenumber"/>
        </form>
      </td>
    </tr>

  </c:forEach>
  ```
- The efficient method for `hidden` tag is using the link
- Instead of buttons, we can append the data in the link
- Here, when selecting the link we append course prefix and number to the request url
  ```HTML
  <c:forEach var="course" items="${coursearray.courses}">
    <li>
      <a href='GetCourseServlet?prefix=${course.courseprefix}&number=${course.coursenumber}'>
        ${course.courseprefix} ${course.coursenumber}
      </a>
    </li>
  </c:forEach>
  ```

### Dynamic Lists and Shopping Carts
- ArrayList class
  ```
  import java.util.*;

    ArrayList<type> a = new ArrayList();

    public void set(index, object);

    public Object get(index);

    public int size();

    // OutOfBounceException

    public void add(object);

    public void add(index, object); // shifts to right

    public object remove(index);

    public object remove(object);
  ```

### Displaying Shopping Carts

---

## Inout Validation and Error Pages

### Validation Concepts
  - Error
    - detection
    - correction
    - prevention







### Validation and the MVC Architecture
### Displaying Error Messages

- Create a ErrorList model class
  -  it should have all the scenarios of error validation set to `false`
  - create getter and setters for each scenarios

  ```java
    // A model class to handle all the Errors
    public class RacketErrorList {
      private boolean NameMissing = false;
      private boolean priceNotNumeric = false;
      private boolean priceNegative = false;
      ...
      // getters
      // setters
    }
  ```

- Create a Error validation model class (eg. RacketValidation) that contains static methods to handle the errors

  ```java
    // methods to handle the errors
    public class RacketValidation {
      public static boolean validateName(String name, RacketErrorList errors){
        // validation code
        ...
      }
    }
  ```

- Now, on the servlet, create a new error object and pass it to each validation method

    ```java

      RacketErrorList errors =  new RacketErrorList();

      boolean isNameValid =  RacketValidation.validateName(name, errors);
    ```

- Finally, pass the errors object to JSP

  ```java
    request.setAttribute("errors", errors);
  ```  

- Now, this errors object can be used in JSP to check all the scenarios of validation defined in the ErrorList model class.

  ```html
    price: <input type="text" name="name" value="${param.price}"/>
    <c:if test="${errors.priceNotNumeric}">
      Racket price must be a positive number.
    </c:if>
    <c:if test="${errors.weightNegative}">
      Weight should not be negative.
    </c:if>
  ```


  - - [ ] Validating Required Fields
  - - [ ] Validating Numeric Fields

### Validation Using Regular Expression
- characters must match exactly
  - `a` only matches `a`

- `.` matches any single character eg. `a`, `Z`, `7` etc.

- specialized characters can be escaped using backslah
  - `\.` is a period

- `[]` includes matches that are allowed
  - `[aeiou]` matches any vowel

- `^` lists the characters that are not allowed
  - `[^aeiou]` matches only non-vowel

- `-` ranges of characters
  - `[a-z]` allows all lowercase character

- can combine multiple ranges
  - `[a-f2-6]` matches any character btween **a to f** and any number between **2 to 6**

- `\d` : any digits 0-9

- `\w` : "word" character `a-z, A-Z, 0-9`

- `\s` : space character ` , tab, return`

- `\D` : non-digit

- `\W` : non-"word" character

- `\s` : non-"space" character

- If `P` and `Q` are regular expression:
  - `PQ` : Regex `P` and `Q` must occur in sequence
    - eg. **1a** matches `\d\w`
  - `P|Q` : regex `P` OR `Q`
    - eg. **A or 1** matches `\d|\w`
  - `()` used to group expressions
    - eg. `(\d\d|\s)` matches either 2 digits in a row or a space

- `P*` : `P` can occur any number of time including 0
- `P+` : P mist occur at least once
- `P{i}` : `P` must occur exactly *i* times
- `P{i, j}` : `P` must occur between `i` and `j` times

- Examples
  - Credit card number: `\d{15,16}`
  - Phone Number: `\d{3} - \d{3}-\d{4}`
  - Email: `\w+@\w+(\.\w+)+`


### Echoing Fields Values
  ```HTML
    <input type="text" name="name" value="${param.name}"/>
  ```



---

## Database Manipulation

### Intro to server-side database

### Database Servers

### Intro to JDBC

### JDBC Queries

  ```java
  public class RacketList {
    public  static void loadRacket () {
      Connection connection = null;
      Statement statement = null;
      ResultSet results = null;

      try {
        // load the database driver
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();

        // connect to the database using the driver
        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/DBname", "app", "app");
      }
      catch (SQLException ex) {
        System.out.println("Connection failed");
      }
      catch (Exception ex) {
        System.out.println("No Driver!")
      }

      try {
        // create a statement from the connection
        statement = connection.createStatement();
        // get all the records from the database  
        results = statement.executeQuery( "select * from RacketList" );
        while ( results.next() ) {
          String name = results.getString("name");
          Double price = results.getDouble("price");
          Int size = results.getInt("size");
          ...
          Racket r = new Racket(name, price, size, ... );

          rackets.add(r);
        }
      }
      catch (SQLException ex) {

      }
    }
  }
  ```

### Parameterized SQL and Prepared Statements

  ```JAVA
    public class RacketList {
        public static void saveCourse ( String name, Double price, Int size ) {
            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet results = null;

            try {
                // load the database driver
                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();

                // connect to the database using the driver
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/DBname", "app", "app");
            }
            catch (SQLException ex) {

            }
            catch (Exceptino ex) {

            }

            try {
                // create a template to insert data into database
                // use ? in place of actual values
                String template = "insert into Rackets " + "(brand, family, version, price, ...) " + "values (?, ?, ?, ?, ...)";

                // pass the template to database Server
                statement = connection.prepareStatement(template);

                // replace the ? with actual values
                statement.setString(1, brand);
                statement.setString(2, number);
                statement.setDobule(4, prce);
                ...

                // execute the final sql statement on database
                statement.executeUpdate();
            }
            catch (SQLException) {

            }
            catch (Exceptino) {

            }

      }
    }
  ```

  ```JAVA
    public class RacketValidation {
        public void validateRacket(String id) {
            
        }
    }

  ```



















---
