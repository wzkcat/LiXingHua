import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	String info=req.getParameter("info");
	PrintWriter out=resp.getWriter();
	out.write("<html>");
	out.write("<head><title>Êä³ö</title></head>");
	out.write("<body>");
	out.write("<h1>"+info+"</h1>");
	out.write("</body>");
	out.write("</html>");
}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
