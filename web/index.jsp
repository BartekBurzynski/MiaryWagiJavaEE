<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11.09.2019
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
    <body>
        <h1>Przelicznik metryczny</h1>
            <form method="post" action="miary">
                <input type="text" placeholder="metry" name="meters"> <br/>
                <input type="text" placeholder="centymetry" name="centimeters"><br/>
                <input type="text" placeholder="milimetry" name="millimeters"><br/>
                <input type="submit" placeholder="Przelicz" value="Przelicz"><br/>
            </form>
        <h1>Przelicznik wag</h1>
            <form method="post" action="wagi">
                 <input type="text" placeholder="kilogramy" name="kilograms"> <br/>
                 <input type="text" placeholder="gramy" name="grams"><br/>
                 <input type="text" placeholder="miligramy" name="miligrams"><br/>
                 <input type="submit" placeholder="Przelicz" value="Przelicz"><br/>
            </form>
    </body>
</html>
