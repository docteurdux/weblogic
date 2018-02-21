package sandcastle.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import sandcastle.ejb.api.HelloSingleton;
import sandcastle.ejb.api.HelloStateful;
import sandcastle.ejb.api.HelloStateless;

@WebServlet("/helloworld/*")
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	private HelloStateless stateless;

	@EJB
	private HelloStateful stateful;

	@EJB
	private HelloSingleton singleton;

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		w.println(stateless.hello());
		w.println(stateful.hello());
		w.println(singleton.hello());
	};
}
