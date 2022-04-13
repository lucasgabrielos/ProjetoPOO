
package Oficina.View.TelaLogin;

import Oficina.Controller.UsuarioController;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
         this.setSize(900,500);
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    TextNome = new javax.swing.JFormattedTextField();
    jLabel2 = new javax.swing.JLabel();
    TextEmail = new javax.swing.JFormattedTextField();
    jLabel3 = new javax.swing.JLabel();
    TextSenha = new javax.swing.JFormattedTextField();
    BtnVoltar = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    TextRG = new javax.swing.JFormattedTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    TextRua = new javax.swing.JFormattedTextField();
    TextNumero = new javax.swing.JFormattedTextField();
    TextBairro = new javax.swing.JFormattedTextField();
    TextCidade = new javax.swing.JFormattedTextField();
    TextEstado = new javax.swing.JFormattedTextField();
    TextCEP = new javax.swing.JFormattedTextField();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    TextCPF = new javax.swing.JFormattedTextField();
    BtnCadastrar = new javax.swing.JButton();
    TextTelefone = new javax.swing.JFormattedTextField();
    jLabel15 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("TelaCadastro");
    setResizable(false);
    getContentPane().setLayout(null);

    jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Email:");
    getContentPane().add(jLabel1);
    jLabel1.setBounds(10, 130, 70, 22);
    getContentPane().add(TextNome);
    TextNome.setBounds(80, 90, 250, 30);

    jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Nome:");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(10, 90, 70, 20);

    TextEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TextEmailActionPerformed(evt);
      }
    });
    getContentPane().add(TextEmail);
    TextEmail.setBounds(80, 130, 250, 30);

    jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Senha:");
    getContentPane().add(jLabel3);
    jLabel3.setBounds(10, 170, 80, 20);

    TextSenha.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TextSenhaActionPerformed(evt);
      }
    });
    getContentPane().add(TextSenha);
    TextSenha.setBounds(80, 170, 250, 30);

    BtnVoltar.setText("Voltar");
    BtnVoltar.setPreferredSize(new java.awt.Dimension(80, 22));
    getContentPane().add(BtnVoltar);
    BtnVoltar.setBounds(70, 400, 90, 40);

    jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Telefone:");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(10, 210, 90, 22);

    jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("CPF:");
    getContentPane().add(jLabel5);
    jLabel5.setBounds(10, 250, 60, 22);

    jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("RG:");
    getContentPane().add(jLabel6);
    jLabel6.setBounds(10, 290, 33, 22);
    getContentPane().add(TextRG);
    TextRG.setBounds(80, 290, 250, 30);

    jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Rua:");
    getContentPane().add(jLabel7);
    jLabel7.setBounds(440, 90, 40, 22);

    jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Bairro:");
    getContentPane().add(jLabel8);
    jLabel8.setBounds(440, 170, 60, 22);

    jLabel9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Cidade:");
    getContentPane().add(jLabel9);
    jLabel9.setBounds(440, 210, 80, 20);

    jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("CEP:");
    getContentPane().add(jLabel10);
    jLabel10.setBounds(450, 290, 70, 22);

    jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("Estado:");
    getContentPane().add(jLabel11);
    jLabel11.setBounds(440, 250, 80, 22);

    jLabel12.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Número:");
    getContentPane().add(jLabel12);
    jLabel12.setBounds(430, 130, 80, 22);

    TextRua.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TextRuaActionPerformed(evt);
      }
    });
    getContentPane().add(TextRua);
    TextRua.setBounds(490, 90, 280, 30);
    getContentPane().add(TextNumero);
    TextNumero.setBounds(520, 130, 250, 30);
    getContentPane().add(TextBairro);
    TextBairro.setBounds(520, 170, 250, 30);
    getContentPane().add(TextCidade);
    TextCidade.setBounds(520, 210, 250, 30);
    getContentPane().add(TextEstado);
    TextEstado.setBounds(520, 250, 250, 30);
    getContentPane().add(TextCEP);
    TextCEP.setBounds(520, 290, 250, 30);

    jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setText("Cadastre - se");
    getContentPane().add(jLabel13);
    jLabel13.setBounds(300, 10, 244, 34);
    getContentPane().add(jLabel14);
    jLabel14.setBounds(24, 0, 0, 0);

    try {
      TextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    TextCPF.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TextCPFActionPerformed(evt);
      }
    });
    getContentPane().add(TextCPF);
    TextCPF.setBounds(80, 250, 250, 30);

    BtnCadastrar.setText("Cadastrar");
    BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BtnCadastrarActionPerformed(evt);
      }
    });
    getContentPane().add(BtnCadastrar);
    BtnCadastrar.setBounds(670, 400, 110, 40);

    try {
      TextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    getContentPane().add(TextTelefone);
    TextTelefone.setBounds(100, 210, 250, 30);

    jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Oficina/View/Imagens/Tela de cadastro_1.png"))); // NOI18N
    jLabel15.setText("jLabel15");
    getContentPane().add(jLabel15);
    jLabel15.setBounds(0, 0, 900, 500);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void LimparCamposCadastro(java.awt.event.ActionEvent evt){
        TextNome.setText("");
        TextEmail.setText("");
        TextSenha.setText("");
        TextTelefone.setText("");
        TextCPF.setText("");
        TextRG.setText("");
    }
    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCPFActionPerformed

    private void TextRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRuaActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        String Nome = TextNome.getText();
        String Email = TextEmail.getText();
        String Senha = TextSenha.getText();
        String Telefone = TextTelefone.getText();
        String Cpf = TextCPF.getText();
        String Rg = TextRG.getText();
        
        try {
             boolean Sucesso;
            Sucesso = UsuarioController.CadastrarUsuario(Nome, Email, Senha, Telefone, Cpf, Rg);
        
            if(Sucesso == true){
                JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
                this.LimparCamposCadastro(evt);
                this.dispose();//Fecha o Jframe atual
            }else{
                JOptionPane.showMessageDialog(null, "Campos não preenchidos corretamente");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error:" + e);
        }
       
    }//GEN-LAST:event_BtnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BtnCadastrar;
  private javax.swing.JButton BtnVoltar;
  private javax.swing.JFormattedTextField TextBairro;
  private javax.swing.JFormattedTextField TextCEP;
  private javax.swing.JFormattedTextField TextCPF;
  private javax.swing.JFormattedTextField TextCidade;
  private javax.swing.JFormattedTextField TextEmail;
  private javax.swing.JFormattedTextField TextEstado;
  private javax.swing.JFormattedTextField TextNome;
  private javax.swing.JFormattedTextField TextNumero;
  private javax.swing.JFormattedTextField TextRG;
  private javax.swing.JFormattedTextField TextRua;
  private javax.swing.JFormattedTextField TextSenha;
  private javax.swing.JFormattedTextField TextTelefone;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  // End of variables declaration//GEN-END:variables
}
