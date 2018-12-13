package ProjectBean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Project7Servlet")
public class Project7Servlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
	private int numDays;
	private int numHours;
	private int numMinutes;
	private String numSeconds;	
	
	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public int getNumHours() {
		return numHours;
	}

	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

	public int getNumMinutes() {
		return numMinutes;
	}

	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}

	public String getNumSeconds() {
		return numSeconds;
	}

	public void setNumSeconds(String numSeconds) {
		this.numSeconds = numSeconds;
	}
	
	public Project7Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	//JSP server 60 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("</html></body>");
			//out.println(request.getParameter("numSeconds"));
			int seconds = Integer.parseInt(request.getParameter("numSeconds"));
			out.println(seconds + " seconds converts to: ");
			
			
			numDays = seconds / 86400;
 			seconds = seconds % 86400;
			numHours = seconds / 3600;
			seconds = seconds % 3600;
			numMinutes = seconds / 60;
			seconds = seconds % 60;
			
			String output = "";
			if(numDays > 0)
			{
				output += Integer.toString(numDays) + " Days, ";
			}
			if(numHours > 0)
			{
				output += Integer.toString(numHours) + " Hours, ";
			}
			if(numMinutes > 0)
			{
				output += Integer.toString(numMinutes) + " Minutes, ";
			}
			if(seconds > 0)
			{
				output += Integer.toString(seconds) + " seconds";
			}
			out.println(output);
			
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

	}

}
