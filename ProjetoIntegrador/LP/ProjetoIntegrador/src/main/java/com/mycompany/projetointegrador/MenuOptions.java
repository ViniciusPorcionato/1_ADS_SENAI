
package com.mycompany.projetointegrador;


public class MenuOptions extends javax.swing.JFrame {


    public MenuOptions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_cadastroCliente = new javax.swing.JButton();
        btn_cadastroCorretor = new javax.swing.JButton();
        btn_cadastroTipoImovel = new javax.swing.JButton();
        btn_cadastroProrietario = new javax.swing.JButton();
        btn_cadastroImoveis = new javax.swing.JButton();
        btn_cadastroLocacao = new javax.swing.JButton();
        btn_cadastroVenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_cadastroCliente.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroCliente.setText("Cadastro Cliente");
        btn_cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroClienteActionPerformed(evt);
            }
        });

        btn_cadastroCorretor.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroCorretor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroCorretor.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroCorretor.setText("Cadastro Corretores");
        btn_cadastroCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroCorretorActionPerformed(evt);
            }
        });

        btn_cadastroTipoImovel.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroTipoImovel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroTipoImovel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroTipoImovel.setText("Cadastro Tipo de Imoveis");
        btn_cadastroTipoImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroTipoImovelActionPerformed(evt);
            }
        });

        btn_cadastroProrietario.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroProrietario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroProrietario.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroProrietario.setText("Cadastro Proprietarios");
        btn_cadastroProrietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroProrietarioActionPerformed(evt);
            }
        });

        btn_cadastroImoveis.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroImoveis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroImoveis.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroImoveis.setText("Cadastro Imoveis");
        btn_cadastroImoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroImoveisActionPerformed(evt);
            }
        });

        btn_cadastroLocacao.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroLocacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroLocacao.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroLocacao.setText("Cadastro Locação");
        btn_cadastroLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroLocacaoActionPerformed(evt);
            }
        });

        btn_cadastroVenda.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastroVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastroVenda.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastroVenda.setText("Cadastro Venda");
        btn_cadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroVendaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\25170641\\Downloads\\menu2.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(btn_cadastroCorretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastroTipoImovel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(btn_cadastroProrietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastroImoveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastroLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(btn_cadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastroCorretor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastroTipoImovel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastroProrietario)
                .addGap(12, 12, 12)
                .addComponent(btn_cadastroImoveis)
                .addGap(12, 12, 12)
                .addComponent(btn_cadastroLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cadastroVenda)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\25170641\\Downloads\\logoTalismaImoveis.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel1)))
                .addContainerGap(452, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastroCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroCorretorActionPerformed
        dispose();
        new CadastroCorretor().setVisible(true);
    }//GEN-LAST:event_btn_cadastroCorretorActionPerformed

    private void btn_cadastroTipoImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroTipoImovelActionPerformed
        dispose();
        new CadastroTipoImoveis().setVisible(true);
    }//GEN-LAST:event_btn_cadastroTipoImovelActionPerformed

    private void btn_cadastroProrietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroProrietarioActionPerformed
        dispose();
        new CadastroProprietario().setVisible(true);
    }//GEN-LAST:event_btn_cadastroProrietarioActionPerformed

    private void btn_cadastroImoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroImoveisActionPerformed
        dispose();
        new CadastroImovel().setVisible(true);
    }//GEN-LAST:event_btn_cadastroImoveisActionPerformed

    private void btn_cadastroLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroLocacaoActionPerformed
        dispose();
        new CadastroLocacao().setVisible(true);
    }//GEN-LAST:event_btn_cadastroLocacaoActionPerformed

    private void btn_cadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroVendaActionPerformed
        dispose();
        new CadastroVenda().setVisible(true);
    }//GEN-LAST:event_btn_cadastroVendaActionPerformed

    private void btn_cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroClienteActionPerformed
        dispose();
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_btn_cadastroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastroCliente;
    private javax.swing.JButton btn_cadastroCorretor;
    private javax.swing.JButton btn_cadastroImoveis;
    private javax.swing.JButton btn_cadastroLocacao;
    private javax.swing.JButton btn_cadastroProrietario;
    private javax.swing.JButton btn_cadastroTipoImovel;
    private javax.swing.JButton btn_cadastroVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
