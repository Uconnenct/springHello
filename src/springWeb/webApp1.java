package springWeb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class webApp1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		//tri.draw();
		RequestDispatcher view= req.getRequestDispatcher("WEB-INF/htmls/hello.jsp");
		view.forward(req, resp);
		//resp.getWriter().println("Testing My Tomcat ...");
	}
}
