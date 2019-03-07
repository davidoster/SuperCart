/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import database.Database;
import entities.Products;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author George.Pasparakis
 */
public class LoginController extends AbstractController {
    
    public LoginController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");
        String sql = "SELECT * FROM `users` WHERE `username` = '"  + request.getParameter("username") + 
                                            "' AND `password` = '" + request.getParameter("password") + "'";
        Database db = new Database();
        ResultSet rs;
        ResultSet rs2;
        List<Products> theProducts = new ArrayList<Products>();
        
        ModelAndView mv = new ModelAndView("dashboard");
        rs = db.Database("ra1.anystream.eu:1011", "example_database", "example_user", "example_password", sql);
        if(rs.first()) {
            sql = "SELECT * FROM `products`";
            rs2 = db.Database("ra1.anystream.eu:1011", "example_database", "example_user", "example_password", sql);
            while(rs2.next()) {
                theProducts.add(new Products(rs2.getString("name"),rs2.getDouble("price")));
            }
            mv.addObject("products", theProducts);
            rs2.close();
            return mv;
        }
        else
        {
            rs.close();
            return null;
        }
    }
}
