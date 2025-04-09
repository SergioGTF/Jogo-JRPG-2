package com.mycompany.projetorpged.view.Principal;

import com.mycompany.projetorpged.controller.JogadorController;
import com.mycompany.projetorpged.view.cad_login.TelaCadastroJogador;
import com.mycompany.projetorpged.view.cad_login.TelaLoginJogador;

public class TelaPrincipal extends javax.swing.JFrame {

    private JogadorController jogadorController;

    public TelaPrincipal() {
        this.jogadorController = new JogadorController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1Principal = new javax.swing.JDesktopPane();
        txtNomedoJogo = new javax.swing.JLabel();
        txtOpcao = new javax.swing.JLabel();
        BotaoCadastro = new javax.swing.JButton();
        BotaoLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtNomedoJogo.setFont(new java.awt.Font("JetBrains Mono", 0, 48)); // NOI18N
        txtNomedoJogo.setText("Bem vindo ao JRPG 2");

        txtOpcao.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        txtOpcao.setText("Escolha uma opção");

        BotaoCadastro.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        BotaoCadastro.setText("Cadastrar");
        BotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroActionPerformed(evt);
            }
        });

        BotaoLogin.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        BotaoLogin.setText("Login");
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1Principal.setLayer(txtNomedoJogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1Principal.setLayer(txtOpcao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1Principal.setLayer(BotaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1Principal.setLayer(BotaoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1PrincipalLayout = new javax.swing.GroupLayout(jDesktopPane1Principal);
        jDesktopPane1Principal.setLayout(jDesktopPane1PrincipalLayout);
        jDesktopPane1PrincipalLayout.setHorizontalGroup(
            jDesktopPane1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1PrincipalLayout.createSequentialGroup()
                .addGroup(jDesktopPane1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1PrincipalLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jDesktopPane1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jDesktopPane1PrincipalLayout.createSequentialGroup()
                                .addComponent(BotaoLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoCadastro))
                            .addComponent(txtNomedoJogo)))
                    .addGroup(jDesktopPane1PrincipalLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(txtOpcao)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jDesktopPane1PrincipalLayout.setVerticalGroup(
            jDesktopPane1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1PrincipalLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(txtNomedoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOpcao)
                .addGap(99, 99, 99)
                .addGroup(jDesktopPane1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLogin)
                    .addComponent(BotaoCadastro))
                .addContainerGap(257, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1Principal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaLoginJogador telaLogin = new TelaLoginJogador(this.jogadorController);
        telaLogin.setVisible(true);
        jDesktopPane1Principal.add(telaLogin);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroActionPerformed
        TelaCadastroJogador telaCadastro = new TelaCadastroJogador(this.jogadorController);
        telaCadastro.setVisible(true);
        jDesktopPane1Principal.add(telaCadastro);
    }//GEN-LAST:event_BotaoCadastroActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastro;
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JDesktopPane jDesktopPane1Principal;
    private javax.swing.JLabel txtNomedoJogo;
    private javax.swing.JLabel txtOpcao;
    // End of variables declaration//GEN-END:variables
}
