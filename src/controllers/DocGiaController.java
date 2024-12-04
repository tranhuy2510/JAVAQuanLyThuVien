/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.*;
import models.DocGiaModel;

/**
 *
 * @author ADMIN
 */
public class DocGiaController {
    Connection conn;
    public DocGiaController() throws SQLException{
        conn = new DBConnect().connectSQL();
    }

    
    
    
    
}
