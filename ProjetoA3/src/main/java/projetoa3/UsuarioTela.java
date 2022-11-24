package projetoa3;

import javax.swing.JOptionPane;

public class UsuarioTela extends javax.swing.JFrame {
    public UsuarioTela() {
        super("Gerenciamento usuários");
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDTxt = new javax.swing.JTextField();
        cadastrarBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        comboUsuarios = new javax.swing.JComboBox();
        IDTxt1 = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        senhaTxt = new javax.swing.JTextField();
        CPFTxt = new javax.swing.JTextField();
        tipoTxt = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        apagarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        IDTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        cadastrarBtn1.setText("Cadastrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Usuários"));

        comboUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboUsuariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuariosActionPerformed(evt);
            }
        });

        IDTxt1.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        nomeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        senhaTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        CPFTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        tipoTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Usuário"));

        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        apagarBtn.setText("Apagar");
        apagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarBtnActionPerformed(evt);
            }
        });

        atualizarBtn.setText("Atualizar");
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDTxt1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CPFTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tipoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CPFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuariosActionPerformed
        Usuario usuario = (Usuario) comboUsuarios.getSelectedItem(); 
        IDTxt.setText(Integer.toString(usuario.getIDUsuario())); 
        nomeTxt.setText(usuario.getNomeUsuario()); 
        senhaTxt.setText(usuario.getSenhaUsuario());
        CPFTxt.setText(usuario.getCPFUsuario());
        tipoTxt.setText(Integer.toString(usuario.getTipoUsuario()));
    }//GEN-LAST:event_comboUsuariosActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        Dashboard dt = new Dashboard();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void comboUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboUsuariosAncestorAdded
        try{ 
            DAO dao = new DAO(); 
            Usuario [] usuarios = dao.obterUsuarios();
            this.comboUsuarios.removeAll();
            for(Usuario u : usuarios){
                this.comboUsuarios.addItem(u);
            }
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Usuários indisponíveis, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
    }//GEN-LAST:event_comboUsuariosAncestorAdded

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        String nome = nomeTxt.getText();
        String senha = senhaTxt.getText();
        String cpf = CPFTxt.getText();
        int tipo = Integer.parseInt(tipoTxt.getText());
        if(tipo != 0 || tipo != 1){
            JOptionPane.showMessageDialog (null, "Os tipos de usuários são 0 - usuário normal e 1 - admin, escolha um dos dois!");
        }
        if(nome == null || senha == null || cpf == null){
            JOptionPane.showMessageDialog (null, "Preencha todos os campos para cadastrar!");
        }else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro" 
                + " de novo time?"); 
                if (escolha == JOptionPane.YES_OPTION){ 
                    Usuario usuario = new Usuario (nome, senha, cpf, tipo); 
                    DAO dao = new DAO(); 
                    dao.cadastrarUsuario(usuario); 
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com" + 
                        " sucesso"); 
                    IDTxt.setText("");
                    nomeTxt.setText(""); 
                }
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde"); 
                e.printStackTrace(); 
            }
        }
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void apagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarBtnActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Remover Usuário?"); 
        if (escolha == JOptionPane.YES_OPTION){ 
            try{ 
                int id = Integer.parseInt (IDTxt.getText()); 
                Usuario usuario = new Usuario(id); 
                DAO dao = new DAO(); 
                dao.removerUsuario(usuario); 
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!"); 
                nomeTxt.setText(""); 
                IDTxt.setText(""); 
                senhaTxt.setText(""); 
                CPFTxt.setText("");
                tipoTxt.setText("");
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente " 
                    +"mais tarde."); 
                e.printStackTrace(); 
            } 
             
        } 
    }//GEN-LAST:event_apagarBtnActionPerformed

    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Atualizar Usuário?"); 
        if (escolha == JOptionPane.YES_OPTION){ 
            try{ 
                int id = Integer.parseInt (IDTxt.getText()); 
                String nome = nomeTxt.getText(); 
                String senha = senhaTxt.getText(); 
                String cpf = CPFTxt.getText();
                int tipo = Integer.parseInt(tipoTxt.getText());
                Usuario usuario = new Usuario(id, nome, senha, cpf, tipo); 
                DAO dao = new DAO(); 
                dao.atualizarUsuario(usuario); 
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso");
                nomeTxt.setText(""); 
                IDTxt.setText(""); 
                senhaTxt.setText(""); 
                CPFTxt.setText("");
                tipoTxt.setText(""); 
            } 
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente " 
                    + "mais tarde."); 
                e.printStackTrace(); 
            } 
        }
    }//GEN-LAST:event_atualizarBtnActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPFTxt;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JTextField IDTxt1;
    private javax.swing.JButton apagarBtn;
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton cadastrarBtn1;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JComboBox comboUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField senhaTxt;
    private javax.swing.JTextField tipoTxt;
    // End of variables declaration//GEN-END:variables
}
