package session;


import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = { "/login" })
public class LoginSessionServlet extends HttpServlet {




        private static final long serialVersionUID = 1L;

        public LoginSessionServlet() {
        }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            ServletOutputStream out = response.getOutputStream();

            // Get HttpSession object
            HttpSession session = request.getSession();

            // Suppose a user has successfully logged.
            UserInfo loginedInfo = new UserInfo("Tom", "USA", 5);

            // Storing user information in an attribute of Session.
            session.setAttribute(Constants.SESSION_USER_KEY, loginedInfo);
            //in loc de cookie a folosit o constanta SESSION_USER_INFO,
            //obiectul loginedInfo a fost setat ca atribut avand ca si cheie SESSION_USER_INFO

            out.println("<html>");
            out.println("<head><title>Session example</title></head>");

            out.println("<body>");
            out.println("<h3>You are logined!, info stored in session</h3>");

            out.println("<a href='userInfo'>View User Info</a>");
            out.println("</body>");
            out.println("<html>");
        }

    }


