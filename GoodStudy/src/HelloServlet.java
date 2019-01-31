import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.write("<html>");
		out.write("<head><title>JDK</title></head>");
		out.write("<body><h1>Hello JDKServletError!!!</H1></body>");
		out.write("</html>");
	}
}
