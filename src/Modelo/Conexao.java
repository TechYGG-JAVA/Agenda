/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author YAGOGOULARTGUIMARAES
 */
public class Conexao {
    //atributol
    private static final String URL = "jdbc:myslq://localhost3306/agenda";
    private static final String USUARIO = "root";
    private static final  String SENHA = "";
    public static Connection conecta_banco() throws SQLException
    {
        try{
         return DriverManager.getConnection(URL,USUARIO, SENHA);
        }
        catch(SQLException erro)
         {
            throw new SQLException("Erro ao conectar com o Banco de Dados");
        }
    }

}
