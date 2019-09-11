package pl.bb.javastart.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/miary")
public class MeasureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Calc calc = new Calc();

        String meters = request.getParameter("meters");
        String centimeters = request.getParameter("centimeters");
        String millimeters = request.getParameter("millimeters");


        if (centimeters.equals("") && millimeters.equals("")) {
            centimeters = calc.metersToCM(meters);
            millimeters = calc.metersToMM(meters);
        } else if (centimeters.equals("") && meters.equals("")) {
            centimeters = String.valueOf(calc.millimetersToCM(millimeters));
            meters = String.valueOf(calc.millimetersToME(millimeters));
        } else if (meters.equals("") && millimeters.equals("")) {
            meters = String.valueOf(calc.centimetersToME(centimeters));
            millimeters = String.valueOf(calc.centimetersToMM(centimeters));
        } else {
            writer.println("Prosze podać tylko jedną wartość");
        }
        writer.println("Podana wartoścć po przeliczeniu na: <br />");
        writer.println("metry: " + meters);
        writer.println("centymetry: " + centimeters);
        writer.println("milimetry: " + millimeters);

    }
}
