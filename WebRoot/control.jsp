<%@ page import="org.news.entity.NewsUser" %>
<%@ page import="org.news.dao.impl.NewsUserImpl" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>注册处理页面</title>
    </head>
    <body>
      <%
          request.setCharacterEncoding("UTF-8");
          String name = request.getParameter("userName");
          String pwd = request.getParameter("pwd");
          NewsUser newsUser = new NewsUser(name, pwd);
          int result = new NewsUserImpl().insert(newsUser);
          if (result > 0) {
              response.sendRedirect("login.jsp");
          } else {
               request.getRequestDispatcher("register.jsp")
                        .forward(request, response);
          }
      %>
    </body>
</html>
