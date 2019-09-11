package pl.bb.javastart.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/wagi")
public class WeighServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Calc calc = new Calc();


        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");


        if (grams.equals("") && miligrams.equals("")) {
            grams = String.valueOf(calc.kilogramsToGR(kilograms));
            miligrams = String.valueOf(calc.kilogramsToMG(kilograms));
        } else if (kilograms.equals("") && miligrams.equals("")) {
            kilograms = String.valueOf(calc.gramToKG(grams));
            miligrams = String.valueOf(calc.gramToMG(grams));
        } else if (kilograms.equals("") && grams.equals("")) {
            kilograms = String.valueOf(calc.miligramToKG(miligrams));
            grams = String.valueOf(calc.miligramToGR(miligrams));
        } else {
            writer.println("Prosze podać tylko jedną wartość");
        }
        writer.println("Podana wartoścć po przeliczeniu na: <br />");
        writer.println("kilogramy: " + kilograms);
        writer.println("gramy: " + grams);
        writer.println("miligeramy: " + miligrams);

    }
}
