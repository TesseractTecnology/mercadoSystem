/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;



import javafxapplication4.*;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author welli
 */
public class ConexaoMySql1 {
    
    
    
    public static String status = "Não conectou...";
    
        public ConexaoMySql1() {

        }
        
        public static java.sql.Connection getConexaoMySql()  {
            
            Connection connection = null; 
            
            try { 
            
                String driverName = "com.mysql.jdbc.Driver"; 
                Class.forName(driverName);
                
                String serverName = "54.232.199.237:3306";
                String mydatabase = "mysql";
                String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
                String username = "admin";
                String password = "admin";
                
                connection = DriverManager.getConnection(url, username, password);
                
                
              
                
                
                if (connection != null) {
                    
                    status = ("STATUS--->Conectado com sucesso!");
                  
                
                } else { 
                 
                    status = ("Status ---> Não foi possivel realizar conexão");
                    
                }
                
                return connection;
                
            } catch (ClassNotFoundException e) {
                
                System.out.println("O driver expecificado nao foi encontrado.");
                
                return null;
            } catch (SQLException e) {
                
                System.out.println("Nao foi possivel conectar ao Banco de Dados.");
                
                return null;

            }
            
             
                
      
          

         
    }    
        public static String statusConection() { 
            
            return status; 
        }
        
        public static boolean FecharConexao() {
        
            try {
                ConexaoMySql1.getConexaoMySql().close();
                return true; 
                
            } catch (SQLException e) {
                
                return false;
            }
            
     
            
        }
        
       
        
        

        
}
