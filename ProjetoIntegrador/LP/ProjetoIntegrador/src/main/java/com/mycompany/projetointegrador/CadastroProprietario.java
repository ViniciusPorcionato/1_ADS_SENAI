/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Porcionato
 */
public class CadastroProprietario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProprietario1
     */
    public CadastroProprietario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        btn_limparCampo = new javax.swing.JButton();
        btn_cadastrarCliente = new javax.swing.JButton();
        input_dataNascimento = new javax.swing.JTextField();
        input_nome = new javax.swing.JTextField();
        input_cpf = new javax.swing.JTextField();
        input_telefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        btn_feminino = new javax.swing.JRadioButton();
        btn_masculino = new javax.swing.JRadioButton();
        btn_outro = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Cadastro de Proprietários");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("CPF :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Telefone :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Email : ");

        btn_menu.setBackground(new java.awt.Color(153, 0, 0));
        btn_menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("VOLTAR");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_limparCampo.setBackground(new java.awt.Color(102, 102, 102));
        btn_limparCampo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_limparCampo.setForeground(new java.awt.Color(255, 255, 255));
        btn_limparCampo.setText("CANCELAR");
        btn_limparCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCampoActionPerformed(evt);
            }
        });

        btn_cadastrarCliente.setBackground(new java.awt.Color(153, 0, 0));
        btn_cadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrarCliente.setText("CADASTRAR");
        btn_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarClienteActionPerformed(evt);
            }
        });

        input_dataNascimento.setBackground(new java.awt.Color(204, 204, 204));
        input_dataNascimento.setText("Digite sua data de nascimento aqui...");
        input_dataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_dataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_dataNascimentoFocusLost(evt);
            }
        });

        input_nome.setBackground(new java.awt.Color(204, 204, 204));
        input_nome.setText("Digite seu nome aqui...");
        input_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_nomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_nomeFocusLost(evt);
            }
        });
        input_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nomeActionPerformed(evt);
            }
        });

        input_cpf.setBackground(new java.awt.Color(204, 204, 204));
        input_cpf.setText("Digite seu CPF aqui...");
        input_cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_cpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_cpfFocusLost(evt);
            }
        });

        input_telefone.setBackground(new java.awt.Color(204, 204, 204));
        input_telefone.setText("Digite seu telefone aqui...");
        input_telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_telefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_telefoneFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Data Nascimento:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Gênero:");

        input_email.setBackground(new java.awt.Color(204, 204, 204));
        input_email.setText("Digite seu email aqui...");
        input_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_emailFocusLost(evt);
            }
        });

        btn_feminino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_feminino.setForeground(new java.awt.Color(153, 0, 0));
        btn_feminino.setText("Feminino");
        btn_feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_femininoActionPerformed(evt);
            }
        });

        btn_masculino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_masculino.setForeground(new java.awt.Color(153, 0, 0));
        btn_masculino.setText("Masculino");
        btn_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masculinoActionPerformed(evt);
            }
        });

        btn_outro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_outro.setForeground(new java.awt.Color(153, 0, 0));
        btn_outro.setText("Outro");
        btn_outro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_menu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_feminino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_masculino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_outro))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_cpf))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_email))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_nome))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(input_dataNascimento)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_limparCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(input_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btn_feminino)
                    .addComponent(btn_masculino)
                    .addComponent(btn_outro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limparCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Proprietários Cadastrados");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(540, 540, 540)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(42, 42, 42)))
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

    private void btn_limparCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCampoActionPerformed
        // TODO add your handling code here:
        input_nome.setText("");
        input_cpf.setText("");
        input_telefone.setText("");
        input_email.setText("");
        input_dataNascimento.setText("");
        btn_masculino.setSelected(false);
        btn_feminino.setSelected(false);
        btn_outro.setSelected(false);
    }//GEN-LAST:event_btn_limparCampoActionPerformed

    private void input_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nomeActionPerformed

    private void btn_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masculinoActionPerformed
        // TODO add your handling code here:
        btn_feminino.setSelected(false);
        btn_outro.setSelected(false);
    }//GEN-LAST:event_btn_masculinoActionPerformed

    private void btn_outroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outroActionPerformed
        // TODO add your handling code here:
        btn_feminino.setSelected(false);
        btn_masculino.setSelected(false);
    }//GEN-LAST:event_btn_outroActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        dispose();
        new MenuOptions().setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void input_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_nomeFocusGained
        // TODO add your handling code here:
         if (input_nome.getText().equals("Digite seu nome aqui...")) {
            input_nome.setText("");
        }
    }//GEN-LAST:event_input_nomeFocusGained

    private void input_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_nomeFocusLost
        // TODO add your handling code here:
        if (input_nome.getText().equals("")) {
            input_nome.setText("Digite seu nome aqui...");
        }
    }//GEN-LAST:event_input_nomeFocusLost

    private void input_cpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_cpfFocusGained
        // TODO add your handling code here:
        if (input_cpf.getText().equals("Digite seu CPF aqui...")) {
            input_cpf.setText("");
        }
    }//GEN-LAST:event_input_cpfFocusGained

    private void input_cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_cpfFocusLost
        // TODO add your handling code here:
        if (input_cpf.getText().equals("")) {
            input_cpf.setText("Digite seu CPF aqui...");
        }
    }//GEN-LAST:event_input_cpfFocusLost

    private void input_telefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_telefoneFocusGained
        // TODO add your handling code here:
        if (input_telefone.getText().equals("Digite seu telefone aqui...")) {
            input_telefone.setText("");
        }
    }//GEN-LAST:event_input_telefoneFocusGained

    private void input_telefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_telefoneFocusLost
        // TODO add your handling code here:
        if (input_telefone.getText().equals("")) {
            input_telefone.setText("Digite seu telefone aqui...");
        }
    }//GEN-LAST:event_input_telefoneFocusLost

    private void input_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_emailFocusGained
        // TODO add your handling code here:
        if (input_email.getText().equals("Digite seu email aqui...")) {
            input_email.setText("");
        }
    }//GEN-LAST:event_input_emailFocusGained

    private void input_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_emailFocusLost
        // TODO add your handling code here:
        if (input_email.getText().equals("")) {
            input_email.setText("Digite seu email aqui...");
        }
    }//GEN-LAST:event_input_emailFocusLost

    private void input_dataNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_dataNascimentoFocusGained
        // TODO add your handling code here:
        if (input_dataNascimento.getText().equals("Digite sua data de nascimento aqui...")) {
            input_dataNascimento.setText("");
        }
    }//GEN-LAST:event_input_dataNascimentoFocusGained

    private void input_dataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_dataNascimentoFocusLost
        // TODO add your handling code here:
        if (input_dataNascimento.getText().equals("")) {
            input_dataNascimento.setText("Digite sua data de nascimento aqui...");
        }
    }//GEN-LAST:event_input_dataNascimentoFocusLost

    private void btn_femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_femininoActionPerformed
        // TODO add your handling code here:
        btn_masculino.setSelected(false);
        btn_outro.setSelected(false);
    }//GEN-LAST:event_btn_femininoActionPerformed

    private void btn_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(null, "Deseja realemente cadastrar ?", "opções", JOptionPane.YES_NO_CANCEL_OPTION);
        // yes = 0; no = 1; cancel = 2;
        if (valor == 0) {
            Proprietario p = new Proprietario();
            p.setNome(input_nome.getText());
            p.setCpf(input_cpf.getText());
            p.setTelefone(input_telefone.getText());
            p.setEmail(input_email.getText());
            p.setDataNascimento(input_dataNascimento.getText());
            if (btn_feminino.isSelected()) {
                p.setGenero("Feminino");
            }else if (btn_masculino.isSelected()){
                p.setGenero("Masculino");
            }else{
                p.setGenero("Outro");
            }
            
            area.setText(p.toString());
        }
    }//GEN-LAST:event_btn_cadastrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProprietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JRadioButton btn_feminino;
    private javax.swing.JButton btn_limparCampo;
    private javax.swing.JRadioButton btn_masculino;
    private javax.swing.JButton btn_menu;
    private javax.swing.JRadioButton btn_outro;
    private javax.swing.JTextField input_cpf;
    private javax.swing.JTextField input_dataNascimento;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nome;
    private javax.swing.JTextField input_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
