package maquinadecomida.tela;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import maquinadecomida.modelo.ProdutoDAO;
import maquinadecomida.persistencia.ProdutoDTO;
import maquinadecomidas.Mensagens;
import maquinadecomidas.Validacao;

public class Produtos extends javax.swing.JFrame {

    private float dinheiroDepositado;
    private float produto;
    private ProdutoDTO produtoDinamico = new ProdutoDTO();
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private ArrayList<ProdutoDTO> listaProdutos;
    private int posicaoX = 30;
    private int posicaoY = 30;
    int numeroDoLado;

    public Produtos()  {
        initComponents();

        try {
            listaProdutos = produtoDAO.montaListaProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (ProdutoDTO produto : listaProdutos) {

            numeroDoLado += 1;
            JLabel produtos = new JLabel();
            produtos.setText( "00"+ (numeroDoLado - 1) + "- " + produto.getNomeProd() + " (R$) " + produto.getPrecoProd()+("0"));
            produtos.setBounds(posicaoX, posicaoY, 230, 30);
            posicaoY += 30;
            this.getContentPane().add(produtos);
            if (produto.getCodProd()%13 == 0) {
                posicaoX +=230;
                posicaoY = 30;
                
            }

        }

        campoCodigoProduto.setVisible(false);
        botaoComprarProduto.setVisible(false);
        Produto.setVisible(false);
        comprar.setVisible(false);
        campoCodigoProduto.setVisible(false);
        Troco.setVisible(false);
        campoTroco.setVisible(false);
        campoValorCompras.setVisible(false);
        botaoConfCompra.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoConfCompra = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comprar = new javax.swing.JLabel();
        campoValorCompras = new javax.swing.JTextField();
        campoDinheiroDepositado = new javax.swing.JTextField();
        produto001 = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        campoCodigoProduto = new javax.swing.JTextField();
        botaoComprarProduto = new javax.swing.JButton();
        Troco = new javax.swing.JLabel();
        campoTroco = new javax.swing.JTextField();
        botaoInserirDinheiro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/soda.png"))); // NOI18N
        jLabel1.setText("Bebidas(600mL)");

        jLabel2.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/chips.png"))); // NOI18N
        jLabel2.setText("Comidas  e");

        botaoConfCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/check-symbol.png"))); // NOI18N
        botaoConfCompra.setText("Confirmar");
        botaoConfCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfCompraActionPerformed(evt);
            }
        });

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/reply-all-button.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltaMouseClicked(evt);
            }
        });
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor a inserir(R$):");

        comprar.setText("Compras(R$):");

        campoValorCompras.setToolTipText("Total gasto em reais na compra dos produtos.");
        campoValorCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValorComprasActionPerformed(evt);
            }
        });

        campoDinheiroDepositado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        campoDinheiroDepositado.setToolTipText("Digite o valor a ser inserido na máquina.");
        campoDinheiroDepositado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDinheiroDepositadoActionPerformed(evt);
            }
        });

        Produto.setText("Produto");

        campoCodigoProduto.setToolTipText("Digite o código do produto a ser comprado.");

        botaoComprarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/shopping-cart.png"))); // NOI18N
        botaoComprarProduto.setText("Comprar");
        botaoComprarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarProdutoActionPerformed(evt);
            }
        });

        Troco.setText("Troco(R$):");

        campoTroco.setToolTipText("Troco da compra.");
        campoTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTrocoActionPerformed(evt);
            }
        });

        botaoInserirDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/banknote.png"))); // NOI18N
        botaoInserirDinheiro.setText("Inserir");
        botaoInserirDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirDinheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(476, 476, 476))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoDinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoInserirDinheiro))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoVolta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoConfCompra))
                                .addComponent(produto001)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Produto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoComprarProduto))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(comprar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoValorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Troco)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(415, 415, 415))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(produto001)
                .addGap(371, 371, 371)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoDinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirDinheiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Produto)
                    .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoComprarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar)
                    .addComponent(campoValorCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Troco)
                    .addComponent(campoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfCompra)
                    .addComponent(botaoVolta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorComprasActionPerformed

    private void campoTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTrocoActionPerformed
        String stringTroco = Float.toString(dinheiroDepositado - produto);
        campoTroco.setEnabled(false);
        campoTroco.setText(stringTroco);

    }//GEN-LAST:event_campoTrocoActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        if (Mensagens.msgConf("Gostaria de encerrar a compra.")) {
            Principal telaPrincipal = new Principal();
            this.dispose();
            telaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_botaoVoltaActionPerformed

    private void botaoInserirDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirDinheiroActionPerformed
        if (Validacao.validaPreco(campoDinheiroDepositado)) {
            botaoComprarProduto.setVisible(true);
            campoCodigoProduto.setVisible(true);
            Produto.setVisible(true);
            comprar.setVisible(true);
            campoCodigoProduto.setVisible(true);
            Troco.setVisible(true);
            campoTroco.setVisible(true);
            campoValorCompras.setVisible(true);
            campoDinheiroDepositado.setEnabled(false);
            botaoConfCompra.setVisible(true);

            dinheiroDepositado = Integer.valueOf(campoDinheiroDepositado.getText());
            String stringTroco = Float.toString(dinheiroDepositado - produto);
            campoTroco.setText(stringTroco + "0");
            campoTroco.setEnabled(false);
        } else {
            campoDinheiroDepositado.setText("");
        }

    }//GEN-LAST:event_botaoInserirDinheiroActionPerformed

    private void botaoVoltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltaMouseClicked
        Principal pr = new Principal();
        pr.setVisible(false);
    }//GEN-LAST:event_botaoVoltaMouseClicked

    private void botaoConfCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfCompraActionPerformed
        if (Mensagens.msgConf("Gostaria de encerrar a compra.")) {
            Principal pr = new Principal();
            pr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoConfCompraActionPerformed

    private void campoDinheiroDepositadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDinheiroDepositadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDinheiroDepositadoActionPerformed

    private void botaoComprarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarProdutoActionPerformed
        /*if(campoCodigoProduto.getText().isEmpty()){
            Mensagens.msgAviso("Nenhum código informado.");
            campoCodigoProduto.requestFocus();
        } else if(campoCodigoProduto){
            
        }*/
    }//GEN-LAST:event_botaoComprarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Produto;
    private javax.swing.JLabel Troco;
    private javax.swing.JButton botaoComprarProduto;
    private javax.swing.JButton botaoConfCompra;
    private javax.swing.JButton botaoInserirDinheiro;
    private javax.swing.JButton botaoVolta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCodigoProduto;
    private javax.swing.JTextField campoDinheiroDepositado;
    private javax.swing.JTextField campoTroco;
    private javax.swing.JTextField campoValorCompras;
    private javax.swing.JLabel comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel produto001;
    // End of variables declaration//GEN-END:variables
}
