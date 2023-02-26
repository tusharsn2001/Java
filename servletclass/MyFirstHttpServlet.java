package servletclass;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class MyFirstHttpServlet extends HttpServlet
{
   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse res)
   throws IOException, ServletException
  {
     res.setContentType("text/html");
     PrintWriter out = res.getWriter();
     out.println("<html><body bgcolor='red'>");
     out.println("Hello And Welcome");
     out.println("</body></html>");
  }
}