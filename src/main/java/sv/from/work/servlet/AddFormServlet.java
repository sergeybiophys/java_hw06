package sv.from.work.servlet;

import sv.from.work.db.DbConnection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddFormServlet extends HttpServlet {

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
        DbConnection.createUser(username,email,age,groupId);
        response.sendRedirect("/home");
    }

}
