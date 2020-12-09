package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.html");
    _jspx_dependants.add("/Footer.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Warehouse | Tennis Rackets by BT</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"template.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        if(session.getAttribute("login") == null){
            response.sendRedirect("Restricted.jsp");
        }
        
      out.write("\n");
      out.write("        ");
      out.write("<!--<div id=\"page\">-->\n");
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
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
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
      out.write("\t\t\t\t\t<p>&copy; Copyright <a href=\"#\">Your Site</a> &#124; <a href=\"#\">Terms of Use</a> &#124; <a href=\"#\">Privacy Policy</a></p>\n");
      out.write("\t\t\t\t\t<div class=\"clr\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("<!--</div>-->");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("\n");
      out.write("-->");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("/DisplayMain.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
