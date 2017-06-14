package javaapplication23.telas;

public class Produtos extends javax.swing.JFrame {

    public Produtos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Baconzitos = new javax.swing.JCheckBox();
        Amendoim = new javax.swing.JCheckBox();
        Cebolitos = new javax.swing.JCheckBox();
        KinderBueno = new javax.swing.JCheckBox();
        PingoDeOuro = new javax.swing.JCheckBox();
        Snickers = new javax.swing.JCheckBox();
        Ruffles = new javax.swing.JCheckBox();
        KitKat = new javax.swing.JCheckBox();
        Fandangos = new javax.swing.JCheckBox();
        BarraDeCereal = new javax.swing.JCheckBox();
        Cookies = new javax.swing.JCheckBox();
        MEM = new javax.swing.JCheckBox();
        Stiksy = new javax.swing.JCheckBox();
        Fini = new javax.swing.JCheckBox();
        DiamanteNegro = new javax.swing.JCheckBox();
        Pipoca = new javax.swing.JCheckBox();
        Cheetos = new javax.swing.JCheckBox();
        Doritos = new javax.swing.JCheckBox();
        AguaDaSerra = new javax.swing.JCheckBox();
        Pureza = new javax.swing.JCheckBox();
        Chocolate = new javax.swing.JCheckBox();
        Dolly = new javax.swing.JCheckBox();
        Gatorade = new javax.swing.JCheckBox();
        FantaLaranja = new javax.swing.JCheckBox();
        CocaCola = new javax.swing.JCheckBox();
        ChaMatteLeao = new javax.swing.JCheckBox();
        Aquarius = new javax.swing.JCheckBox();
        FantaUva = new javax.swing.JCheckBox();
        CocaColaDiet = new javax.swing.JCheckBox();
        H2O = new javax.swing.JCheckBox();
        Agua = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoConfProd = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Troco = new javax.swing.JTextField();
        DinheiroDepositado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DinheiroDepositado1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Troco1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Baconzitos.setText("Baconzitos(55g - R$3,85)");

        Amendoim.setText("Amendoim Dori(200g - R$3,95)");

        Cebolitos.setText("Cebolitos(60g - R$3,85)");

        KinderBueno.setText("Kinder Bueno(39g - R$6,00)");

        PingoDeOuro.setText("Pingo de Ouro(90g - R$3,95)");

        Snickers.setText("Snickers(40g - R$3,00)");

        Ruffles.setText("Ruffles(96g - R$6,29)");

        KitKat.setText("Kit Kat(45g - 2,50)");

        Fandangos.setText("Fandangos(59g - R$2,90)");

        BarraDeCereal.setText("Barra de Cereal(25g - R$1,50)");

        Cookies.setText("Cookies(40g - R$2,50)");

        MEM.setText("M & M(52g - R$2,99)");

        Stiksy.setText("Stiksy(90g - R$4,00)");

        Fini.setText("Fini(80g - R$5,00)");

        DiamanteNegro.setText("Diamante Negro(20g - R$2,00)");

        Pipoca.setText("Pipoca(60g - R$2,50)");

        Cheetos.setText("Cheetos(150g - R$6,29)");

        Doritos.setText("Doritos(96g - R$5,85)");

        AguaDaSerra.setText("Água da Serra");

        Pureza.setText("Pureza");

        Chocolate.setText("Chocolate");

        Dolly.setText("Dolly");

        Gatorade.setText("Gatorade");

        FantaLaranja.setText("Fanta Laranja");

        CocaCola.setText("Coca-cola(R$ 4,19)");

        ChaMatteLeao.setText("Chá Matte Leão");

        Aquarius.setText("Aquarius");

        FantaUva.setText("Fanta Uva");

        CocaColaDiet.setText("Coca-Cola Diet");
        CocaColaDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocaColaDietActionPerformed(evt);
            }
        });

        H2O.setText("H2O");

        Agua.setText("Água");
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });

        jLabel1.setText("Bebidas(600mL)");

        jLabel2.setText("Comidas");

        botaoConfProd.setText("Confirmar");

        botaoVolta.setText("Voltar");

        jLabel4.setText("Valor depositado(R$):");

        jLabel5.setText("Compras(R$):");

        Troco.setText("8,00");

        DinheiroDepositado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        DinheiroDepositado.setText("10,00");

        jLabel3.setText("001 - Amendoim Dori(200g - R$6,00)");

        jLabel6.setText("002 - Amendoim Dori(200g - R$3,00)");

        jLabel7.setText("003 - Amendoim Dori(200g - R$2,00)");

        jLabel8.setText("Produto");

        DinheiroDepositado1.setText("003");

        jButton1.setText("Comprar");

        jLabel9.setText("Troco(R$):");

        Troco1.setText("2,00");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Inserir $");

        jLabel10.setText("Produtos Comprados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FantaLaranja)
                            .addComponent(FantaUva)
                            .addComponent(CocaCola)
                            .addComponent(AguaDaSerra))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(H2O)
                            .addComponent(Agua)
                            .addComponent(Gatorade)
                            .addComponent(Dolly))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pureza)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Aquarius)
                                    .addComponent(CocaColaDiet)
                                    .addComponent(ChaMatteLeao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Snickers)
                                    .addComponent(Cebolitos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DiamanteNegro)
                                            .addComponent(Fini)))
                                    .addComponent(Amendoim)
                                    .addComponent(Stiksy))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KinderBueno)
                                    .addComponent(Baconzitos)
                                    .addComponent(Cookies)
                                    .addComponent(Fandangos)
                                    .addComponent(Doritos)
                                    .addComponent(MEM))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pipoca)
                                    .addComponent(BarraDeCereal)
                                    .addComponent(PingoDeOuro)
                                    .addComponent(KitKat)
                                    .addComponent(Cheetos)
                                    .addComponent(Ruffles)))
                            .addComponent(Chocolate))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(botaoVolta))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoConfProd))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel9)))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Troco1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(DinheiroDepositado1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Amendoim)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Doritos)
                                .addComponent(Ruffles)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cheetos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Stiksy)
                                .addComponent(Fandangos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cebolitos)
                            .addComponent(Baconzitos)
                            .addComponent(PingoDeOuro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(KitKat)
                                .addComponent(KinderBueno))
                            .addComponent(Snickers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiamanteNegro)
                            .addComponent(Cookies)
                            .addComponent(BarraDeCereal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fini)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MEM)
                                .addComponent(Pipoca)))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CocaCola)
                            .addComponent(Gatorade)
                            .addComponent(Aquarius))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FantaUva)
                            .addComponent(CocaColaDiet)
                            .addComponent(H2O))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FantaLaranja)
                            .addComponent(ChaMatteLeao)
                            .addComponent(Agua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AguaDaSerra)
                            .addComponent(Dolly)
                            .addComponent(Pureza)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Chocolate)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DinheiroDepositado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(DinheiroDepositado1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel10))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Troco1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfProd)
                    .addComponent(botaoVolta))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CocaColaDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocaColaDietActionPerformed
       
    }//GEN-LAST:event_CocaColaDietActionPerformed

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
       
    }//GEN-LAST:event_AguaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Agua;
    private javax.swing.JCheckBox AguaDaSerra;
    private javax.swing.JCheckBox Amendoim;
    private javax.swing.JCheckBox Aquarius;
    private javax.swing.JCheckBox Baconzitos;
    private javax.swing.JCheckBox BarraDeCereal;
    private javax.swing.JCheckBox Cebolitos;
    private javax.swing.JCheckBox ChaMatteLeao;
    private javax.swing.JCheckBox Cheetos;
    private javax.swing.JCheckBox Chocolate;
    private javax.swing.JCheckBox CocaCola;
    private javax.swing.JCheckBox CocaColaDiet;
    private javax.swing.JCheckBox Cookies;
    private javax.swing.JCheckBox DiamanteNegro;
    private javax.swing.JTextField DinheiroDepositado;
    private javax.swing.JTextField DinheiroDepositado1;
    private javax.swing.JCheckBox Dolly;
    private javax.swing.JCheckBox Doritos;
    private javax.swing.JCheckBox Fandangos;
    private javax.swing.JCheckBox FantaLaranja;
    private javax.swing.JCheckBox FantaUva;
    private javax.swing.JCheckBox Fini;
    private javax.swing.JCheckBox Gatorade;
    private javax.swing.JCheckBox H2O;
    private javax.swing.JCheckBox KinderBueno;
    private javax.swing.JCheckBox KitKat;
    private javax.swing.JCheckBox MEM;
    private javax.swing.JCheckBox PingoDeOuro;
    private javax.swing.JCheckBox Pipoca;
    private javax.swing.JCheckBox Pureza;
    private javax.swing.JCheckBox Ruffles;
    private javax.swing.JCheckBox Snickers;
    private javax.swing.JCheckBox Stiksy;
    private javax.swing.JTextField Troco;
    private javax.swing.JTextField Troco1;
    private javax.swing.JButton botaoConfProd;
    private javax.swing.JButton botaoVolta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
