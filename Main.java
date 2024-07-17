import javax.servlet.*;
import javax.servlet.http.*;

public class Main extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Compute Loan Payment</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p><label>Loan Amount</label>");
        out.println("<input type = 'text' name = 'loanAmt' size = '20'/>");
        out.println("<label>Annual Interest Rate</label>");
        out.println("<input type = 'text' name = 'loanAmt' size = '10'/>");
        out.println("<label>Number of Years</label>");
        out.println("<input type = 'text' name = 'loanAmt' size = '2'/><p>");
        out.println("<button>Compute Loan Payment</Button>");
        out.println("<button>Reset</Button>");
        out.println("</body>");
        out.println("</html>"); 

    }
}
