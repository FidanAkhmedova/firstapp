package src.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "BasicServlet", urlPatterns = "/basic_servlet")
public class BasicServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(BasicServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");
        resp.getWriter().write("New GET request");
    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        logger.info("New POST request");
//        resp.getWriter().printf("<h1>New POST request</h1>");
//    }
}
