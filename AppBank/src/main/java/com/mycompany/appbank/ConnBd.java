/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jeanw
 */
public class ConnBd {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PWD = "";
    
    
    public static Connection Ligacao()
    {
    
        try{
            Connection conn = DriverManager.getConnection(URL,USER,PWD);
            System.out.println("Conexao Estabelecida com suceso! ");
            return conn;
        }catch(SQLException e)
        {
            System.out.println("Erro na Ligacao!! ");
            e.printStackTrace();
        
            return null;
        }catch(Exception e){
            System.out.println("Erro na Ligacao !");
            e.printStackTrace();
            return null;
        }   
   }    
}
