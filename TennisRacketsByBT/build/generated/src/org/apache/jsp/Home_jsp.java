package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Tennis Rackets by BT</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"template.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        ");
      out.write("<header id=\"header\">\n");
      out.write("<div id=\"header-inner\">\t\n");
      out.write("\t\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\t<h1><a href=\"#\">Cool<span>Logo</span></a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"top-nav\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Help</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clr\"></div>\n");
      out.write("</div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    ");

        if (session.getAttribute("login") == null){
            response.sendRedirect("Restricted.jsp");
        }
    
      out.write("\n");
      out.write("            <h2>Welcome to the home of Tennis Rackets!</h2>\n");
      out.write("            <form action=\"Display\" method=\"get\">\n");
      out.write("                <input type=\"submit\" value=\"Click to go to Warehouse\"/>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <h3>Add new Racket:</h3>\n");
      out.write("            <form action=\"Display\" method=\"get\">\n");
      out.write("                <p>Brand:</p>\n");
      out.write("                <input type=\"text\" name=\"brand\" required/>\n");
      out.write("                <p>Family:</p>\n");
      out.write("                <input type=\"text\" name=\"family\" required/>\n");
      out.write("                <p>Version:</p>\n");
      out.write("                <input type=\"text\" name=\"version\" required/>\n");
      out.write("                <p>Price(USD):</p>\n");
      out.write("                <input type=\"text\" name=\"price\" required/>\n");
      out.write("                <p>Head Size(sq. in.):</p>\n");
      out.write("                <input type=\"text\" name=\"size\" required/>\n");
      out.write("                <p>Weight(lbs.):</p>\n");
      out.write("                <input type=\"text\" name=\"weight\" required/>\n");
      out.write("                <p>String Pattern</p>\n");
      out.write("                <input type=\"text\" name=\"pattern\" required/>\n");
      out.write("                <p>Description:</p>\n");
      out.write("                \n");
      out.write("                <textarea  name=\"description\" required  rows=\"5\" cols=\"30\">Enter racket description here ....</textarea>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"Add New Racket\"/>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
