/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.tela;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import maquinadecomida.modelo.ProdutoDAO;
import maquinadecomida.persistencia.ProdutoDTO;
import maquinadecomidas.Mensagens;

/**
 *
 * @author Windows
 */
public class AtualizarMaq extends javax.swing.JFrame {

    private String novoNome;
    private int novaQtd;
    private float novoPreco;
    private static ProdutoDTO produtoDTO = new ProdutoDTO();
    private DefaultTableModel tabela;

    /**
     * Creates new form AtualizarMaq
     */
    public AtualizarMaq() {

        initComponents();
        campoNovoNomeProd.setEditable(false);
        campoQtdProd.setEditable(false);
        campoPrecoProd.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNovoNomeProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCodProdAlterar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoQtdProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPrecoProd = new javax.swing.JTextField();
        botaoConfirma = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoValidaCod = new javax.swing.JButton();
        boxNome = new javax.swing.JCheckBox();
        boxEstoque = new javax.swing.JCheckBox();
        boxPreco = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProd = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Código do Produto a ser alterado(1 a 30):");

        campoNovoNomeProd.setToolTipText("Digite o nome do novo produto a ser cadastrado.");
        campoNovoNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNovoNomeProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade(uni. máx. 15):");

        campoCodProdAlterar.setToolTipText("Digite o código do produto a ser alterado.");

        jLabel4.setText("Nome do novo produto:");

        campoQtdProd.setToolTipText("Digite a quantidade do produto a ser inserida na máquina. Respeitando o limite.");
        campoQtdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQtdProdActionPerformed(evt);
            }
        });

        jLabel5.setText("Preço(R$):");

        campoPrecoProd.setToolTipText("Digite o preço do novo produto cadastrado.");
        campoPrecoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoProdActionPerformed(evt);
            }
        });

        botaoConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/check-symbol.png"))); // NOI18N
        botaoConfirma.setText("Confirmar");
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/reply-all-button.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoValidaCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imgs/check-symbol.png"))); // NOI18N
        botaoValidaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoValidaCodActionPerformed(evt);
            }
        });

        boxNome.setText("Nome do produto");
        boxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNomeActionPerformed(evt);
            }
        });

        boxEstoque.setText("Estoque");
        boxEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstoqueActionPerformed(evt);
            }
        });

        boxPreco.setText("Preço");
        boxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPrecoActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione os campos a serem alterados do respectivo produto:");

        tabelaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Cod Prod", "Nome Prod", "Preço Prod", "Qtd Prod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProd);

        jLabel7.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Alterar produtos da máquina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(boxNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxPreco)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoQtdProd))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNovoNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCodProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(botaoValidaCod))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoConfirma)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(campoCodProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoValidaCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNome)
                    .addComponent(boxEstoque)
                    .addComponent(boxPreco))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNovoNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirma)
                    .addComponent(botaoVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoQtdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQtdProdActionPerformed

    }//GEN-LAST:event_campoQtdProdActionPerformed

    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
        if (campoCodProdAlterar.isEnabled()) {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            do {
                if (boxNome.isSelected() || boxEstoque.isSelected() || boxPreco.isSelected()) {
                    if (boxNome.isSelected()) {
                        if (campoNovoNomeProd.getText().isEmpty()) {
                            Mensagens.msgAviso(campoNovoNomeProd.getToolTipText());
                            return;
                        } else {
                            novoNome = campoNovoNomeProd.getText();
                        }
                    } else {
                        novoNome = produtoDTO.getNomeProd();
                    }

                    if (boxEstoque.isSelected()) {
                        if (campoQtdProd.getText().isEmpty()) {
                            Mensagens.msgAviso(campoQtdProd.getToolTipText());
                            return;
                        } else {
                            int valorQtd = Integer.parseInt(campoQtdProd.getText());
                            if ((valorQtd >= 0) && (valorQtd <= 15)) {
                                novaQtd = Integer.parseInt(campoQtdProd.getText());
                            } else {
                                Mensagens.msgAviso("Verifique se o valor digitado está entre 0 e 15 unidades.");
                                campoQtdProd.setText("");
                                return;
                            }
                        }
                    } else {
                        novaQtd = produtoDTO.getQtdProd();
                    }

                    if (boxPreco.isSelected()) {
                        if (campoPrecoProd.getText().isEmpty()) {
                            Mensagens.msgAviso(campoPrecoProd.getToolTipText());
                            return;
                        } else {
                            novoPreco = Float.parseFloat(campoPrecoProd.getText());
                        }
                    } else {
                        novoPreco = produtoDTO.getPrecoProd();
                    }
                }
                try {
                    produtoDAO.atualizaProd(novoNome, novaQtd, novoPreco, Integer.parseInt(campoCodProdAlterar.getText()));
                    Mensagens.msgInfo("Dados cadastrados com sucesso.");
                    campoCodProdAlterar.setEditable(true);
                    campoCodProdAlterar.setText("");
                    botaoValidaCod.setVisible(true);
                    campoQtdProd.setText("");
                    campoNovoNomeProd.setText("");
                    campoPrecoProd.setEditable(false);
                    campoQtdProd.setEditable(false);
                    campoNovoNomeProd.setEditable(false);
                    campoPrecoProd.setText("");
                    boxNome.setSelected(false);
                    boxEstoque.setSelected(false);
                    boxPreco.setSelected(false);
                    tabela = (DefaultTableModel) tabelaProd.getModel();
                    tabela.setNumRows(0);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Mensagens.msgErro("Deu erro no banco de dados.Por favor contate o suporte técnico da BLW");
                }
            } while (!(Mensagens.msgConf("Os dados serão mantidos os mesmos do atual produto.")));
            /*if ((Mensagens.msgConf("Os dados serão mantidos os mesmos do atual produto.")) != true) {
                novoNome = produtoDTO.getNomeProd();
                novaQtd = produtoDTO.getQtdProd();
                novoPreco = produtoDTO.getPrecoProd();
            }
             */

            Mensagens.msgAviso("Verifique se o valor digitado no campo do código do produto a ser alterado foi confirmado para a alteração.");
        }
    }//GEN-LAST:event_botaoConfirmaActionPerformed
/*
        if ((Mensagens.msgConf("Os dados serão mantidos os mesmos do atual produto.")) != true) {
                        novoNome = produtoDTO.getNomeProd();
                        novaQtd = produtoDTO.getQtdProd();
                        novoPreco = produtoDTO.getPrecoProd();
                    }
        
    
         */

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        if (Mensagens.msgConf("Gostaria de sair da tela de alteração de produtos.")) {
            OpcaoAdmin op = new OpcaoAdmin();
            op.setVisible(true);
            this.dispose();
        };
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoValidaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoValidaCodActionPerformed
        if (campoCodProdAlterar.getText().isEmpty()) {
            Mensagens.msgAviso(campoCodProdAlterar.getToolTipText());
        } else if (campoCodProdAlterar.getText().length() <= 2) {
            try {
                ProdutoDAO produtoDAO = new ProdutoDAO();
                produtoDTO = produtoDAO.autenticaProd(campoCodProdAlterar.getText());
                if (produtoDTO != null) {
                    DefaultTableModel modelo = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int col) {
                            return false;
                        }
                    };
                    modelo.addColumn("Código");
                    modelo.addColumn("Nome");
                    modelo.addColumn("Quantidade");
                    modelo.addColumn("Preço");
                    String[] vetor = new String[4];
                    vetor[0] = Integer.toString(produtoDTO.getCodProd());
                    vetor[1] = produtoDTO.getNomeProd();
                    vetor[2] = Integer.toString(produtoDTO.getQtdProd());
                    vetor[3] = Float.toString(produtoDTO.getPrecoProd());
                    modelo.addRow(vetor);
                    tabelaProd.setModel(modelo);
                    tabelaProd.setAutoResizeMode(1);
                    campoCodProdAlterar.setEditable(false);
                    botaoValidaCod.setVisible(false);
                    boxPreco.setVisible(true);
                    boxNome.setVisible(true);
                    boxEstoque.setVisible(true);
                } else {
                    Mensagens.msgAviso("Código informado não existe no banco de dados.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.msgErro("Deu erro no banco de dados.Por favor contate o suporte técnico da BLW");
            }
        } else {
            Mensagens.msgAviso("O código deve ter até 2 digitos. De 1 a 30");
        }
    }//GEN-LAST:event_botaoValidaCodActionPerformed

    private void boxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNomeActionPerformed
        if (boxNome.isSelected()) {
            campoNovoNomeProd.setEditable(true);
        } else {
            campoNovoNomeProd.setEditable(false);
        }
    }//GEN-LAST:event_boxNomeActionPerformed

    private void boxEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstoqueActionPerformed
        if (boxEstoque.isSelected()) {
            campoQtdProd.setEditable(true);
        } else {
            campoQtdProd.setEditable(false);
        }
    }//GEN-LAST:event_boxEstoqueActionPerformed

    private void campoPrecoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoProdActionPerformed

    private void boxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPrecoActionPerformed
        if (boxPreco.isSelected()) {
            campoPrecoProd.setEditable(true);
        } else {
            campoPrecoProd.setEditable(false);
        }

    }//GEN-LAST:event_boxPrecoActionPerformed

    private void campoNovoNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNovoNomeProdActionPerformed

    }//GEN-LAST:event_campoNovoNomeProdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JButton botaoValidaCod;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JCheckBox boxEstoque;
    private javax.swing.JCheckBox boxNome;
    private javax.swing.JCheckBox boxPreco;
    private javax.swing.JTextField campoCodProdAlterar;
    private javax.swing.JTextField campoNovoNomeProd;
    private javax.swing.JTextField campoPrecoProd;
    private javax.swing.JTextField campoQtdProd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaProd;
    // End of variables declaration//GEN-END:variables
}
