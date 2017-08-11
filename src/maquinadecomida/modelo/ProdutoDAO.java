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
import java.util.ArrayList;
import maquinadecomida.persistencia.ProdutoDTO;

/**
 *
 * @author informatica
 */
public class ProdutoDAO {

    // definição da String de conexão
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/MaquinaDeComida?"
            + "user=root&password=alunoifc";

    public void atualizaProd(String nome, int qtd, float preco) throws SQLException {
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "update Produtos set nomeProd = ?, qtdProd = ?, precoProd = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, qtd);
        stmt.setFloat(3, preco);
        stmt.execute();
        conn.close();
    }
    
    public ProdutoDTO autenticaProd(String cod) throws SQLException {
        // definição da String de conexão
        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd from Produtos where codProd = ?";
        // enviar o select para ser analisado pelo banco
        // de dados...
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        p.setString(1, cod);
        ResultSet rs = p.executeQuery();
        ProdutoDTO produtoDTO = null;
        if (rs.next()) {
            produtoDTO = new ProdutoDTO();
            produtoDTO.setCodProd(rs.getInt(1));
       }
        conn.close();
        return produtoDTO;
    }
    
    public ArrayList<ProdutoDTO> montaListaProdutos() throws SQLException {

        ArrayList<ProdutoDTO> listaRetorno = new ArrayList();

        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codProd, nomeProd, precoProd, qtdProd from Produtos";
        // enviar o select para ser analisado pelo banco
        // de dados...
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        ResultSet rs = p.executeQuery();

        while (rs.next()) {
            ProdutoDTO produtoDTO = new ProdutoDTO();
            produtoDTO.setCodProd(rs.getInt(1));        
            produtoDTO.setNomeProd(rs.getString (2));
            produtoDTO.setPrecoProd(rs.getFloat(3));
            produtoDTO.setQtdProd(rs.getInt(4));
            //
            listaRetorno.add(produtoDTO);
        }
        conn.close();
        return listaRetorno;
    }
}
