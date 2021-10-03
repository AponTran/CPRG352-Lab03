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
 * @author Apon Tran
 */
public class AgeCalculatorServlet extends HttpServlet {


        @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
    
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //retrieve age input from calculator
        String age = request.getParameter("age");
        
        
        if(age.equals("") || age == null){
        request.setAttribute("message", "You must give your current age");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; 
        }
        
        try {
        Integer.parseInt(age);
        } catch (NumberFormatException e) {
        request.setAttribute("message", "You must enter a number");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; 
        }
        
        int ageNum = Integer.parseInt(age);
        
        ageNum++;
        request.setAttribute("message", "Your age next year will be:");
        request.setAttribute("nextAge", ageNum);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }
        
}