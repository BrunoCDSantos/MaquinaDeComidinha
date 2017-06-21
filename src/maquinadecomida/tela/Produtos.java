package maquinadecomida.tela;

public class Produtos extends javax.swing.JFrame {

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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        campoCodigoProduto = new javax.swing.JTextField();
        botaoComprarProduto = new javax.swing.JButton();
        Troco = new javax.swing.JLabel();
        campoTroco = new javax.swing.JTextField();
        botaoInserirDinheiro = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/soda.png"))); // NOI18N
        jLabel1.setText("Bebidas(600mL)");

        jLabel2.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/chips.png"))); // NOI18N
        jLabel2.setText("Comidas");

        botaoConfCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/check-symbol.png"))); // NOI18N
        botaoConfCompra.setText("Confirmar");

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/reply-all-button.png"))); // NOI18N
        botaoVolta.setText("Voltar");
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

        jLabel3.setText("001 - Amendoim Dori(200g - R$4,00)");

        jLabel6.setText("002 - Stiksy(90g - R$4,00)");

        jLabel7.setText("003 - Cebolitos(60g - R$3,00)");

        Produto.setText("Produto");

        campoCodigoProduto.setToolTipText("Digite o código do produto a ser comprado.");

        botaoComprarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/shopping-cart.png"))); // NOI18N
        botaoComprarProduto.setText("Comprar");

        Troco.setText("Troco(R$):");

        campoTroco.setToolTipText("Troco da compra.");
        campoTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTrocoActionPerformed(evt);
            }
        });

        botaoInserirDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/banknote.png"))); // NOI18N
        botaoInserirDinheiro.setText("Inserir");
        botaoInserirDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirDinheiroActionPerformed(evt);
            }
        });

        jLabel11.setText("005 - Diamante Negro(20g - R$2,00)");

        jLabel12.setText("006 - Fini(80g - R$5,00)");

        jLabel13.setText("004 - Snickers(40g - R$3,00)");

        jLabel14.setText("008 - Fandangos(59g - R$3,00)");

        jLabel15.setText("009 - Baconzitos(55g - R$3,00)");

        jLabel16.setText("011 - Cookies(40g - R$2,00)");

        jLabel17.setText("012 - M & M(52g - R$3,00)");

        jLabel18.setText("010 - Kinder Bueno(39g - R$6,00)");

        jLabel19.setText("007 - Doritos(96g - R$5,00)");

        jLabel20.setText("014 - Cheetos(150g - R$6,00)");

        jLabel21.setText("015 - Pingo de Ouro(90g - R$4,00)");

        jLabel22.setText("017 - Barra de Cereal(25g - R$2,00)");

        jLabel23.setText("018 - Pipoca(60g - R$3,00)");

        jLabel24.setText("016 - Kit Kat(45g - R$3,00)");

        jLabel25.setText("013 - Ruffles(96g - R$6,00)");

        jLabel26.setText("020 - Fanta Uva(R$3,00)");

        jLabel27.setText("021 - Fanta Laranja(R$3,00)");

        jLabel28.setText("023 - Chocolate(R$2,00)");

        jLabel29.setText("024 - Gatorade(R$3,00)");

        jLabel30.setText("022 - Água da Serra(R$6,00)");

        jLabel31.setText("019 - Coca-Cola(R$4,00)");

        jLabel32.setText("026 - Água(R$6,00)");

        jLabel33.setText("027 - Dolly(R$4,00)");

        jLabel34.setText("029 - Coca-Cola Diet(R$2,00)");

        jLabel35.setText("030 - Chá Matte Leão(R$3,00)");

        jLabel36.setText("028 - Aquarius(R$3,00)");

        jLabel37.setText("025 - H2O(R$6,00)");

        jLabel38.setText("031 - Pureza(R$3,00)");

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
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel38))
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel36)))
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
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel17))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoValorComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValorComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValorComprasActionPerformed

    private void campoTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTrocoActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        //cria um objeto da tela principal
        Principal telaPrincipal = new Principal();
        //fecha a janela de produtos
        this.dispose();
        //deixa visivel a tela principal
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoVoltaActionPerformed

    private void botaoInserirDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirDinheiroActionPerformed
       boolean opcoesVisivel;
       botaoComprarProduto.setVisible(true);
       campoCodigoProduto.setVisible(true);
       Produto.setVisible(true);
       comprar.setVisible(true);
       campoCodigoProduto.setVisible(true);
       Troco.setVisible(true);
       campoTroco.setVisible(true);
       campoValorCompras.setVisible(true);
    }//GEN-LAST:event_botaoInserirDinheiroActionPerformed
    

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
