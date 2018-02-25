import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tekst")
public class TekstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nasztekst = request.getParameter("nasztekst");
        String[] wyrazy=nasztekst.split(" ");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.print(nasztekst);
        writer.print("Ilość słów: "+wyrazy.length);

        int ileZnakow=nasztekst.length();
        writer.print("Ilość znaków: "+ileZnakow);

        String replace = nasztekst.replace(" ",""); //usuwa spacje
        int ileZnakowCzarnych=replace.length();   // liczy czarne zanki
        writer.print("Ilość czarnych znaków to "+ ileZnakowCzarnych);
    }
}
