/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import Modelo.PessoaBanco;
import java.sql.SQLException;
import Modelo.Contato;
/**
 *
 * @author YAGOGOULARTGUIMARAES
 */
public class pessoaControle {
    //inserir
     public void ControleCadastrar(Contato c) throws SQLException
     {
     PessoaBanco.Cadastrar_Pessoas(c);
      
     }
    //listar
    
    //apagar
    
    //atualizar
    
}
