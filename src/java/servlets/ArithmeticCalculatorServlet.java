/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tranp
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up the JSP
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstdigit = request.getParameter("first_digit");
        String seconddigit = request.getParameter("second_digit");
        
       
        request.setAttribute("firstDigit", firstdigit);
        request.setAttribute("secondDigit", seconddigit);
        
        int firstINT = 0;
        int secondINT = 0;
        int result = 0;
        try{
            firstINT = Integer.parseInt(firstdigit);
            secondINT = Integer.parseInt(seconddigit);
            
        
        String selectedoperation = request.getParameter("selectedOperation");
        switch(selectedoperation){
            case "+":
                result = firstINT + secondINT; break;
            case "-":
                result = firstINT - secondINT; break;
            case "*":
                result = firstINT * secondINT; break;
            case "%":
                result = firstINT % secondINT; break;
            default: break;
                
        }
        }catch(Exception e){
            //error message
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        //display calculation result
        request.setAttribute("message", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }



}
