package projetoa3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class TimeTela extends javax.swing.JFrame {

    private void buscarTimes(){
    try{ 
		DAO dao = new DAO(); 
		Time [] times = dao.obterTimes(); 
                this.comboTimes.removeAll();
                for(Time t : times){
                    this.comboTimes.addItem(t);
                }
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Times indisponíveis, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
    }
      
    public TimeTela() {
        super("Gerenciar Times");
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboTimes = new javax.swing.JComboBox<>();
        IDTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        estadioTxt = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        apagarBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Times"));

        comboTimes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboTimesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTimesActionPerformed(evt);
            }
        });

        IDTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        nomeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Nome do Time"));
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        estadioTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Estádio"));

        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        apagarBtn.setText("Apagar");

        atualizarBtn.setText("Atualizar");

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
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDTxt)
                    .addComponent(comboTimes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeTxt)
                    .addComponent(estadioTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(comboTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estadioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        Dashboard dt = new Dashboard();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void comboTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTimesActionPerformed
       Time time = (Time) comboTimes.getSelectedItem(); 
        IDTxt.setText(Integer.toString(time.getIDTime())); 
        nomeTxt.setText(time.getNome_Time()); 
        estadioTxt.setText(time.getEstadio());
    }//GEN-LAST:event_comboTimesActionPerformed

    private void comboTimesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboTimesAncestorAdded
        try{ 
		DAO dao = new DAO(); 
		Time [] times = dao.obterTimes(); 
                this.comboTimes.removeAll();
                for(Time t : times){
                    this.comboTimes.addItem(t);
                }
	} 
	catch (Exception e){ 
		JOptionPane.showMessageDialog(null, "Times indisponíveis, tente "
		+ "novamente mais tarde."); 
		e.printStackTrace(); 
	} 
         
    }//GEN-LAST:event_comboTimesAncestorAdded

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        String nome = nomeTxt.getText();
        String estadio = estadioTxt.getText();
        if(nome == null && estadio == null){
            JOptionPane.showMessageDialog (null, "Preencha o nome e o estádio para cadastrar!");
        }else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro" 
                + " de novo time?"); 
                if (escolha == JOptionPane.YES_OPTION){ 
                    Time time = new Time (nome, estadio); 
                    DAO dao = new DAO(); 
                    dao.cadastrarTime(time); 
                    JOptionPane.showMessageDialog(null, "Curso cadastrado com" + 
                        "sucesso"); 
                    nomeTxt.setText(""); 
                    estadioTxt.setText("");
                    buscarTimes();
                }
            }
            catch (Exception e){ 
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde"); 
                e.printStackTrace(); 
            }
        }
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTxt;
    private javax.swing.JButton apagarBtn;
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JComboBox<Object> comboTimes;
    private javax.swing.JTextField estadioTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTxt;
    // End of variables declaration//GEN-END:variables
}
