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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author welli
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
        
        ConexaoMySql con = new ConexaoMySql();
        
        Statement st = con.conexao.createStatement();
        
        st.executeQuery("Select * from usuarios");
        
        ResultSet rs = st.getResultSet();
        while (rs.next()){
            System.out.println(rs.getString("nome"));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
