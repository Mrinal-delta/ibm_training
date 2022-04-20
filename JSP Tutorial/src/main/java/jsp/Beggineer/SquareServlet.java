package jsp.Beggineer;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k = (int)req.getAttribute("k");//getting data through request object
		k = (int)Math.pow(k, 2);
		res.getWriter().println("Hello to Square servlet");
		res.getWriter().println("The square of the sum is:"+k);
	}
}
