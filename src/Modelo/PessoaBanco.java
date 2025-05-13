/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author YAGOGOULARTGUIMARAES
 */
public class PessoaBanco {
    //inserir
    public static void Cadastrar_Pessoas(Contato c) throws SQLException{
        try 
        {
         //pegas os parametros
          Connection  conexao =  Conexao.conecta_banco(); 
          //JAVA com SQL
          Statement sta = conexao.createStatement();
           //criar comando de SQL
           String sql= "insert into ";
        } 
        catch (SQLException erro) 
        {
            
        }
}
    //listar
    
    //apagar
    
    //atualizar
}
