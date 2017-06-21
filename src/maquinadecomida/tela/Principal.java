
package maquinadecomida.tela;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author informatica
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        botaoAdm = new javax.swing.JButton();
        botaoComprar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nimbus Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maquininha de Comida");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/user-shape.png"))); // NOI18N
        botaoAdm.setText("Administrador");
        botaoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdmActionPerformed(evt);
            }
        });

        botaoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquinadecomida/tela/imagens/shopping-cart.png"))); // NOI18N
        botaoComprar.setText("Comprar");
        botaoComprar.setToolTipText("");
        botaoComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoComprarMouseClicked(evt);
            }
        });
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoAdm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botaoAdm)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdmActionPerformed
        // TODO add your handling code here:
        login lg = new login();
        lg.setVisible(true);
    }//GEN-LAST:event_botaoAdmActionPerformed

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        Produtos pr = new Produtos();
        this.dispose();
        pr.setVisible(true);
    }//GEN-LAST:event_botaoComprarActionPerformed

    private void botaoComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoComprarMouseClicked

        Principal pr = new Principal();
        pr.setVisible(false);
    }//GEN-LAST:event_botaoComprarMouseClicked

    
    public static void main(String[] args) {
        Principal pr = new Principal();
        pr.setVisible(true);
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdm;
    private javax.swing.JButton botaoComprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
