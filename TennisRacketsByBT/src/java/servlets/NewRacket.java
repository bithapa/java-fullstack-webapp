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

import javax.servlet.*;
import javax.servlet.http.*;

import entities.*;
/**
 *
 * @author bthapa01
 */
public class NewRacket extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String nextPage = "/Display.jsp";
        
            String brand = request.getParameter("brand");
            String version = request.getParameter("version");
            String family = request.getParameter("family");
            String price = request.getParameter("price");
            String size = request.getParameter("size"); 
            String weight = request.getParameter("weight");
            String pattern = request.getParameter("pattern");
            String description = request.getParameter("description");
            String dummyracket = "images/dummyracket.jpg";
           
            RacketErrorList errors = new RacketErrorList();
            
            boolean isBrandValid = RacketValidation.validateBrand(brand, errors);
            boolean isVersionValid = RacketValidation.validateVersion(version, errors);
            boolean isFamilyValid = RacketValidation.validateFamily(family, errors);
            boolean isPriceValid = RacketValidation.validatePrice(price, errors);
            boolean isSizeValid = RacketValidation.validateSize(size, errors);
            boolean isWeightValid = RacketValidation.validateWeight(weight, errors);
            boolean isPatternValid = RacketValidation.validatePattern(pattern, errors);
            boolean isDescValid = RacketValidation.validateDescription(description, errors);
            
            HttpSession session = request.getSession();
            if ( isBrandValid && isVersionValid && isFamilyValid && isPriceValid && isSizeValid
                    && isWeightValid && isPatternValid && isDescValid ) 
            {
                RacketList racketList = (RacketList)session.getAttribute("racketList");
                if ( racketList == null )
                    racketList = new RacketList();
             
                if (session.getAttribute("racketList") == null)
                     session.setAttribute("racketList", racketList);
//                racketList.addRacket(version,description,price,size,weight,
//                        pattern,dummyracket,brand,family,description);
//                session.setAttribute("currentRacket", newRacket);
                racketList.saveRacket(version, price, size, weight, pattern, brand, family, description);
                session.setAttribute("racketList", racketList);
            }
            else {
                nextPage = "/NewRacket.jsp";
                request.setAttribute("errors", errors);
            }
        
        getServletContext().getRequestDispatcher(nextPage).forward(request,response);        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
