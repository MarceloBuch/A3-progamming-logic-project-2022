package projetoa3;

import javax.swing.JOptionPane;

public class JogadorTela extends javax.swing.JFrame {

    public JogadorTela() {
        super("Gerenciar Jogadores");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        comboJogadores = new javax.swing.JComboBox();
        IDTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        posicaoTxt = new javax.swing.JTextField();
        cadastrarBtn1 = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        apagarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        idadeTxt = new javax.swing.JTextField();

        cadastrarBtn.setText("Cadastrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Jogadores"));

        comboJogadores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboJogadoresAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJogadoresActionPerformed(evt);
            }
        });

        IDTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        nomeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        posicaoTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Posição "));

        cadastrarBtn1.setText("Cadastrar");
        cadastrarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtn1ActionPerformed(evt);
            }
        });

        atualizarBtn.setText("Atualizar");

        apagarBtn.setText("Apagar");

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        idadeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboJogadores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicaoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idadeTxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(posicaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJogadoresActionPerformed
        Jogador jogador = (Jogador) comboJogadores.getSelectedItem();
        IDTxt.setText(Integer.toString(jogador.getIDJogador()));
        nomeTxt.setText(jogador.getNome_Jogador()); 
        posicaoTxt.setText(jogador.getPosicao_Jogador());
        idadeTxt.setText(Integer.toString(jogador.getIdade_Jogador()));
    }//GEN-LAST:event_comboJogadoresActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        Dashboard dt = new Dashboard();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void comboJogadoresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboJogadoresAncestorAdded
        try{ 
            DAO dao = new DAO(); 
            Jogador [] jogadores = dao.obterJogadores(); 
            this.comboJogadores.removeAll();
            for(Jogador j : jogadores){
                this.comboJogadores.addItem(j);
            }
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Jogadores indisponíveis, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
    }//GEN-LAST:event_comboJogadoresAncestorAdded

    private void cadastrarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtn1ActionPerformed
        
    }//GEN-LAST:event_cadastrarBtn1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogadorTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTxt;
    private javax.swing.JButton apagarBtn;
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton cadastrarBtn1;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JComboBox comboJogadores;
    private javax.swing.JTextField idadeTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField posicaoTxt;
    // End of variables declaration//GEN-END:variables
}
