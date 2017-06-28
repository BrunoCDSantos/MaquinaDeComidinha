/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.persistencia;

/**
 *
 * @author informatica
 */
public class ProdutoDTO {
    private int codProd;
    private String nomeProd;
    
    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public float getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(float precoProd) {
        this.precoProd = precoProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }
    private float precoProd;
    private int qtdProd;
    
}
