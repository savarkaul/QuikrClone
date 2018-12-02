<%-- 
    Document   : phones
    Created on : 27 Nov, 2018, 10:33:16 AM
    Author     : kauls
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width-device-width, initial-scale-1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>Portfolio</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
		<style>
                    table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
			.gallery{
    box-sizing: border-box;
    
}
 .column {
    
    width: 430px;
    height: 600px;
    padding: 5px;
}

.row::after {
    content: "";
	
    clear: both;
    display: table;
}

.flex-container {
    display: flex;
    flex-wrap: wrap;
  }
  .w3-modal{z-index:3;display:none;padding-top:100px;position:fixed;left:0;top:0;width:100%;height:100%;overflow:auto;background-color:rgb(0,0,0);background-color:rgba(0,0,0,0.4)}
.w3-modal-content{margin:auto;background-color:#fff;position:relative;padding:0;outline:0;width:600px}
.w3-card-4,.w3-hover-shadow:hover{box-shadow:0 4px 10px 0 rgba(0,0,0,0.2),0 4px 20px 0 rgba(0,0,0,0.19)}
.w3-teal,.w3-hover-teal:hover{color:#fff!important;background-color:#009688!important}
.w3-container:after,.w3-container:before,.w3-panel:after,.w3-panel:before,.w3-row:after,.w3-row:before,.w3-row-padding:after,.w3-row-padding:before,
.w3-cell-row:before,.w3-cell-row:after,.w3-clear:after,.w3-clear:before,.w3-bar:before,.w3-bar:after{content:"";display:table;clear:both}
.w3-display-topright{position:absolute;right:0;top:0}

			.gallery{
    box-sizing: border-box;
    
}
 .column {
    width: 430px;
    height: 550px;
    padding: 5px;
}

.row::after {
    content: "";
	
    clear: both;
    display: table;
}

.flex-container {
    display: flex;
    flex-wrap: wrap;
  }
		</style>
    </head>
    <body>
	 <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quikr?useSSL=false","root","Mrigya7838");
            String cat="Phone";
            String query1="select item_name,price, location from buy_item where category="+'"'+cat+'"';
            PreparedStatement pstmt=conn.prepareStatement(query1);
            ResultSet rs=pstmt.executeQuery();
        int i=0;%>
	 <div class="gallery" id = "gallery">
                <div class="flex-container">
                    <% while(rs.next())
            {
                i++;
              %>
                            <div class="column">
                        <button onclick="document.getElementById('id<%=i%>').style.display='block'" id="p<%=i%>"><img src="images/phones/p<%=i%>.jpg" alt="satellite" ></button>
                        <div id="id<%=i%>" class="w3-modal">
                        <div class="w3-modal-content w3-card-4">
                        <header class="w3-container w3-teal"> 
                        <span onclick="document.getElementById('id<%=i%>').style.display='none'" 
                        class="w3-button w3-display-topright">&times;</span>
                        <h2>Information</h2>
                        </header>
                        <div class="w3-container">
               <table>
               <tr>
                <th>Item Name</th>
                <td><%=rs.getString(1)%></td>
                </tr>
                
  <tr>
    <th>Price</th>
    <td><%=rs.getString(2)%></td>
  </tr>
  <tr>
    <th>Location</th>
    <td><%=rs.getString(3)%></td>
  </tr>
  </table>
  <footer class="w3-container w3-teal">
        <p>Buy Now</p>
      </footer>
  </div>
                        </div>
                        </div>
</div>
  <% }%>
                </div>
            </div>
 
 </body>
 </html>