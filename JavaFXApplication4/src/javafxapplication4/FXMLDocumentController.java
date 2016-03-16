/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author welli
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    public  TextField nome;
    public  TextField usuario;
    public  TextField senha;
    
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
        
        ConexaoMySql con = new ConexaoMySql();
        
        String var1, var2, var3;
        
        var1 = nome.getText();
        var2 = usuario.getText();
        var3 = senha.getText();
        
        
        Statement st = con.conexao.createStatement();
        String sql = ("INSERT INTO usuarios (USUARIOS,NOME,SENHA) VALUES" +  "(" + "'" + var1 + "'," + "'" + var2 + "'," + "'" + var3 + "')");
        st.execute(sql);
        

       /* ResultSet rs = st.getResultSet();
        while (rs.next()){
            System.out.println(rs.getString("nome"));
        } */
    }
    
       @FXML
        private void btnToogle(ActionEvent event) throws SQLException {
        
     ConexaoMySql con = new ConexaoMySql();
        
        String var1, var2, var3;
        
        var1 = nome.getText();
        var2 = usuario.getText();
        var3 = senha.getText();
        
        
        Statement st = con.conexao.createStatement();
        String sql = ("INSERT INTO usuarios (USUARIOS,NOME,SENHA) VALUES" +  "(" + "'" + var1 + "'," + "'" + var2 + "'," + "'" + var3 + "')");
        st.execute(sql);
        

       /* ResultSet rs = st.getResultSet();
        while (rs.next()){
            System.out.println(rs.getString("nome"));
        } */
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
