package sv.from.work.servlet;

import sv.from.work.db.DbConnection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddFormServlet extends HttpServlet {
  /*  @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().println("<div style=\""+"display: flex; width: 15%; margin: 0 auto; margin-top: 30px; background-color: lightblue; \""+">" +
                "<form method='post' action='/add'>" +
                "<label>UserName: <input style=\""+"margin-top: 30px; \"" +"name='username'/></label><br/>" +
                "<label>E-mail: <input style=\""+"margin-left:25px; \"" + "name='email' type='email'/></label><br/>" +
                "<label>Age: <input style=\""+"margin-left:42px; \"" + "name='age' type='number'/></label><br/>" +
                "<input value='ADD-USER' style=\""+"margin-left:65px; margin-top: 30px; height: 30px; width: 100px \"" +"type='submit'/>" +
                "</form>" +
                "</div>");

        Enumeration<String> parameterNames = req.getParameterNames();
        if(parameterNames.hasMoreElements())
        {
            Connection.CreateUser(req.getParameter("username"), req.getParameter("email"),Integer.parseInt(req.getParameter("age")));
        }

    }*/
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      request.getRequestDispatcher("/WEB-INF/pages/add.jsp").forward(request, response);
  }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Integer groupId = Integer.parseInt(request.getParameter("group"));
        //Student student = new Student(firstname, lastname, groupname);
        DbConnection.createUser(username,email,age,groupId);
        response.sendRedirect("/home");
    }

}
