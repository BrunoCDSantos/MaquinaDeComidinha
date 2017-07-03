/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import maquinadecomida.persistencia.UsuarioDTO;
import maquinadecomidas.Mensagens;

/**
 *
 * @author informatica
 */

public class UsuarioDAO {
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/MaquinaDeComida?"
            + "user=root&password=info2015";
    
    public UsuarioDTO autenticaUsuario(
            String nome,
            String senha) throws SQLException {
        // definição da String de conexão
        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codAdm from Adm"+
                     " where nomeAdm = ? "+
                     "   and senhaAdm = ? ";
        // enviar o select para ser analisado pelo banco
        // de dados...
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        p.setString(1, nome);
        p.setString(2, senha);
        ResultSet rs = p.executeQuery();
        UsuarioDTO usuarioDTO = null;
        if (rs.next()) {
            usuarioDTO = new UsuarioDTO();
            usuarioDTO.setCodigo(rs.getInt(1));
            usuarioDTO.setNome(nome);
            usuarioDTO.setSenha(senha);
        }
        conn.close();
        return usuarioDTO;
    }
}
