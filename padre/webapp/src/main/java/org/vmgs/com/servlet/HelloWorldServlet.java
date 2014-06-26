package org.vmgs.com.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import org.vmgs.com.libreria.HelloWorldService;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HelloWorldService helloWorldService = new HelloWorldService();
        response.getWriter().println(helloWorldService.sayHello());
		//response.getWriter().println("Hola te saludo");
    }
}
