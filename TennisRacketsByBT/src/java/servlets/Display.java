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

// for http session
import javax.servlet.*;
import javax.servlet.http.*;

// import entities
import entities.*;

/**
 *
 * @author bthapa01
 */
public class Display extends HttpServlet {

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
        // create three Racket objects
        Racket racket1 = new Racket("98 16x19 3rd Gen",
                "A modern racket for intermediate level player", 
                219,
                98, 
                11.4, 
                "16x19", 
                "images/babolat-pure-strike-98-16x19.jpg", 
                "Babolat", 
                "Pure Strike", 
                "Control Oriented Racket");
        Racket racket2 = new Racket("98 18x20 3rd Gen",
                "A modern racket for advanced level player", 
                219,
                98, 
                12.4, 
                "18x20", 
                "images/babolat-pure-strike-98-18x20.jpg", 
                "Babolat", 
                "Pure Strike", 
                "Control Oriented Racket");
        Racket racket3 = new Racket("Tour 3rd Gen",
                "A modern racket for intermediate/advanced level player", 
                209,
                100, 
                12, 
                "16x19", 
                "images/babolat-pure-strike-tour.jpg", 
                "Babolat", 
                "Pure Strike", 
                "Control Oriented Racket");
//        
        RacketList racketList = new RacketList(); 
        
        // add the Racket objeccts to the list
        racketList.rackets.add(racket1);
        racketList.rackets.add(racket2);
        racketList.rackets.add(racket3);
        
        // create a session
        HttpSession session = request.getSession();
        
        if ((Boolean)session.getAttribute("login") == null)
            getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        
        // check if the list object is already exist in the session
        if (session.getAttribute("racketList") == null)
            session.setAttribute("racketList", racketList);
        racketList.loadRackets();
        session.setAttribute("racketList", racketList);
        getServletContext().getRequestDispatcher("/Display.jsp").forward(request, response);
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
