package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class sports_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width, initial-scale-1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Portfolio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t\t<style>\n");
      out.write("                    table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write("\t\t\t.gallery{\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(" .column {\n");
      out.write("    \n");
      out.write("    width: 430px;\n");
      out.write("    height: 600px;\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row::after {\n");
      out.write("    content: \"\";\n");
      out.write("\t\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flex-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("  }\n");
      out.write("  .w3-modal{z-index:3;display:none;padding-top:100px;position:fixed;left:0;top:0;width:100%;height:100%;overflow:auto;background-color:rgb(0,0,0);background-color:rgba(0,0,0,0.4)}\n");
      out.write(".w3-modal-content{margin:auto;background-color:#fff;position:relative;padding:0;outline:0;width:600px}\n");
      out.write(".w3-card-4,.w3-hover-shadow:hover{box-shadow:0 4px 10px 0 rgba(0,0,0,0.2),0 4px 20px 0 rgba(0,0,0,0.19)}\n");
      out.write(".w3-teal,.w3-hover-teal:hover{color:#fff!important;background-color:#009688!important}\n");
      out.write(".w3-container:after,.w3-container:before,.w3-panel:after,.w3-panel:before,.w3-row:after,.w3-row:before,.w3-row-padding:after,.w3-row-padding:before,\n");
      out.write(".w3-cell-row:before,.w3-cell-row:after,.w3-clear:after,.w3-clear:before,.w3-bar:before,.w3-bar:after{content:\"\";display:table;clear:both}\n");
      out.write(".w3-display-topright{position:absolute;right:0;top:0}\n");
      out.write("\n");
      out.write("\t\t\t.gallery{\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(" .column {\n");
      out.write("   width: 430px;\n");
      out.write("    height: 550px;\n");
      out.write("    padding: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row::after {\n");
      out.write("    content: \"\";\n");
      out.write("\t\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flex-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("  }\n");
      out.write("\t\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t  ");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quikr?useSSL=false","root","Mrigya7838");
            String cat="Sport";
            String query1="select item_name,price, location from buy_item where category="+'"'+cat+'"';
            PreparedStatement pstmt=conn.prepareStatement(query1);
            ResultSet rs=pstmt.executeQuery();
        int i=0;
      out.write("\n");
      out.write("\t <div class=\"gallery\" id = \"gallery\">\n");
      out.write("                <div class=\"flex-container\">\n");
      out.write("                    ");
 while(rs.next())
            {
                i++;
              
      out.write("\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                        <button onclick=\"document.getElementById('id");
      out.print(i);
      out.write("').style.display='block'\" id=\"t");
      out.print(i);
      out.write("\"><img src=\"images/sports/t");
      out.print(i);
      out.write(".jpg\" alt=\"satellite\" ></button>\n");
      out.write("                        <div id=\"id");
      out.print(i);
      out.write("\" class=\"w3-modal\">\n");
      out.write("                        <div class=\"w3-modal-content w3-card-4\">\n");
      out.write("                        <header class=\"w3-container w3-teal\"> \n");
      out.write("                        <span onclick=\"document.getElementById('id");
      out.print(i);
      out.write("').style.display='none'\" \n");
      out.write("                        class=\"w3-button w3-display-topright\">&times;</span>\n");
      out.write("                        <h2>Information</h2>\n");
      out.write("                        </header>\n");
      out.write("                        <div class=\"w3-container\">\n");
      out.write("               <table>\n");
      out.write("               <tr>\n");
      out.write("                <th>Item Name</th>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("  <tr>\n");
      out.write("    <th>Price</th>\n");
      out.write("    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Location</th>\n");
      out.write("    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  </table>\n");
      out.write("  <footer class=\"w3-container w3-teal\">\n");
      out.write("        <p>Buy Now</p>\n");
      out.write("      </footer>\n");
      out.write("  </div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("</div>\n");
      out.write("  ");
 }
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" </body>\n");
      out.write(" </html>");
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
