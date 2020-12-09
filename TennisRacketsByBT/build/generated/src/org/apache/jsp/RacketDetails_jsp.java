package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RacketDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/SiteNav.html");
    _jspx_dependants.add("/Footer.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"template.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!--<div id=\"page\">-->\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("<div id=\"header-inner\">\t\n");
      out.write("\t\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\t<h1><a href=\"#\">Bikash<span>Tennis</span></a></h1>\n");
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
      out.write("</header>\n");
      out.write("    <div class=\"feature\">\n");
      out.write("\t\t\t\t<div class=\"feature-inner\">\n");
      out.write("\t\t\t\t<h1>Tennis Rackets by Bikash</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("<!--</div>-->");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"content-inner\">\n");
      out.write("                <main id=\"contentbar\">\n");
      out.write("                <div class=\"article\">     \n");
      out.write("                    <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" weidth=\"500\" height=\"500\">\n");
      out.write("                    <h2><a href=\"Cart?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Add to Cart</a></h2>\n");
      out.write("                    <div id=\"footerblurb\">\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Brand</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.brandName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\t\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Family</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.familyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Version</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.versionName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\t\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Price</span></h2>\n");
      out.write("                            <p>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Head Size</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.headSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" sq.inch</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Weight</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" lbs.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>String Pattern</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.stringPattern}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" main vs. cross</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <h2><span>Description</span></h2>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentRacket.versionDesc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clr\"></div>\n");
      out.write("                </div>\n");
      out.write("                </main>\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    ");
      out.write("<div id=\"content\">\n");
      out.write("    <div id=\"content-inner\">\n");
      out.write("    \n");
      out.write("    <nav id=\"sidebar\">\n");
      out.write("        <div class=\"widget\">\n");
      out.write("            <h3>Site Navigation</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Home\">Home</a></li>\n");
      out.write("                    <li><a href=\"Inventory\">Inventory</a></li>\n");
      out.write("                    <li><a href=\"#\">My Account</a></li>\n");
      out.write("                    <li><a href=\"Cart.jsp\">Cart</a></li>\n");
      out.write("                    <li><a href=\"NewRacket.jsp\">Add New</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    ");
      out.write("<!--<div id=\"page\">-->\n");
      out.write("    \n");
      out.write("    <div id=\"footerblurb\">\n");
      out.write("\t\t\t\t<div id=\"footerblurb-inner\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"column\">\n");
      out.write("\t\t\t\t\t\t<h2><span>Tennis Lesson</span></h2>\n");
      out.write("                                                <p>Sign Up for weekly tennis lessons that will take you from beginner to professionals!</p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"column\">\n");
      out.write("\t\t\t\t\t\t<h2><span>Rackets Guide</span></h2>\n");
      out.write("\t\t\t\t\t\t<p>Check out our free rackets buying guide that will help you find the best racket!</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"column\">\n");
      out.write("\t\t\t\t\t\t<h2><span>Newsletter</span></h2>\n");
      out.write("\t\t\t\t\t\t<p>Sign Up for the Daily newsletter!</p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clr\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("<footer id=\"footer\">\n");
      out.write("\t\t\t\t<div id=\"footer-inner\">\n");
      out.write("\t\t\t\t\t<p>&copy; Copyright <a href=\"#\">Bikash Tennis 2020</a> &#124; <a href=\"#\">Terms of Use</a> &#124; <a href=\"#\">Privacy Policy</a></p>\n");
      out.write("\t\t\t\t\t<div class=\"clr\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("<!--</div>-->");
      out.write("\n");
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
