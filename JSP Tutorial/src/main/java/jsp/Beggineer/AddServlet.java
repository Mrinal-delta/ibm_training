package jsp.Beggineer;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;//handles servlet exception
import jakarta.servlet.http.HttpServlet;
//the following import is done for the sake of creating request and response object which will be done by tomcat server
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		//the req object is used for fetching data from the client and res object used for sending response to the client
		int i = Integer.parseInt(req.getParameter("num1"));//gets the first number from the webpage with name num1
		int j = Integer.parseInt(req.getParameter("num2"));//gets the second number from the webpage with name num2
		
		//adding the two numbers
		int k = i+j;
		//upuntil now nothing will happen we have to configure the web.xml file to actually get response from the website

		//to print the sum
		res.getWriter().println("The sum is "+ k);
		
		
		//sending the data through req object
		req.setAttribute("k", k);
		
		//to call a servlet there are two ways Request Dispatcher and Redirect
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}
}
/*
 * req.getParameter("num1"); will fetch a string value so Integer.parseInt(req.getParameter("num1")) is done
 */