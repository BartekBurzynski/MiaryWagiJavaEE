package pl.bb.measureconverter.servlet;

import pl.bb.measureconverter.service.WeightConversionService;


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
        WeightConversionService weightConversionService = new WeightConversionService();


        String kilograms = request.getParameter("kilograms");
        String grams = request.getParameter("grams");
        String miligrams = request.getParameter("miligrams");


        if (grams.equals("") && miligrams.equals("")) {
            grams = String.valueOf(weightConversionService.kilogramsToGR(kilograms));
            miligrams = String.valueOf(weightConversionService.kilogramsToMG(kilograms));
        } else if (kilograms.equals("") && miligrams.equals("")) {
            kilograms = String.valueOf(weightConversionService.gramToKG(grams));
            miligrams = String.valueOf(weightConversionService.gramToMG(grams));
        } else if (kilograms.equals("") && grams.equals("")) {
            kilograms = String.valueOf(weightConversionService.miligramToKG(miligrams));
            grams = String.valueOf(weightConversionService.miligramToGR(miligrams));
        } else {
            writer.println("Prosze podać tylko jedną wartość");
        }
        writer.println("Podana wartoścć po przeliczeniu na: <br />");
        writer.println("kilogramy: " + kilograms);
        writer.println("gramy: " + grams);
        writer.println("miligeramy: " + miligrams);

    }
}
