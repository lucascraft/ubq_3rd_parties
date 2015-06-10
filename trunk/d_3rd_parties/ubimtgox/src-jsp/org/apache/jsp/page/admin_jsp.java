package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      			"erreur.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n\n\n<html>\n\t<head>\n\t\t<title>Admin</title>\n\t</head>\n\n <body>\n\t<head>\n\t\t<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>\n\t\t<meta charset=\"utf-8\">\n\t\t<link href=\"../page/css3_menu_demo/style.css\" media=\"screen\"  rel=\"stylesheet\" type=\"text/css\" />\n\t\t<link href=\"../page/css3_menu_demo/iconic.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n\t\t<script src=\"../page/css3_menu_demo/prefix-free.js\"></script>\n\t</head>\n\t<div class=\"wrap\">\n\t<nav>\n\t\t<ul class=\"menu\">\n\t\t\t<li><a href=\"/\"><span class=\"iconic home\"></span> Home</a></li>\n\t\t\t<li><a href=\"../page/market.jsp\"><span class=\"iconic plus-alt\"></span> MtGox</a></li>\n\t\t\t<li><a href=\"../page/robots.jsp\"><span class=\"iconic clock\"></span> Robots</a></li>\n\t\t\t<li><a href=\"../page/notifications.jsp\"><span class=\"iconic bolt\"></span> Notifications</a></li>\n\t\t\t<li><a href=\"../page/wallet.jsp\"><span class=\"iconic locked\"></span> Wallet</a></li>\n\t\t\t<li><a href=\"../page/admin.jsp\"><span class=\"iconic book\"></span> Admin</a></li>\n");
      out.write("\t\t\t<li><a href=\"../page/security.jsp\"><span class=\"iconic key\"></span> Security</a></li>\n\t\t\t<!--<li><a href=\"../page/contact.jsp\"><span class=\"iconic mail\"></span> Contact</a></li>-->\n\t\t</ul>\n\t\t<div class=\"clearfix\"></div>\n\t</nav>\n\t</div>\n </body>\n</html>");
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
