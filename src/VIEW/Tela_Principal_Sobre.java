package VIEW;

import java.awt.Desktop;
import java.net.URI;

public class Tela_Principal_Sobre extends javax.swing.JFrame {


    public Tela_Principal_Sobre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JButton();
        lblLinkedin = new javax.swing.JButton();
        lblAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTitle.setText("Sistema  Gym Academy - V 1.0");

        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/github.png"))); // NOI18N
        btnGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });

        lblLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/linkedin.png"))); // NOI18N
        lblLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLinkedinActionPerformed(evt);
            }
        });

        lblAuthor.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAuthor.setText("@Author Victor Hugo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGitHub)
                        .addGap(18, 18, 18)
                        .addComponent(lblLinkedin)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblAuthor)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLinkedin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGitHub, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAuthor)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(424, 264));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        // Ao clicar no botão irá abrir um link para o seu repositório GitHub
        Link("https://github.com/huguds/Academia");
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void lblLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLinkedinActionPerformed
        // Ao clicar no botão irá abrir um link para o seu linkedin
        Link("https://www.linkedin.com/in/victor-hugo-9b4723200/");
    }//GEN-LAST:event_lblLinkedinActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal_Sobre().setVisible(true);
            }
        });
    }

    // Método responsável por abrir um link no browser
    private void Link(String site){
        Desktop desktop = Desktop.getDesktop();
        try{
            URI uri = new URI(site);
            desktop.browse(uri);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGitHub;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JButton lblLinkedin;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
