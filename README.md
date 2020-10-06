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

####IDE
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
	- ``<%   -----  %>```
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
```
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


### Lesson 4. Entity Classes and JSTL

##Entity Classes
**Java Classes or Java Beans**
With properties or attributes or member variables that can be gettable/settable
These properties should not be named after SQL reserved words if using the SQL database
Each member should have getter and setter method

```Java
public double getPrinciple () {
  return principle;
public double setPrinciple (double apr) {
  this.apr = apr
}
}
```
