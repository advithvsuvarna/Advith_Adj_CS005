
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/primeServlet")
public class primeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Step 1: Get the number from request
        String numStr = request.getParameter("number");

        out.println("<html><body>");
        try {
            int number = Integer.parseInt(numStr);

            // Step 2: Check for prime
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Step 3: Display the result
            if (isPrime)
                out.println("<h2 style='color:green'>" + number + " is a Prime Number.</h2>");
            else
                out.println("<h2 style='color:red'>" + number + " is Not a Prime Number.</h2>");

        } catch (NumberFormatException e) {
            out.println("<h3>Invalid number entered. Please enter a valid integer.</h3>");
        }

        out.println("</body></html>");
    }
}
