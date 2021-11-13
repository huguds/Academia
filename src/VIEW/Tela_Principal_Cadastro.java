package VIEW;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.sql.*;
import CONEXAO.ModuloDeConexao;
import javax.swing.JOptionPane;

public class Tela_Principal_Cadastro extends javax.swing.JFrame {
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

    public Tela_Principal_Cadastro() {
        initComponents();
        formatarCampoData();
        formatarCampoCPF();
        formatarCampoCEP();
        formatarCampoPeso();
//        formatarCampoAltura();
        // Acrescentar comentários aos TextFields para instruir o usuário
        txtNomeCad.setToolTipText("Digite o nome do aluno(a)");
        jformText_NasciCad.setToolTipText("Digite a data de nascimento do aluno(a)");
        txtIdadeCad.setToolTipText("Digite a idade do aluno(a)");
        jformText_CPFCad.setToolTipText("Digite o CPF do aluno(a)");
        jformText_Peso.setToolTipText("Digite o peso do aluno(a) em KG");
        jformText_Altura.setToolTipText("Digite a altura do aluno(a) em CM");
        txtEndCad.setToolTipText("Digite o endereço do aluno(a)");
        txtNumEndCad.setToolTipText("Digite o numero do endereço do aluno(a)");
        txtComplementoEndCad.setToolTipText("Digite o complemento do endereço");
        // Uso da biblioteca ATXY2k para validação do campo textCEP
        RestrictedTextField validar = new RestrictedTextField(jformText_CEPCad);
        validar.setOnlyNums(true); // receber somente números
        validar.setLimit(8); // limitar até 8 digitos
        // Conexão com o banco de dados
        conexao = ModuloDeConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCamera = new javax.swing.JLabel();
        btnCapturar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        lblNascCad = new javax.swing.JLabel();
        lblIdadeCad = new javax.swing.JLabel();
        txtIdadeCad = new javax.swing.JTextField();
        lblNomeCad = new javax.swing.JLabel();
        txtNomeCad = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        CmboxGenero = new javax.swing.JComboBox<>();
        jformText_NasciCad = new javax.swing.JFormattedTextField();
        lblCPFCad = new javax.swing.JLabel();
        jformText_CPFCad = new javax.swing.JFormattedTextField();
        lblObjetivoCad = new javax.swing.JLabel();
        CmboxObjetivo = new javax.swing.JComboBox<>();
        lblEndCad = new javax.swing.JLabel();
        txtEndCad = new javax.swing.JTextField();
        lblNumEndCad = new javax.swing.JLabel();
        txtNumEndCad = new javax.swing.JTextField();
        lblComplementoEndCad = new javax.swing.JLabel();
        txtComplementoEndCad = new javax.swing.JTextField();
        lblPesoCad = new javax.swing.JLabel();
        lblAlturaCad = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        btnBuscarCep = new javax.swing.JButton();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        cmbUF = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        jformText_CEPCad = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        jformText_Peso = new javax.swing.JFormattedTextField();
        jformText_Altura = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/camera128px.png"))); // NOI18N

        btnCapturar.setText("Capturar");

        btnSelecionar.setText("Selecionar");

        lblNascCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNascCad.setText("Data de Nascimento");

        lblIdadeCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIdadeCad.setText("Idade");

        lblNomeCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomeCad.setText("Nome");

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGenero.setText("Gênero");

        CmboxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        CmboxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmboxGeneroActionPerformed(evt);
            }
        });

        jformText_NasciCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jformText_NasciCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformText_NasciCadActionPerformed(evt);
            }
        });

        lblCPFCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCPFCad.setText("CPF");

        jformText_CPFCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformText_CPFCadActionPerformed(evt);
            }
        });

        lblObjetivoCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblObjetivoCad.setText("Objetivo");

        CmboxObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hipertrofia", "Definir", "Emagrecer", "Outro" }));

        lblEndCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEndCad.setText("Endereço");

        lblNumEndCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumEndCad.setText("Numero");

        lblComplementoEndCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblComplementoEndCad.setText("Complemento");

        txtComplementoEndCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoEndCadActionPerformed(evt);
            }
        });

        lblPesoCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPesoCad.setText("Peso");

        lblAlturaCad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAlturaCad.setText("Altura");

        lblCEP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCEP.setText("CEP");

        btnBuscarCep.setText("Buscar");
        btnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCepActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCidade.setText("Cidade");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblBairro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBairro.setText("Bairro");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        lblUF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUF.setText("UF");

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jformText_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformText_PesoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPFCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapturar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionar)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jformText_NasciCad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIdadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(CmboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblObjetivoCad)
                                        .addGap(52, 52, 52)
                                        .addComponent(lblPesoCad)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jformText_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblAlturaCad)
                                                .addGap(10, 10, 10))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNascCad)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIdadeCad)
                                        .addGap(51, 51, 51)
                                        .addComponent(lblGenero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCadastrar)))
                                .addGap(47, 47, 47)
                                .addComponent(lblCamera))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jformText_CPFCad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CmboxObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jformText_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblEndCad)
                                                .addGap(241, 241, 241))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumEndCad)
                                            .addComponent(txtNumEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblUF)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComplementoEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComplementoEndCad)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46))
                                    .addComponent(jformText_CEPCad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblBairro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarCep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblCEP))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCamera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCapturar)
                            .addComponent(btnSelecionar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNomeCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNascCad)
                            .addComponent(lblIdadeCad)
                            .addComponent(lblGenero))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jformText_NasciCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPFCad)
                            .addComponent(lblObjetivoCad)
                            .addComponent(lblPesoCad)
                            .addComponent(lblAlturaCad))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jformText_CPFCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmboxObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jformText_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jformText_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCEP)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar)
                        .addComponent(btnBuscarCep))
                    .addComponent(jformText_CEPCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro)
                    .addComponent(lblUF)
                    .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumEndCad)
                    .addComponent(lblComplementoEndCad)
                    .addComponent(lblEndCad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplementoEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(645, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jformText_NasciCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformText_NasciCadActionPerformed
        // Campo formatado para data de nascimento
    }//GEN-LAST:event_jformText_NasciCadActionPerformed

    private void jformText_CPFCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformText_CPFCadActionPerformed
        // Campo formatado para CPF
    }//GEN-LAST:event_jformText_CPFCadActionPerformed

    private void txtComplementoEndCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoEndCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoEndCadActionPerformed

    private void btnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCepActionPerformed
        //
        if (jformText_CEPCad.getText().equals("")){
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/warning.png")));
            JOptionPane.showMessageDialog(null, "Informe o CEP","Warning",JOptionPane.WARNING_MESSAGE);
            jformText_CEPCad.requestFocus();
        }else{
             buscarCep();
        }
    }//GEN-LAST:event_btnBuscarCepActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void CmboxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmboxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmboxGeneroActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Limpar todos os campos de Endereço
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jformText_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformText_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformText_PesoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Cadastrar  aluno(a)
        inserir();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal_Cadastro().setVisible(true);
            }
        });
    }
    // Formatar o campo data
    private void formatarCampoData(){
        try {
               
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(jformText_NasciCad);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Formatar o campo CPF
    private void formatarCampoCPF(){
        try {
            MaskFormatter maskcpf = new MaskFormatter("###.###.###-##.");
            maskcpf.install(jformText_CPFCad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    // Formatar o campo CEP
    private void formatarCampoCEP(){
        try {
               
            MaskFormatter mask = new MaskFormatter("#####-###");
            mask.install(jformText_CEPCad);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Formatar o campo Peso
    private void formatarCampoPeso(){
        try {
               
            MaskFormatter mask = new MaskFormatter("###.##");
            mask.install(jformText_Peso);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Formatar o campo Altura
    private void formatarCampoAltura(){
        try {
               
            MaskFormatter mask = new MaskFormatter("#.##");
            mask.install(jformText_Altura);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    // Buscar o CEP
    private void buscarCep(){
        ImageIcon cancel = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGEScancel.png");;;
        String logradouro = "";
        String tipoLogradouro = "";
        String uf = "";
        String resultado = null;
        String cep = jformText_CEPCad.getText();
        
        try{
            URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep="+cep+"&formato=xml");
            SAXReader xml = new SAXReader(); // Captura os dados xml
            Document document = xml.read(url);
            Element root = document.getRootElement();
            
            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element element = it.next();
                if(element.getQualifiedName().equals("cidade")){
                    txtCidade.setText(element.getText());
                }if(element.getQualifiedName().equals("bairro")){
                    txtBairro.setText(element.getText());
                }if(element.getQualifiedName().equals("tipo_logradouro")){
                    tipoLogradouro = element.getText();
                }if(element.getQualifiedName().equals("logradouro")){
                    logradouro = element.getText();
                }if(element.getQualifiedName().equals("uf")){
                    uf = element.getText();
                    cmbUF.setSelectedItem(uf);
                    cmbUF.disable();
                }if(element.getQualifiedName().equals("resultado")){
                    resultado = element.getText();
                    if(resultado.equals("1")){
                        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/checked.png"))); 
                    }else{
                        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel.png")));
//                        JOptionPane.showMessageDialog(null, "CEP não encontrado");
                        JOptionPane.showMessageDialog(null,"CEP não encontrado","ERROR",JOptionPane.INFORMATION_MESSAGE,cancel);
                    }
                }
            }
            txtEndCad.setText(tipoLogradouro+" "+logradouro);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        }
    // Limpar todos os campos do endereço
    private void limpar(){
        jformText_CEPCad.setText(null);
        txtEndCad.setText(null);
        txtBairro.setText(null);
        txtCidade.setText(null);
        cmbUF.setSelectedItem(null);
        cmbUF.enable();
        lblStatus.setIcon(null);
    }    
    // Inserir aluno(a) no banco de dados
    private void inserir(){
        String cadastro = "INSERT INTO aluno (nome, data_nasc, idade, genero, cpf, objetivo, peso, altura, cep, cidade, bairro, uf, endereco, numero, complemento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(cadastro);
            pst.setString(1, txtNomeCad.getText());
            pst.setString(2, jformText_NasciCad.getText());
            pst.setString(3, txtIdadeCad.getText());
            pst.setString(4, CmboxGenero.getSelectedItem().toString());
            pst.setString(5, jformText_CPFCad.getText());
            pst.setString(6, CmboxObjetivo.getSelectedItem().toString());
            pst.setString(7, jformText_Peso.getText());
            pst.setString(8, jformText_Altura.getText());
            pst.setString(9, jformText_CEPCad.getText());
            pst.setString(10, txtCidade.getText());
            pst.setString(11, txtBairro.getText());
            pst.setString(12, cmbUF.getSelectedItem().toString());
            pst.setString(13, txtEndCad.getText());
            pst.setString(14, txtNumEndCad.getText());
            pst.setString(15, txtComplementoEndCad.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmboxGenero;
    private javax.swing.JComboBox<String> CmboxObjetivo;
    private javax.swing.JButton btnBuscarCep;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbUF;
    private javax.swing.JFormattedTextField jformText_Altura;
    private javax.swing.JFormattedTextField jformText_CEPCad;
    private javax.swing.JFormattedTextField jformText_CPFCad;
    private javax.swing.JFormattedTextField jformText_NasciCad;
    private javax.swing.JFormattedTextField jformText_Peso;
    private javax.swing.JLabel lblAlturaCad;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPFCad;
    private javax.swing.JLabel lblCamera;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplementoEndCad;
    private javax.swing.JLabel lblEndCad;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIdadeCad;
    private javax.swing.JLabel lblNascCad;
    private javax.swing.JLabel lblNomeCad;
    private javax.swing.JLabel lblNumEndCad;
    private javax.swing.JLabel lblObjetivoCad;
    private javax.swing.JLabel lblPesoCad;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplementoEndCad;
    private javax.swing.JTextField txtEndCad;
    private javax.swing.JTextField txtIdadeCad;
    private javax.swing.JTextField txtNomeCad;
    private javax.swing.JTextField txtNumEndCad;
    // End of variables declaration//GEN-END:variables
}
