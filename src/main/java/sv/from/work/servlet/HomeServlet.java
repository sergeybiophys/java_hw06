package sv.from.work.servlet;

import sv.from.work.db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeServlet extends HttpServlet {
    /*@Override
    public void init(ServletConfig config) throws ServletException {
        //super.init(config);
        System.out.println("Init HomeServlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Handle request");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        String idHeader = "ID ";
        String userNameHeader = "User Name";
        String emailHeader = "E-mail";
        String ageHeader = "Age";

       stringBuilder.append("<div style=\""+"display: flex; flex: wrap;  width: 60%; margin: 0 auto; background-color: grey; height: 35px; justify-content: space-around;\""+">");
            stringBuilder.append("<div style=\""+"color:black; margin-right: 10px; \""+">"+idHeader+"</div>");


            stringBuilder.append("<div>"+userNameHeader+"</div>");
            stringBuilder.append("<div>"+emailHeader+"</div>");
            stringBuilder.append("<div>"+ageHeader+"</div>");

        stringBuilder.append("</div>");
        //--------------------------------------------------------------------------------------------------------------


        try{
            ResultSet resultSet = Connection.GetAll();
            while (resultSet.next()) {
                System.out.println("iamhere");
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                System.out.printf("%3d | %-20s | %-20s | %-4d%n" , id, name, email,age);

                stringBuilder.append("<div style=\""+"display: flex; flex: wrap; width: 60%; margin: 0 auto; margin-top: 20px;  background-color: white; height: 35px; justify-content: space-around; border: 1px solid lightblue;\""+">");
                stringBuilder.append("<div style=\""+"color:red; margin-right: 10px; \""+">"+id+"</div>");
                stringBuilder.append("<div>"+name+"</div>");
                stringBuilder.append("<div>"+email+"</div>");
                stringBuilder.append("<div>"+age+"</div>");

                stringBuilder.append("</div>");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        PrintWriter writer = resp.getWriter();
        writer.println(stringBuilder.toString());
    }

    @Override
    public void destroy() {
        System.out.println("Destroy HomeServlet");
    }*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder stringBuilder = new StringBuilder();

        try{
            ResultSet resultSet = DbConnection.GetAll();
            while(resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                Integer age = resultSet.getInt("age");
                System.out.printf("%3d | %-20s | %-20s | %-3d%n" , id, name, email,age);

                stringBuilder.append("<div style=\""+"display: flex; flex: wrap; width: 60%; margin: 0 auto; margin-top: 20px;  background-color: white; height: 35px; justify-content: space-around; border: 1px solid lightblue;\""+">");
                stringBuilder.append("<div style=\""+"color:red; margin-right: 10px; \""+">"+id+"</div>");
                stringBuilder.append("<div>"+name+"</div>");
                stringBuilder.append("<div>"+email+"</div>");
                stringBuilder.append("<div>"+age+"</div>");
                stringBuilder.append("</div>");

            }
        }catch(SQLException e)
        {
            e.getErrorCode();
        }


        req.setAttribute("htmlString", stringBuilder);
        req.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String firstname = req.getParameter("username");
        //String lastname = req.getParameter("email");
        //String groupname = request.getParameter("group");
        //Student student = new Student(firstname, lastname, groupname);
        //DataBase.CreateStudent(student);
        //resp.sendRedirect("/");
    }
}
