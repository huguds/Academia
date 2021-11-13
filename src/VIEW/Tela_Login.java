/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONEXAO.ModuloDeConexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author vitin
 */
public class Tela_Login extends javax.swing.JFrame {
    
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
        ImageIcon attention = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\attention64px.png");
        ImageIcon accept = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\accept64px.png");
        ImageIcon cancel = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\cancel64px.png");

    /**
     * Creates new form TelaLogin
     */
    public Tela_Login() {
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

        lblIcon = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/gym64px.png"))); // NOI18N

        txtLogin.setToolTipText("");
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });

        lblUsuario.setText("Usuário:");

        lblSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLogin)
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addComponent(lblSenha))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblIcon)
                .addGap(14, 14, 14)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(418, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        // Evento ao pressionar a tecla enter com o txtLogin selecionado
        if (txtLogin.getText() == null ){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o Login !","Gym_academy",JOptionPane.INFORMATION_MESSAGE,attention);
        }else if (txtLogin.getText() == null && Password.getText() == null){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o Login e a Senha","Gym_academy",JOptionPane.INFORMATION_MESSAGE,attention);
        }else if (txtLogin.getText().equals("veto") && Password.getText().equals("123")){
            JOptionPane.showMessageDialog(null, "Sucesso!","Gym_academy",JOptionPane.INFORMATION_MESSAGE,accept);
            this.dispose();
            new Tela_Principal().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos, tente novamente !","Gym_academy",JOptionPane.INFORMATION_MESSAGE,cancel);
        }  
        
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        // Evento ao pressionar a tecla enter com no password
        if (txtLogin.getText() == null ){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o Login !","Gym_academy",JOptionPane.INFORMATION_MESSAGE,attention);
        }else if (txtLogin.getText() == null && Password.getText() == null){
            JOptionPane.showMessageDialog(null, "Por favor, preencha o Login e a Senha","Gym_academy",JOptionPane.INFORMATION_MESSAGE,attention);
        }else if (txtLogin.getText().equals("veto") && Password.getText().equals("123")){
            JOptionPane.showMessageDialog(null, "Sucesso!","Gym_academy", JOptionPane.INFORMATION_MESSAGE,accept);
            conexao();
            this.dispose();
            new Tela_Principal().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos, tente novamente !","Gym_academy",JOptionPane.INFORMATION_MESSAGE,cancel);
        }
        
        }
    }//GEN-LAST:event_PasswordKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }

    // Realiza a conexão com o banco de dados
    private void conexao(){
        
        conexao = ModuloDeConexao.conector();
        initComponents();
        
        if (conexao != null) {
            JOptionPane.showMessageDialog(null, "Exito na Conexão","Banco de dados",JOptionPane.INFORMATION_MESSAGE,accept);
        } else {
            JOptionPane.showMessageDialog(null, "Falha na Conexão","Banco de dados",JOptionPane.INFORMATION_MESSAGE,cancel);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}