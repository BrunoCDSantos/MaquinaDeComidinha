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
import maquinadecomidas.Mensagens;

/**
 *
 * @author informatica
 */
public class ProdutoDAO {

    // definição da String de conexão
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/MaquinaDeComida?"
            + "user=root&password=alunoifc";

    /*
     public static void main(String[] args) throws SQLException {
     ProdutoDAO dao = new ProdutoDAO();
     ArrayList<ProdutoDTO> lista = dao.montaListaProdutos();
     for (ProdutoDTO produtoDTO : lista) {
     System.out.println(produtoDTO.getNomeProd() + " " + produtoDTO.getPrecoProd());
     }
     }
     */
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
            produtoDTO.setNomeProd(rs.get ());
            System.out.println(rs.getString(2));
            produtoDTO.setPrecoProd(rs.getFloat(3));
            produtoDTO.setQtdProd(rs.getInt(4));
            //
            listaRetorno.add(produtoDTO);
        }
        conn.close();
        return listaRetorno;
    }
}
