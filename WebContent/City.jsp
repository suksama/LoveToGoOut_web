<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Setting.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  <script language="javascript">
	
	function changeweb3(){
		document.getElementById("myframe").setAttribute("src","managerRegister.jsp");
	}
</script>
  <body>
     <td width="70%" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              
              <tr>
                <td background="images/index1_45.gif"></td>
                <td bgcolor="#FFFFFF" style="height:490px; vertical-align:top;">
                  <table width="100%" border="0" cellspacing="10" cellpadding="0">
                    <tr>
                      <td>
                        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#C4E7FB">
                          <tr>
                            <td>
                              <table width="100%" border="0" cellpadding="0" cellspacing="5" bgcolor="#FFFFFF">
                                
                              </table>
                            </td>
                          </tr>
                        </table>
                      </td>
                    </tr>
                    <tr>
                      <td>
                        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#BBD3EB">
                          <tr>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">&nbsp;</td>
                           
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">城市ID</td>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">城市名称</td>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">城市英文名</td>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">城市图片</td>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">所在位置</td>
                            <td height="27" align="center" background="images/index1_72.gif" bgcolor="#FFFFFF">操作</td>
                     <c:forEach items="${data2}" var="city">
                          <tr>
                            
                            <td height="26" align="center" bgcolor="#FFFFFF">
                              <label>
                              <input type="checkbox" name="checkbox" value="checkbox" />
                              </label>
                            </td>
                            <td height="26" align="center" bgcolor="#FFFFFF">${city.c_Id }</td>
                            <td height="26" align="center" bgcolor="#FFFFFF">${city.c_Name }</td>
                            <td height="26" align="center" bgcolor="#FFFFFF">${city.c_Ename }</td>
                            <td height="26" align="center" bgcolor="#FFFFFF">${city.c_Photo }</td>
                            <td height="26" align="center" bgcolor="#FFFFFF">${city.c_Localtion }</td>
                            <td height="26" align="center" bgcolor="#FFFFFF">
				<%-- /StudentManager --%> 
				<a href="/LoveToGoOut/ToUpdateCityServlet?c_Id=${city.c_Id}">修改</a>
                
							</td>
                           
                          </tr>
                       </c:forEach> 
                       
                        </table>
                      </td>
                    </tr>
                   
                    <tr>
                      <td><a href="#"><img src="images/index1_86.gif" width="74" height="31" border="0" /></a>&nbsp;<a href="#"><img src="images/index1_82.gif" width="74" height="31" border="0" /></a>&nbsp;<a href="#"><img src="images/index1_84.gif" width="74" height="31" border="0" /></a></td>
                    </tr>
                  </table>
				  
				 
                </td>

  </body>
</html>
