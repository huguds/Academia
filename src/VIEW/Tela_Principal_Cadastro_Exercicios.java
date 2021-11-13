/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONEXAO.ModuloDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

    public class Tela_Principal_Cadastro_Exercicios extends javax.swing.JFrame {
        String exerciciosFormatados;
        DefaultListModel modeloExercicios = new DefaultListModel();
        DefaultListModel modeloSelecionados = new DefaultListModel();
        ArrayList arrayExercicios = new ArrayList();
        ArrayList arrayNovosExercicios = new ArrayList();
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        ImageIcon accept = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\accept64px.png");
        ImageIcon attention = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\attention64px.png");
        ImageIcon cancel = new ImageIcon("E:\\PROJETO\\Academia\\src\\IMAGES\\cancel64px.png");
        
    public Tela_Principal_Cadastro_Exercicios() {
        initComponents();  
        // Conexão com o banco de dados
        conexao = ModuloDeConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeCadEx = new javax.swing.JLabel();
        txtNomeCadExer = new javax.swing.JTextField();
        lblCodCadEx = new javax.swing.JLabel();
        txtCodCadEx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlst_Exercicios = new javax.swing.JList<>();
        lblExercicios = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlst_ExerciciosSelecionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblRepetição = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlst_Repeticoes = new javax.swing.JList<>();
        btnBuscarMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNomeCadEx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomeCadEx.setText("Nome:");

        lblCodCadEx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodCadEx.setText("Código/Matricula");

        jlst_Exercicios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pulley Triceps", "Triceps Paralela", "Triceps Barra W", "Rosca Alternada", "Biceps Martelo", "Biceps Scott" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlst_Exercicios);

        lblExercicios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblExercicios.setText("Exercicios:");

        jScrollPane2.setViewportView(jlst_ExerciciosSelecionados);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Exercicios Selecionados:");

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblRepetição.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRepetição.setText("Repetição:");

        jlst_Repeticoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "3x 10 rep", "3x 12 rep", "3x 15 rep", "4x 10 rep", "4x 12 rep", "4x 15 rep" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jlst_Repeticoes);

        btnBuscarMatricula.setText("Buscar");
        btnBuscarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelecionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodCadEx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarMatricula))
                            .addComponent(lblCodCadEx)
                            .addComponent(txtNomeCadExer, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCadEx)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblExercicios)
                                    .addGap(30, 30, 30)
                                    .addComponent(lblRepetição))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblCodCadEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodCadEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarMatricula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeCadEx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeCadExer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblExercicios)
                                    .addComponent(lblRepetição))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(btnSelecionar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCadastrar)
                                    .addComponent(btnExcluir))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(524, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        // Selecionar os Exercicios de uma lista e passar para a outra
        adicionarItens();
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Excluir Exercícios selecionados
        excluirItem();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMatriculaActionPerformed
        // Busca o aluno no banco de dados
        consultarAlunos();
    }//GEN-LAST:event_btnBuscarMatriculaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Altera e adiciona os exercicios ao aluno
        adicionaExercicios();
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
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro_Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro_Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro_Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Cadastro_Exercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal_Cadastro_Exercicios().setVisible(true);
            }
        });
    }
    
    // Adiciona os elementos das listas a uma outra lista
    public void adicionarItens(){
        
        if(jlst_Exercicios.isSelectionEmpty() || jlst_Repeticoes.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "É necessário selecionar os Exercícios e as Repetições","Gym_Academy",JOptionPane.INFORMATION_MESSAGE,attention);
        }
        else{
            
            String listaExercicios = jlst_Exercicios.getSelectedValue().toString();
            String listaRepeticoes = jlst_Repeticoes.getSelectedValue().toString();
        
            exerciciosFormatados = listaExercicios +" | "+ listaRepeticoes;
        
            arrayExercicios.add(exerciciosFormatados);

            modeloExercicios.addElement(exerciciosFormatados);
        
            jlst_ExerciciosSelecionados.setModel(modeloExercicios);
            
            // Limpa as listas de seleções
            jlst_Exercicios.clearSelection();
            jlst_Repeticoes.clearSelection();
            
        }
    }
    // Excluir elementos da lista
    public void excluirItem(){
        
        String novosExercicios = "";
        
        arrayNovosExercicios.add(novosExercicios);
        
        modeloSelecionados.addElement(novosExercicios);
        
        jlst_ExerciciosSelecionados.setModel(modeloSelecionados);
        
    }
    // Consultar alunos
    private void consultarAlunos(){
        String sql = "Select * from aluno where matricula=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodCadEx.getText());
            rs=pst.executeQuery();
            if (rs.next()) {
                txtNomeCadExer.setText(rs.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Aluno(a) não cadastrado","Gym_Academy",JOptionPane.INFORMATION_MESSAGE,cancel);
                txtCodCadEx.setText(null);
                txtNomeCadExer.setText(null);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    // Adicionar exercicios aos alunos
    private void adicionaExercicios(){
        String sql = "update aluno set exercicios=?";
        String allitem="";
    for(int i = 0;i<jlst_ExerciciosSelecionados.getModel().getSize();i++)
    {
        allitem = (String)jlst_ExerciciosSelecionados.getModel().getElementAt(i)+" "+allitem;
    }
    try{
        pst = conexao.prepareStatement(sql);
        pst.setString(1, allitem);
        
        if((txtCodCadEx.getText().isEmpty()))
            {
                 JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios","Gym_Academy",JOptionPane.INFORMATION_MESSAGE,attention);
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0){
                    JOptionPane.showMessageDialog(null, "Exercícios incluidos com sucesso","Gym_Academy",JOptionPane.INFORMATION_MESSAGE,accept);
                    txtCodCadEx.setText(null);
                    txtNomeCadExer.setText(null);
                }
            }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMatricula;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jlst_Exercicios;
    private javax.swing.JList<String> jlst_ExerciciosSelecionados;
    private javax.swing.JList<String> jlst_Repeticoes;
    private javax.swing.JLabel lblCodCadEx;
    private javax.swing.JLabel lblExercicios;
    private javax.swing.JLabel lblNomeCadEx;
    private javax.swing.JLabel lblRepetição;
    private javax.swing.JTextField txtCodCadEx;
    private javax.swing.JTextField txtNomeCadExer;
    // End of variables declaration//GEN-END:variables
}
