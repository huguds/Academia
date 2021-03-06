/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author vitin
 */
public class Tela_Principal extends javax.swing.JFrame {


    public Tela_Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmn_Cadastrar = new javax.swing.JMenu();
        jmn_Item_Cadastrar = new javax.swing.JMenuItem();
        jmn_Item_Cadastrar_Exercicios = new javax.swing.JMenuItem();
        jmn_Consultar = new javax.swing.JMenu();
        jmn_Item_Consultar = new javax.swing.JMenuItem();
        jmn_Sobre = new javax.swing.JMenu();
        jmn_item_Sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym_academy");

        lblTitle.setFont(new java.awt.Font("Cinzel Black", 2, 18)); // NOI18N
        lblTitle.setText("Gym_Academy");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/gym256px.png"))); // NOI18N

        jmn_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N
        jmn_Cadastrar.setText("Cadastrar");

        jmn_Item_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N
        jmn_Item_Cadastrar.setText("Cadastrar Aluno(a)");
        jmn_Item_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_Item_CadastrarActionPerformed(evt);
            }
        });
        jmn_Cadastrar.add(jmn_Item_Cadastrar);

        jmn_Item_Cadastrar_Exercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/barbell16px.png"))); // NOI18N
        jmn_Item_Cadastrar_Exercicios.setText("Cadastrar Exercicios");
        jmn_Item_Cadastrar_Exercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_Item_Cadastrar_ExerciciosActionPerformed(evt);
            }
        });
        jmn_Cadastrar.add(jmn_Item_Cadastrar_Exercicios);

        jMenuBar1.add(jmn_Cadastrar);

        jmn_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user_edit.png"))); // NOI18N
        jmn_Consultar.setText("Consultar");

        jmn_Item_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user_edit.png"))); // NOI18N
        jmn_Item_Consultar.setText("Consultar Aluno(a)");
        jmn_Item_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_Item_ConsultarActionPerformed(evt);
            }
        });
        jmn_Consultar.add(jmn_Item_Consultar);

        jMenuBar1.add(jmn_Consultar);

        jmn_Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/information.png"))); // NOI18N
        jmn_Sobre.setText("Info");

        jmn_item_Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/information.png"))); // NOI18N
        jmn_item_Sobre.setText("Sobre");
        jmn_item_Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_item_SobreActionPerformed(evt);
            }
        });
        jmn_Sobre.add(jmn_item_Sobre);

        jMenuBar1.add(jmn_Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lblTitle)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblImage)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(518, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmn_Item_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_Item_CadastrarActionPerformed
        // A a????o deste bot??o abrir?? uma tela para cadastro de alunos
        new Tela_Principal_Cadastro().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jmn_Item_CadastrarActionPerformed

    private void jmn_Item_Cadastrar_ExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_Item_Cadastrar_ExerciciosActionPerformed
        new Tela_Principal_Cadastro_Exercicios().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jmn_Item_Cadastrar_ExerciciosActionPerformed

    private void jmn_Item_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_Item_ConsultarActionPerformed
        // Abre a tela de consulta de alunos(a)
        new Tela_Principal_Consulta().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jmn_Item_ConsultarActionPerformed

    private void jmn_item_SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_item_SobreActionPerformed
        // Ao clicar neste bot??o ir?? abrir uma p??gina de informa????es sobre o sistema e sobre o desenvolvedor
        new Tela_Principal_Sobre().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jmn_item_SobreActionPerformed


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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmn_Cadastrar;
    private javax.swing.JMenu jmn_Consultar;
    private javax.swing.JMenuItem jmn_Item_Cadastrar;
    private javax.swing.JMenuItem jmn_Item_Cadastrar_Exercicios;
    private javax.swing.JMenuItem jmn_Item_Consultar;
    private javax.swing.JMenu jmn_Sobre;
    private javax.swing.JMenuItem jmn_item_Sobre;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
