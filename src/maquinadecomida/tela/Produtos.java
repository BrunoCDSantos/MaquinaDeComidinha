package maquinadecomida.tela;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import maquinadecomida.modelo.ProdutoDAO;
import maquinadecomida.persistencia.ProdutoDTO;
import maquinadecomidas.Mensagens;
import maquinadecomidas.Validacao;

public class Produtos extends javax.swing.JFrame {

    private static float dinheiroDepositado;
    private static float produto;
    private static ProdutoDTO produtoDinamico = new ProdutoDTO();
    private static ProdutoDAO inicialiazacao = new ProdutoDAO();
    public Produtos() {
        initComponents();
        campoCodigoProduto.setVisible(false);
        botaoComprarProduto.setVisible(false);
        Produto.setVisible(false);
        comprar.setVisible(false);
        campoCodigoProduto.setVisible(false);
        Troco.setVisible(false);
        campoTroco.setVisible(false);
        campoValorCompras.setVisible(false);
        botaoConfCompra.setVisible(false);
        try {
            produto001.setText(inicialiazacao.montaListaProdutos().get(0).getNomeProd().get(0));
        } catch (SQLException ex) {
            
        }
        
        
        
        
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
        produto002 = new javax.swing.JLabel();
        produto003 = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        campoCodigoProduto = new javax.swing.JTextField();
        botaoComprarProduto = new javax.swing.JButton();
        Troco = new javax.swing.JLabel();
        campoTroco = new javax.swing.JTextField();
        botaoInserirDinheiro = new javax.swing.JButton();
        produto005 = new javax.swing.JLabel();
        produto006 = new javax.swing.JLabel();
        produto004 = new javax.swing.JLabel();
        produto008 = new javax.swing.JLabel();
        produto009 = new javax.swing.JLabel();
        produto011 = new javax.swing.JLabel();
        produto012 = new javax.swing.JLabel();
        produto010 = new javax.swing.JLabel();
        produto007 = new javax.swing.JLabel();
        produto014 = new javax.swing.JLabel();
        produto015 = new javax.swing.JLabel();
        produto017 = new javax.swing.JLabel();
        produto018 = new javax.swing.JLabel();
        produto016 = new javax.swing.JLabel();
        produto013 = new javax.swing.JLabel();
        produto020 = new javax.swing.JLabel();
        produto021 = new javax.swing.JLabel();
        produto023 = new javax.swing.JLabel();
        produto024 = new javax.swing.JLabel();
        produto022 = new javax.swing.JLabel();
        produto019 = new javax.swing.JLabel();
        produto026 = new javax.swing.JLabel();
        produto027 = new javax.swing.JLabel();
        produto029 = new javax.swing.JLabel();
        produto030 = new javax.swing.JLabel();
        produto028 = new javax.swing.JLabel();
        produto025 = new javax.swing.JLabel();
        produto031 = new javax.swing.JLabel();
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

        produto002.setText("002 - Stiksy(R$4,00)");

        produto003.setText("003 - Cebolitos(R$3,00)");

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

        produto005.setText("005 - Diamante Negro(R$2,00)");

        produto006.setText("006 - Fini(R$5,00)");

        produto004.setText("004 - Snickers(R$3,00)");

        produto008.setText("008 - Fandangos(R$3,00)");

        produto009.setText("009 - Baconzitos(R$3,00)");

        produto011.setText("011 - Cookies(R$2,00)");

        produto012.setText("012 - M & M(R$3,00)");

        produto010.setText("010 - Kinder Bueno(R$6,00)");

        produto007.setText("007 - Doritos(R$5,00)");

        produto014.setText("014 - Cheetos(R$6,00)");

        produto015.setText("015 - Pingo de Ouro(R$4,00)");

        produto017.setText("017 - Barra de Cereal(R$2,00)");

        produto018.setText("018 - Pipoca(R$3,00)");

        produto016.setText("016 - Kit Kat(R$3,00)");

        produto013.setText("013 - Ruffles(R$6,00)");

        produto020.setText("020 - Fanta Uva(R$3,00)");

        produto021.setText("021 - Fanta Laranja(R$3,00)");

        produto023.setText("023 - Chocolate(R$2,00)");

        produto024.setText("024 - Gatorade(R$3,00)");

        produto022.setText("022 - Água da Serra(R$6,00)");

        produto019.setText("019 - Coca-Cola(R$4,00)");

        produto026.setText("026 - Água(R$6,00)");

        produto027.setText("027 - Dolly(R$4,00)");

        produto029.setText("029 - Coca-Cola Diet(R$2,00)");

        produto030.setText("030 - Chá Matte Leão(R$3,00)");

        produto028.setText("028 - Aquarius(R$3,00)");

        produto025.setText("025 - H2O(R$6,00)");

        produto031.setText("031 - Pureza(R$3,00)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produto003)
                                    .addComponent(produto002)
                                    .addComponent(produto001)
                                    .addComponent(produto006)
                                    .addComponent(produto005)
                                    .addComponent(produto004))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produto009)
                                    .addComponent(produto008)
                                    .addComponent(produto007)
                                    .addComponent(produto012)
                                    .addComponent(produto011)
                                    .addComponent(produto010))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produto015)
                                    .addComponent(produto014)
                                    .addComponent(produto013)
                                    .addComponent(produto018)
                                    .addComponent(produto017)
                                    .addComponent(produto016)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produto021)
                                    .addComponent(produto020)
                                    .addComponent(produto019)
                                    .addComponent(produto024)
                                    .addComponent(produto023)
                                    .addComponent(produto022))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(produto027)
                                    .addComponent(produto026)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(produto025)
                                        .addGap(77, 77, 77)
                                        .addComponent(produto031))
                                    .addComponent(produto030)
                                    .addComponent(produto029)
                                    .addComponent(produto028)))
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
                        .addGap(141, 141, 141)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(produto007)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto008)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto009)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto010)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto011)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto012))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(produto001)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto002)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto003)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto004)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto005)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(produto006)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produto013)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto014)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto015)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto016)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto017)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto018)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(produto019)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto020)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto021)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto022)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto023)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto024))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(produto025)
                            .addComponent(produto031))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto026)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto027)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto028)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto029)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produto030)))
                .addGap(18, 18, 18)
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
    private javax.swing.JLabel produto002;
    private javax.swing.JLabel produto003;
    private javax.swing.JLabel produto004;
    private javax.swing.JLabel produto005;
    private javax.swing.JLabel produto006;
    private javax.swing.JLabel produto007;
    private javax.swing.JLabel produto008;
    private javax.swing.JLabel produto009;
    private javax.swing.JLabel produto010;
    private javax.swing.JLabel produto011;
    private javax.swing.JLabel produto012;
    private javax.swing.JLabel produto013;
    private javax.swing.JLabel produto014;
    private javax.swing.JLabel produto015;
    private javax.swing.JLabel produto016;
    private javax.swing.JLabel produto017;
    private javax.swing.JLabel produto018;
    private javax.swing.JLabel produto019;
    private javax.swing.JLabel produto020;
    private javax.swing.JLabel produto021;
    private javax.swing.JLabel produto022;
    private javax.swing.JLabel produto023;
    private javax.swing.JLabel produto024;
    private javax.swing.JLabel produto025;
    private javax.swing.JLabel produto026;
    private javax.swing.JLabel produto027;
    private javax.swing.JLabel produto028;
    private javax.swing.JLabel produto029;
    private javax.swing.JLabel produto030;
    private javax.swing.JLabel produto031;
    // End of variables declaration//GEN-END:variables
}
