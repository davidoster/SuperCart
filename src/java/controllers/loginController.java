/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Database.Database;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author George.Pasparakis
 */
public class loginController extends AbstractController {
    
    public loginController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");
        String sql = "SELECT * FROM `users` WHERE `username` = '"  + request.getParameter("username") + 
                                            "' AND `password` = '" + request.getParameter("password") + "'";
        Database db = new Database();
        ResultSet rs;
        ModelAndView mv = new ModelAndView("login");
        
        rs = db.Database("ra1.anystream.eu:1011", "example_database", "example_user", "example_password", sql);
        if(rs.first())
            return mv;
        else
            return null;
    }
}
